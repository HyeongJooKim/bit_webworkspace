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
//1. ���� �Է�â�� �Է��ϰ� ����(�Ǵ� ����)�� ģ �޽����� ä��â�� ���.
////- ���� ���� ���� ����.
//2. �ٸ� ����� �Է��� ���뵵 ä��â�� ��� (IP �ּҷ� ������ Ȯ��)
//3. App�� �����ϸ� ä�� �����
//4. �Է��� ����� identity�� IP �ּҰ� �ƴ� personalized id �� ����� �� �ִ�.
////- ���� ���� ����.
//UI �䱸����
//1. ���� ä��â : �Է±�� ���� ���̱⸸ �� ��, ���� ��ũ�� �ʿ�
//2. �޽��� �Է�â: TextField �Ǵ� TextArea�� �Է��Ͽ� ����(�Ǵ� ���۹�ư ������?)ġ�� �޽��� �Էµ�
////- TA �ߴ��� ���ͷδ� �ȵ�.
//3. �⺻�� ����ä�ù�����
//4. �����ڸ�� ���̱�

//6-15 ���� 1: TA���� Enter �ĵ� �۽ŵǰ�
//6-15 ���� 2: Dialog���� �г��� �ޱ�
//6-16 ���� 1: ���� ó�� >> flush(); ���Ѱ� ��������
//6-16 ���� 2: ������ ����� ��� ���̱� 
//6-16 ���� 3: ��ȭ�� �Է� �ݵ�� �ϰ� 
//����: �� �޽���-�� ����, �ٸ� ����� �޽���-�� ����

public class BMClient extends Frame {

   TextArea chatView;// �������� �Է��� ���� ���� ������� ��.
   TextArea chatInput;// �Է��� ���� �޾ƿ;� ��.
   TextArea memberList;// �����ϴ� ������� �̸��� ���� ����
   String title = "���ٹ� v 0.1.0";
   Button bSend;
   Button bExit;
   Socket sock;
   static List list;
   static int cnt = 0;// ������ ��
   // static ArrayList<String> members=new ArrayList<>();//������ ���
   Dialog dialog2;
   Button exitYes;
   Button exitNo;

   public BMClient(Socket sock) {
      // Socket ���
      this.sock = sock;

      BorderLayout layout = new BorderLayout(5, 5);
      BorderLayout layoutS = new BorderLayout(5, 5);
      GridLayout layoutSE = new GridLayout(2, 1);
      setLayout(layout);
      Font fontCenter = new Font(Font.MONOSPACED, Font.CENTER_BASELINE, 15);

      // Center ä�ú���
      chatView = new TextArea("", 40, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
      chatView.setEditable(false);
      Panel center = new Panel();
      center.add(chatView);
      add(BorderLayout.CENTER, center);

      // East �������
      list = new List(40);
      Panel east = new Panel();
      east.add(list);
      add(BorderLayout.EAST, east);

      // South �Է�â
      chatInput = new TextArea("", 5, 40, TextArea.SCROLLBARS_NONE);// �Է��� ����
                                                      // �޾ƿ;�
                                                      // ��.
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

      // ����, ���� ��ư
      bSend = new Button("������");
      bSend.setEnabled(false);
      bSend.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            sendMessage();
         }
      });

      bExit = new Button("��������");
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

      // ��ȭ���Է�â
      Dialog dialog = new Dialog(this, title);
      dialog.setLayout(null);
      dialog.setSize(getWidth(), getHeight());
      dialog.setLocation(getX(), getY());
      dialog.setVisible(true);
      // Panel pDialog=new Panel();

      // �̹�������
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

      // ��ȭ�� �Է� ��&�ʵ�
      Label laName = new Label("��ȭ���� �Է��ϼ���");
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
      // �����ϱ� ��ư
      JButton bEnter = new JButton("�����ϱ�");
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

      // ��ȭ�� ������ Ȯ��â
      dialog2 = new Dialog(this, "����");
      Label msg = new Label("���ٹ濡�� �����ðڽ��ϱ�?", Label.CENTER);

      dialog2.setLayout(new FlowLayout());
      exitYes = new Button("��");
      exitYes.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            quitChat();
         }
      });

      exitNo = new Button("�ƴϿ�");
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
   }// ������ ����

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
      String ip = "192.168.0.192";// ��ip
      // String ip="192.168.0.188";//������ip
      // String ip="192.168.0.169";//������ ip
      // String ip="192.168.0.192";//������ip//server ��� �Ұ�
      int port = 8080;
      Socket sock = null;
      InputStream is = null;
      InputStreamReader isr = null;
      BufferedReader br = null;

      // Server���� sock���� ���޹��� ���� �о���̱�
      try {
         sock = new Socket(ip, port);
         BMClient client = new BMClient(sock);
         is = sock.getInputStream();
         isr = new InputStreamReader(is);
         br = new BufferedReader(isr);

         while (true) {
            String view = br.readLine();
            if (view.charAt(0) == '[') {// ����, ���� �߻��� ���
               list.removeAll();
               String temp = view.substring(1, view.length() - 1);// []����
               String[] temp2 = temp.split(",");// ������ ���
               for (int i = 0; i < temp2.length; i++) {
                  list.addItem(temp2[i].trim());
               }
            } else {// �Ϲ� ä��
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
