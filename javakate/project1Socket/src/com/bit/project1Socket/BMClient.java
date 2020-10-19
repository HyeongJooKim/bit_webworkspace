package com.bit.project1Socket;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

//Client stories:
//1. 내가 입력창에 입력하고 엔터(또는 전송)를 친 메시지가 채팅창에 뜬다.
////- 엔터 아직 구현 못함.
//2. 다른 사람이 입력한 내용도 채팅창에 뜬다 (IP 주소로 누군지 확인)
//3. App을 종료하면 채팅 종료됨
//4. 입력한 사람의 identity를 IP 주소가 아닌 personalized id 를 사용할 수 있다.
////- 아직 구현 못함.
//UI 요구사항
//1. 메인 채팅창 : 입력기능 없이 보이기만 할 것, 상하 스크롤 필요
//2. 메시지 입력창: TextField 또는 TextArea로 입력하여 엔터(또는 전송버튼 누르기?)치면 메시지 입력됨
////- TA 했더니 엔터로는 안됨.
//3. 기본은 오픈채팅방으로
//4. 참여자명단 보이기

//6-15 할일 1: TA에서 Enter 쳐도 송신되게
//6-15 할일 2: Dialog에서 닉네임 받기
//6-16 할일 1: 종료 처리 >> flush(); 안한게 문제였음
//6-16 할일 2: 입장한 사람들 목록 보이기 
//6-16 할일 3: 대화명 입력 반드시 하게 
//도전: 내 메시지-우 정렬, 다른 사람들 메시지-좌 정렬

public class BMClient extends Frame {

   TextArea chatView;// 여러명이 입력한 값을 여기 보여줘야 함.
   TextArea chatInput;// 입력한 값을 받아와야 함.
   TextArea memberList;// 입장하는 사람들의 이름을 여기 띄우기
   String title = "수다방 v 0.1.0";
   Button bSend;
   Button bExit;
   Socket sock;
   static List list;
   static int cnt = 0;// 참여자 수
   // static ArrayList<String> members=new ArrayList<>();//참여자 명단
   Dialog dialog2;
   Button exitYes;
   Button exitNo;

   public BMClient(Socket sock) {
      // Socket 통신
      this.sock = sock;

      BorderLayout layout = new BorderLayout(5, 5);
      BorderLayout layoutS = new BorderLayout(5, 5);
      GridLayout layoutSE = new GridLayout(2, 1);
      setLayout(layout);
      Font fontCenter = new Font(Font.MONOSPACED, Font.CENTER_BASELINE, 15);

      // Center 채팅보기
      chatView = new TextArea("", 40, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
      chatView.setEditable(false);
      Panel center = new Panel();
      center.add(chatView);
      add(BorderLayout.CENTER, center);

      // East 멤버보기
      list = new List(40);
      Panel east = new Panel();
      east.add(list);
      add(BorderLayout.EAST, east);

      // South 입력창
      chatInput = new TextArea("", 5, 40, TextArea.SCROLLBARS_NONE);// 입력한 값을
                                                      // 받아와야
                                                      // 함.
      chatInput.setEnabled(false);
      chatInput.addKeyListener(new KeyAdapter() {
         public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
               sendMessage();
            }
         }
      });
      Panel south = new Panel();
      south.setLayout(layoutS);
      south.add(BorderLayout.CENTER, chatInput);

      // 전송, 종료 버튼
      bSend = new Button("보내기");
      bSend.setEnabled(false);
      bSend.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            sendMessage();
         }
      });

      bExit = new Button("수다종료");
      bExit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            dialog2.setVisible(true);
         }
      });

      Panel southEast = new Panel();
      southEast.setLayout(layoutSE);
      southEast.add(bSend);
      southEast.add(bExit);
      south.add(BorderLayout.EAST, southEast);
      add(BorderLayout.SOUTH, south);

      // Frame
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            dialog2.setVisible(true);
         }
      });
      setTitle(title);
      setSize(500, 700);
      setLocation(10, 100);
      setVisible(true);
      pack();

      // 대화명입력창
      Dialog dialog = new Dialog(this, title);
      dialog.setLayout(null);
      dialog.setSize(getWidth(), getHeight());
      dialog.setLocation(getX(), getY());
      dialog.setVisible(true);
      // Panel pDialog=new Panel();

      // 이미지삽입
      Toolkit toolkit = this.getToolkit();
      Image data = toolkit
            .getImage("C:\\javaWorkspace\\project01\\image\\icon01.png");
      Icon icon = new ImageIcon(data);
      JLabel bImage = new JLabel(icon);
      dialog.add(bImage);
      bImage.setSize(350, 350);
      bImage.setVisible(true);
      bImage.setLocation(getX() + getWidth() / 2 - bImage.getWidth() / 2,
            getY() + getHeight() / 2 - bImage.getHeight());

      // 대화명 입력 라벨&필드
      Label laName = new Label("대화명을 입력하세요");
      dialog.add(laName);
      laName.setFont(fontCenter);
      laName.setSize(300, 30);
      laName.setLocation(getX() + getWidth() / 2 - laName.getWidth() / 2, 520);
      TextField tfName = new TextField();
      dialog.add(tfName);
      tfName.setSize(300, 30);
      tfName.setFont(fontCenter);
      // tfName.setLocation(getX()+getWidth()/2-tfName.getWidth()/2,
      // getY()+getHeight()/2+bImage.getHeight()/2);
      tfName.setLocation(getX() + getWidth() / 2 - tfName.getWidth() / 2, 550);
      tfName.addKeyListener(new KeyAdapter() {
         public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
               if ((tfName.getText().isEmpty())) {
                  dialog.requestFocus();
                  return;

               } else {
                  OutputStream os = null;
                  OutputStreamWriter osw = null;
                  BufferedWriter bw = null;
                  try {
                     os = sock.getOutputStream();
                     osw = new OutputStreamWriter(os);
                     bw = new BufferedWriter(osw);
                     bw.write("join:" + tfName.getText());
                     bw.newLine();
                     bw.flush();
                  } catch (IOException e1) {
                     e1.printStackTrace();
                  }
                  dialog.dispose();
                  chatInput.setEnabled(true);
                  chatInput.requestFocus();
                  bSend.setEnabled(true);
               }
            }
         }
      });
      // 입장하기 버튼
      JButton bEnter = new JButton("입장하기");
      dialog.add(bEnter);
      bEnter.setSize(300, 30);
      // bEnter.setFont(fontCenter);
      // bEnter.setLocation(getX()+getWidth()/2-bEnter.getWidth()/2,
      // getY()+getHeight()/2+bImage.getHeight()/2+tfName.getHeight());
      bEnter.setLocation(getX() + getWidth() / 2 - bEnter.getWidth() / 2, 580);
      bEnter.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            if ((tfName.getText().isEmpty())) {
               dialog.requestFocus();
               return;

            } else {
               OutputStream os = null;
               OutputStreamWriter osw = null;
               BufferedWriter bw = null;
               try {
                  os = sock.getOutputStream();
                  osw = new OutputStreamWriter(os);
                  bw = new BufferedWriter(osw);
                  bw.write("join:" + tfName.getText());
                  bw.newLine();
                  bw.flush();
               } catch (IOException e1) {
                  e1.printStackTrace();
               }
               dialog.dispose();
               chatInput.setEnabled(true);
               chatInput.requestFocus();
               bSend.setEnabled(true);
            }
         }
      });

      // 대화방 나가기 확인창
      dialog2 = new Dialog(this, "종료");
      Label msg = new Label("수다방에서 나가시겠습니까?", Label.CENTER);

      dialog2.setLayout(new FlowLayout());
      exitYes = new Button("네");
      exitYes.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            quitChat();
         }
      });

      exitNo = new Button("아니오");
      exitNo.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            dialog2.dispose();
         }
      });
      dialog2.add(msg);
      dialog2.add(exitYes);
      dialog2.add(exitNo);

      dialog2.setSize(getWidth(), getHeight());
      dialog2.setLocation(getX(), getY());
      dialog2.setVisible(false);
   }// 생성자 종료

   private void sendMessage() {
      OutputStream os = null;
      OutputStreamWriter osw = null;
      BufferedWriter bw = null;

      try {
         os = sock.getOutputStream();
         osw = new OutputStreamWriter(os);
         bw = new BufferedWriter(osw);
         bw.write("message:" + chatInput.getText());
         bw.newLine();
         bw.flush();
         chatInput.replaceRange("", 0, chatInput.getText().length());
         chatInput.requestFocus();
      } catch (IOException e1) {
         e1.printStackTrace();
      }
   }

   private void quitChat() {
      OutputStream os = null;
      OutputStreamWriter osw = null;
      BufferedWriter bw = null;

      try {
         os = sock.getOutputStream();
         osw = new OutputStreamWriter(os);
         bw = new BufferedWriter(osw);
         bw.write("quit:\r\n");
         bw.newLine();
         bw.flush();
         dispose();
      } catch (IOException e1) {
         e1.printStackTrace();
      }
   }

   public static void main(String[] args) {
      String ip = "192.168.0.192";// 내ip
      // String ip="192.168.0.188";//성범씨ip
      // String ip="192.168.0.169";//선생님 ip
      // String ip="192.168.0.192";//병무씨ip//server 기능 불가
      int port = 8080;
      Socket sock = null;
      InputStream is = null;
      InputStreamReader isr = null;
      BufferedReader br = null;

      // Server에서 sock으로 전달받은 내용 읽어들이기
      try {
         sock = new Socket(ip, port);
         BMClient client = new BMClient(sock);
         is = sock.getInputStream();
         isr = new InputStreamReader(is);
         br = new BufferedReader(isr);

         while (true) {
            String view = br.readLine();
            if (view.charAt(0) == '[') {// 입장, 퇴장 발생한 경우
               list.removeAll();
               String temp = view.substring(1, view.length() - 1);// []제거
               String[] temp2 = temp.split(",");// 참여자 목록
               for (int i = 0; i < temp2.length; i++) {
                  list.addItem(temp2[i].trim());
               }
            } else {// 일반 채팅
               client.chatView.append(view + "\n");
            }
         }
      } catch (UnknownHostException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         try {
            if (br != null)
               br.close();
            if (isr != null)
               isr.close();
            if (is != null)
               is.close();
            if (sock != null)
               sock.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }// main end
}// Client class end
