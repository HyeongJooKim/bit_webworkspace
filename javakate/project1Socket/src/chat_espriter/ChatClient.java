package chat_espriter;

//https://note.espriter.net/1099

import java.awt.Color;
import java.awt.Dimension;
import java.awt.List;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class ChatClient extends JFrame implements ActionListener, Runnable {

	private JLabel la1=new JLabel();
	private JTextField tfName=new JTextField();
	private JTextField tfSend=new JTextField();
	private JButton bConn=new JButton();
	private JButton bChange=new JButton();
	private JRadioButton radio1=new JRadioButton();
	private JRadioButton radio2=new JRadioButton();
	private JScrollPane sp=new JScrollPane();
	private JTextArea ta=new JTextArea();
	private JButton bOk=new JButton();
	private JLabel la2=new JLabel();
	private JLabel la3=new JLabel();
	private JLabel la4=new JLabel();
	private JButton bClose=new JButton();
	private List list=new List();
	
	private BufferedReader br;
	private OutputStream os;
	private Socket sock;
	
	int count=0;//접속 인원수
	
	public ChatClient() {
	//try catch 추가해야 하는 듯
		chatWindow();
		addListener();
	}
	
	private void chatWindow() {//jbInit()에서 이름 바꿈
		this.getContentPane().setLayout(null);//새로운 것들이네
		this.setSize(new Dimension(652, 264));
		this.setTitle("채팅 프로그램");
		this.setBackground(new Color(198, 214, 255));
		//첫줄
		la1.setText("대화명");
		la1.setBounds(new Rectangle(15, 10, 45, 25));
		tfName.setBounds(new Rectangle(60, 10, 105, 25));
		bConn.setText("접속");
		bConn.setBounds(new Rectangle(165, 10, 60, 25));
		bChange.setText("대화명변경");
		bChange.setBounds(new Rectangle(230, 10, 110, 25));
		radio1.setText("귓속말");
		radio1.setBounds(new Rectangle(345, 10, 70, 25));
		radio1.setText("귓속말해제");
		radio1.setBounds(new Rectangle(420, 10, 90, 25));
		ButtonGroup group=new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		
		sp.setBounds(new Rectangle(15, 40, 495, 155));
		//바닥줄
		tfSend.setBounds(new Rectangle(15, 200, 435, 25));
		bOk.setText("확인");
		bOk.setBounds(new Rectangle(450, 200, 60, 25));
		bClose.setText("나가기");
		bClose.setBounds(new Rectangle(530, 200, 90, 25));
		
		//오른쪽
		la2.setText("접속자 목록");
		la2.setBounds(new Rectangle(520, 10, 75, 20));
		list.setBounds(new Rectangle(525, 40, 110, 120));
		la3.setText("인원:");
		la3.setBounds(new Rectangle(530, 170, 35, 25));
		la4.setText("0");
		la4.setBounds(new Rectangle(565, 170, 50, 25));
		la4.setBackground(new Color(198,198,200));
		la4.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		la4.setHorizontalAlignment(SwingConstants.CENTER);
		la4.setHorizontalTextPosition(SwingConstants.CENTER);
		
		this.getContentPane().add(la1, null);
		this.getContentPane().add(tfName, null);
		this.getContentPane().add(bConn, null);
		this.getContentPane().add(bChange, null);
		this.getContentPane().add(radio1, null);
		this.getContentPane().add(radio2, null);
		this.getContentPane().add(sp, null);
		this.getContentPane().add(tfSend, null);
		this.getContentPane().add(bOk, null);
		this.getContentPane().add(bClose, null);
		this.getContentPane().add(la2, null);
		this.getContentPane().add(list, null);
		this.getContentPane().add(la3, null);
		this.getContentPane().add(la4, null);
		sp.getViewport().add(ta,null);
	}
	
	private void addListener() {
		tfName.addActionListener(this);
		bConn.addActionListener(this);
		bChange.addActionListener(this);
		tfSend.addActionListener(this);
		bOk.addActionListener(this);
		bClose.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tfName || e.getSource()==bConn){
			//대화명 입력 후 접속
			if(tfName.getText().equals("")){//이름 입력 안하면 - 이거 써먹을 수 있겠다
				JOptionPane.showMessageDialog(this, "대화명입력");
				tfName.requestFocus();
				return;
			}
			try {
				sock=new Socket("192.168.0.193", 8088);
				br=new BufferedReader(new InputStreamReader(sock.getInputStream(), "euc-kr"));
				os=sock.getOutputStream();
				os.write((tfName.getText()+"\n").getBytes("euc-kr"));
				new Thread(this).start();//run을 호출
			} catch (Exception e1) {
				System.out.println("접속오류:"+e1);
			}
		}else if(e.getSource()==tfSend || e.getSource()==bOk){
			//메시지 전송
			try {
				if(radio1.isSelected()){//귓속말 메시지. 어떻게 그사람에게만 보내지???
					String name=list.getSelectedItem();//명단에서 선택된 사람 이름
					os.write(("/s"+name+"-"+tfSend.getText()+"\n").getBytes("euc-kr"));
					ta.append(name+"님에게 귓속말이 전달되었습니다.\n");
				}else{//일반 메시지
					os.write((tfSend.getText()+"\n").getBytes("euc-kr"));
				}
				tfSend.setText("");//내용 지우기
				tfSend.requestFocus();
			} catch (Exception e1) {
				System.out.println("메세지 전송 오류:"+e1);
			}
		}else if(e.getSource()==bChange){
			//대화명 변경
			if(bChange.getText().equals("대화명변경")){//이건 늘 true아닌가? 왜 클릭했을 때로 조건 달지 않지?
				bChange.setText("변경확인");//오호 버튼의 글씨를 바꾸네
				tfName.setEditable(true);
				tfName.requestFocus();
			}else{
				bChange.setText("대화명변경");
				tfName.setEditable(false);
				try {
					os.write(("/r"+tfName.getText()+"\n").getBytes("euc-kr"));
				} catch (Exception e1) {
					System.out.println("대화명 변경 오류:"+e1);
				}
			}
		}else if(e.getSource()==bClose){
			//나가기
			try {
				os.write(("/q\n").getBytes());
				br.close();
				os.close();
				sock.close();
			} catch (Exception e1) {
				System.out.println("나가기 오류:"+e1);
			} finally{
				System.exit(0);
			}
		}
	}
	
	public void run() {
		while(true){
			try {
				String msg=br.readLine();//서버로부터 메세지 수신
				if(msg==null || msg.equals("")) return;
				if(msg.charAt(0)=='/'){//이걸 신호로 했군
					if(msg.charAt(1)=='c'){//입장. 'c' 서버에서 넣음
						list.add(msg.substring(2),count);
						count++;
						la4.setText(String.valueOf(count));//총 인원수 표시
						ta.append("**"+msg.substring(2)+"님이 입장했습니다.\n");
						tfName.setEditable(false);//대화명 더이상 입력 불가
						bConn.setEnabled(false);
					}else if(msg.charAt(1)=='q'){//퇴장
						ta.append("^^"+msg.substring(2)+"님이 퇴장했습니다.\n");
						String cname=msg.substring(2);
						for(int i=0; i<count; i++){
							if(cname.equals(list.getItem(i))){
								list.remove(i);
								count--;
								la4.setText(String.valueOf(count));
								break;
							}
						}
					}else if(msg.charAt(1)=='r'){//대화명 변경
						String oldName=msg.substring(2, msg.indexOf('-'));//'-' 서버에서 넣음
						String newName=msg.substring(msg.indexOf('-')+1);
						ta.append("*"+oldName+"님의 대화명이"+newName+"으로 변경되었습니다.\n");
						for(int i=0; i<count; i++){
							if(oldName.equals(list.getItem(i))){
								list.replaceItem(newName, i);
								break;
							}
						}
					}
				}else{//일반 메세지. 비밀 메세지는 서버에서 처리
					ta.append(msg+"\n");
				}
			} catch (Exception e) {
				System.out.println("run error:"+e);
			}
		}//while end
	}//run() end
	
	public static void main(String[] args) {
		ChatClient fr=new ChatClient();
		fr.getPreferredSize();
		fr.setLocation(200, 200);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//이런건 좀 좋네		
	}
}
