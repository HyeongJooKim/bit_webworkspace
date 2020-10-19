package chattingRed;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
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
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

//사용자 요구사항
	//원하는 대화명을 입력하고 채팅방에 입장한다. (대화명 중복 금지, 길이 제한)
	//입력창에 입력하고 엔터/보내기 하면  메시지가 채팅창으로 전송된다.
	//채팅에 참여중인 사람들의 명단을 볼 수 있다.
//UI 요구사항
	//대화명 입력창: 대화명 길이 한글 8자, 영문 16자 이내, 대화명 중복 금지.
	//메인화면: 채팅영역, 참여자명단, 입력창으로 구성
		//채팅창 : 입력기능 없이 보이기만 할 것, 상하 스크롤 필요. 오픈채팅방
		//입력창 :  메시지 입력한 후  엔터(또는 전송버튼 누르기)치면 메시지 전송됨.
		//참여자명단 보이기
	//종료확인창: 종료의사 다시 한 번 확인
//Server 요구사항
	//여러명이 동시에 접속할 수 있도록 Thread 작업


public class Client extends Frame {

	TextArea chatView, chatInput;
	String title="까까오똑 v1.0.0";
	Button bSend, bExit, bReport, exitYes, exitNo;
	Socket sock;
	static List list;
	static ArrayList<String> members=new ArrayList<>();//참여자 명단
	static int count;	
	Dialog dialog, dialog2;
	static String nickName;
	String membersString, data;
	TextField tfName;
	Label laName; 
	static Label laCount;
	OutputStream os=null;
	OutputStreamWriter osw=null;
	BufferedWriter bw=null;

	public Client(Socket sock){
		//Socket 통신
		this.sock=sock;
		
		BorderLayout layout=new BorderLayout(1,1);
		BorderLayout layoutS=new BorderLayout(1,1);
		GridLayout layoutSE=new GridLayout(2,1);
		setLayout(layout);
		Font fontCenter=new Font(Font.MONOSPACED, Font.BOLD, 12);
		Font fontName=new Font(Font.MONOSPACED, Font.BOLD, 34);
		
		//Center 채팅보기
		String notice=""
				+ "*******************************************************\n"
				+ "   까까오똑 v1.0.0에 오신 것을 환영합니다.\n"
				+ "*******************************************************\n"
				+ "   까까오똑은 누구나 입장할 수 있는 오픈 채팅방입니다.\n"
				+ "   욕설, 비방, 혐오 표현 등은 삼가해 주세요.\n"
				+ "*******************************************************\n"
				+ "   닉네임을 누르고 하단의 '신고하기'를 누르면\n"
				+ "   해당 닉네임에 대한 신고가 모두에게 공지됩니다.\n"
				+ "*******************************************************\n\n"
				+ "";
		chatView=new TextArea(notice,40,50,TextArea.SCROLLBARS_VERTICAL_ONLY);
		chatView.setEditable(false);
		Panel center=new Panel();
		center.add(chatView);
		add(BorderLayout.CENTER,center);

		//East 멤버보기. 신고하기
		Panel east=new Panel();
		east.setLayout(new BorderLayout());
		east.setSize(10, 40);
		add(BorderLayout.EAST,east);
		Panel east2=new Panel();
		east2.setLayout(new BorderLayout());
		east.add(east2);
		list=new List(30);
		east2.add(BorderLayout.CENTER,list);
		laCount=new Label("총 0 명 참여중");
		east2.add(BorderLayout.SOUTH,laCount);
		bReport=new Button("신고하기");
		bReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data="outCnt:"+list.getSelectedItem();
				System.out.println(list.getSelectedItem());
				int id=list.getSelectedIndex();
				System.out.println(id);
				sendMsg(data);
			}
		});
		east.add(BorderLayout.SOUTH,bReport);
		east.add(east2);
	
		//South 입력창
		chatInput=new TextArea("",5,40,TextArea.SCROLLBARS_NONE);//입력한 값을 받아와야 함.
		chatInput.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					sendChat();
				}
			}
		});
		Panel south=new Panel();
		south.setLayout(layoutS);
		south.add(BorderLayout.CENTER, chatInput);

		//전송, 종료 버튼
		bSend=new Button("보내기");
		bSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendChat();
			}
		});

		bExit=new Button("나가기");
		bExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog2.setVisible(true);
			}
		});

		Panel southEast=new Panel();
		southEast.setLayout(layoutSE);
		southEast.add(bSend);
		southEast.add(bExit);
		south.add(BorderLayout.EAST, southEast);
		add(BorderLayout.SOUTH,south);
				
		//Frame
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dialog2.setVisible(true);
			}
		});
		setTitle(title);
		setSize(500,700);
		setLocation(10,100);
		setResizable(false);
		pack();
		
		//대화명입력창
		dialog=new Dialog(this, title);
		dialog.setLayout(null);
		dialog.setSize(getWidth(), getHeight());
		dialog.setLocation(getX(), getY());
		dialog.setBackground(new Color(217, 244, 249));
		dialog.setVisible(true);
		dialog.setResizable(false);

		//이미지삽입
	    Toolkit toolkit = this.getToolkit();
	    Image data = toolkit
	          .getImage("C:\\javakate\\project1Socket\\image\\1.png");
	    Icon icon = new ImageIcon(data);
	    JLabel bImage = new JLabel(icon);
	    dialog.add(bImage);
	    bImage.setSize(350, 350);
	    bImage.setVisible(true);
	    bImage.setLocation(getX()+getWidth()/2-bImage.getWidth()/2,
	    		getY()+getHeight()/2-bImage.getHeight());
		
	    //대화명 입력 라벨&필드
		laName=new Label("대화명을 입력하세요 (한글8자, 영문16자 이내)");
		dialog.add(laName);
		laName.setFont(fontCenter);
		laName.setSize(300, 30);
		laName.setBackground(new Color(217, 244, 249));
		laName.setLocation(getX()+getWidth()/2-laName.getWidth()/2, 520);
		tfName=new TextField();
		dialog.add(tfName);
		tfName.requestFocus();
		tfName.setSize(300, 45);
		tfName.setFont(fontName);
		tfName.setLocation(getX()+getWidth()/2-tfName.getWidth()/2, 550);
		tfName.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					nickNameCheck();
				}
			}
		});
		
		//입장하기 버튼
		JButton bEnter=new JButton("입장하기");
		dialog.add(bEnter);
		bEnter.setSize(300, 30);
		bEnter.setBackground(new Color(111, 214, 237));
		bEnter.setLocation(getX()+getWidth()/2-bEnter.getWidth()/2, 600);
		bEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nickNameCheck();
			}
		});
		
		//Dialog 닫기
		dialog.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dialog2.setVisible(true);
			}
		});
		
		//대화방 나가기 확인창
		dialog2 = new Dialog(this, "종료");
		Label msg = new Label("까까오똑을 종료하시겠습니까?", Label.CENTER);
	
		dialog2.setLayout(new FlowLayout());
		exitYes = new Button("네");
		exitYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quitChat();
			}
		});
		
		exitNo = new Button("아니오");
		exitNo.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				dialog2.dispose();
		    }
		});
		dialog2.add(msg);
		dialog2.add(exitYes);
		dialog2.add(exitNo);
		dialog2.setSize(290,63);
		dialog2.setLocation(getX()+getWidth()/2-dialog2.getWidth()/2, getY()+getHeight()/2-dialog2.getHeight()/2);
		dialog2.setVisible(false);
		dialog2.setResizable(false);
	}//생성자 종료
	
	public void nickNameCheck(){
		nickName=tfName.getText();
		if((tfName.getText().isEmpty())){
		}else if(members.contains(nickName)){//이미 있는 이름과 중복이면??
			laName.setText("이미 사용중인 이름입니다. 다시 입력하세요.");
			tfName.setText("");
		}else if(nickName.getBytes().length>16){//이름 길면
			laName.setText("한글8자,영문16자 이내의 대화명을 입력하세요");
		}else{
			members.add(nickName);
			data="join:"+tfName.getText();
			sendMsg(data);
			dialog.dispose();
			setVisible(true);
			chatInput.requestFocus();
		}
	}
	
	private void sendMsg(String msg2) {
		try {
			os=sock.getOutputStream();
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);
			bw.write(msg2);
			bw.newLine();
			bw.flush();
		} catch (Exception e1) {
			System.out.println("Client.sendMsg() 오류: "+e1);
		}
	}

	private void sendChat() {
		String msg="message:"+chatInput.getText();
		sendMsg(msg);
		chatInput.replaceRange("", 0, chatInput.getText().length());
		chatInput.requestFocus();
	}
	
	private void quitChat() {
		String msg="quit:\r\n";
		sendMsg(msg);
		dispose();
	}

	public static void main(String[] args) {
		String ip="192.168.0.193";//내ip
//		String ip="192.168.0.188";//성범씨ip
//		String ip="192.168.0.169";//선생님 ip
//		String ip="192.168.0.192";//병무씨ip//server 기능 불가		
		int port=8080;
		Socket sock=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		//Server에서 sock으로 전달받은 내용 읽어들이기 
		try {
			sock=new Socket(ip, port);
			Client client=new Client(sock);
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			while(true){
				String view=br.readLine();
				if(view.charAt(0)=='['){//입장, 퇴장 발생한 경우
					list.removeAll();
					String temp=view.substring(1,view.length()-1);//[]제거
					String[] temp2=temp.split(",");//참여자 목록
					for(int i=0; i<temp2.length; i++){
							members.add(temp2[i].trim());
							list.addItem(temp2[i].trim());
					}
					laCount.setText("총 "+list.getItemCount()+"명 참여중");
				}else{//일반 채팅
					client.chatView.append(view+"\n\n");
				}
			}
		} catch (Exception e) {
			System.out.println("Client main input error: "+e);
		} finally{
			try {
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
			} catch (Exception e) {
				System.out.println("Client main input close error: "+e);
			}
		}
	}//main end
}//Client class end