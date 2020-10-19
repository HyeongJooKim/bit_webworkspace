package chatting;

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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

//����� �䱸����
	//���ϴ� ��ȭ���� �Է��ϰ� ä�ù濡 �����Ѵ�. (��ȭ�� �ߺ� ����, ���� ����)
	//�Է�â�� �Է��ϰ� ����/������ �ϸ�  �޽����� ä��â���� ���۵ȴ�.
	//ä�ÿ� �������� ������� ����� �� �� �ִ�.
//UI �䱸����
	//��ȭ�� �Է�â: ��ȭ�� ���� �ѱ� 8��, ���� 16�� �̳�, ��ȭ�� �ߺ� ����.
	//����ȭ��: ä�ÿ���, �����ڸ��, �Է�â���� ����
		//ä��â : �Է±�� ���� ���̱⸸ �� ��, ���� ��ũ�� �ʿ�. ����ä�ù�
		//�Է�â :  �޽��� �Է��� ��  ����(�Ǵ� ���۹�ư ������)ġ�� �޽��� ���۵�.
		//�����ڸ�� ���̱�
	//����Ȯ��â: �����ǻ� �ٽ� �� �� Ȯ��
//Server �䱸����
	//�������� ���ÿ� ������ �� �ֵ��� Thread �۾�


public class Client extends Frame {

	TextArea chatView, chatInput;
	String title="������ v1.0.0";
	Button bSend, bExit, exitYes, exitNo;
	Socket sock;
	static List list;
	static ArrayList<String> members=new ArrayList<>();//������ ���
	Dialog dialog, dialog2;
	String nickName, membersString, data;
	TextField tfName;
	Label laName;
		
	OutputStream os=null;
	OutputStreamWriter osw=null;
	BufferedWriter bw=null;

	public Client(Socket sock){
		//Socket ���
		this.sock=sock;
		
		BorderLayout layout=new BorderLayout(1,1);
		BorderLayout layoutS=new BorderLayout(1,1);
		GridLayout layoutSE=new GridLayout(2,1);
		setLayout(layout);
		Font fontCenter=new Font(Font.MONOSPACED, Font.BOLD, 12);
		Font fontName=new Font(Font.MONOSPACED, Font.BOLD, 34);
		
		//Center ä�ú���
		chatView=new TextArea("",40,50,TextArea.SCROLLBARS_VERTICAL_ONLY);
		chatView.setEditable(false);
		Panel center=new Panel();
		center.add(chatView);
		add(BorderLayout.CENTER,center);

		//East �������
		list=new List(41);
		Panel east=new Panel();
		east.add(list);
		add(BorderLayout.EAST,east);

		//South �Է�â
		chatInput=new TextArea("",5,40,TextArea.SCROLLBARS_NONE);//�Է��� ���� �޾ƿ;� ��.
		chatInput.setEnabled(false);
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

		//����, ���� ��ư
		bSend=new Button("������");
		bSend.setEnabled(false);
		bSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendChat();
			}
		});

		bExit=new Button("������");
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
		
		//��ȭ���Է�â
		dialog=new Dialog(this, title);
		dialog.setLayout(null);
		dialog.setSize(getWidth(), getHeight());
		dialog.setLocation(getX(), getY());
		dialog.setBackground(new Color(217, 244, 249));
		dialog.setVisible(true);
		dialog.setResizable(false);

		//�̹�������
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
		
	    //��ȭ�� �Է� ��&�ʵ�
		laName=new Label("��ȭ���� �Է��ϼ��� (�ѱ�8��, ����16�� �̳�)");
		dialog.add(laName);
		laName.setFont(fontCenter);
		laName.setSize(300, 30);
		laName.setBackground(new Color(217, 244, 249));
		laName.setLocation(getX()+getWidth()/2-laName.getWidth()/2, 520);
		tfName=new TextField();
		dialog.add(tfName);
		tfName.setSize(300, 45);
		tfName.setFont(fontName);
		tfName.setLocation(getX()+getWidth()/2-tfName.getWidth()/2, 550);
		tfName.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					nickNameCheck();
					setVisible(true);
				}
			}
		});
		
		//�����ϱ� ��ư
		JButton bEnter=new JButton("�����ϱ�");
		dialog.add(bEnter);
		bEnter.setSize(300, 30);
		bEnter.setBackground(new Color(111, 214, 237));
		bEnter.setLocation(getX()+getWidth()/2-bEnter.getWidth()/2, 600);
		bEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nickNameCheck();
				setVisible(true);
			}
		});
		
		//Dialog �ݱ�
		dialog.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dialog2.setVisible(true);
			}
		});
		
		//��ȭ�� ������ Ȯ��â
		dialog2 = new Dialog(this, "����");
		Label msg = new Label("�������� �����Ͻðڽ��ϱ�?", Label.CENTER);
	
		dialog2.setLayout(new FlowLayout());
		exitYes = new Button("��");
		exitYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quitChat();
			}
		});
		
		exitNo = new Button("�ƴϿ�");
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
	}//������ ����
	
	public void nickNameCheck(){
		nickName=tfName.getText();
		if((tfName.getText().isEmpty())){
			System.out.println("4: "+members.toString());
			tfName.requestFocus();
			return;
		}else if(members.contains(nickName)){//�̹� �ִ� �̸��� �ߺ��̸�??
			laName.setText("�̹� ������� �̸��Դϴ�. �ٽ� �Է��� �ּ���");
			tfName.requestFocus();
			return;
		}else if(nickName.getBytes().length>16){//�̸� ���
			laName.setText("�ѱ�8��,����16�� �̳��� ��ȭ���� �Է��ϼ���");
			tfName.requestFocus();
			return;
		}else{
			members.add(nickName);
			data="join:"+tfName.getText();
			sendMsg(data);
			dialog.dispose();
			chatInput.setEnabled(true);
			chatInput.requestFocus();
			bSend.setEnabled(true);
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
			System.out.println("Client.sendMsg() ����: "+e1);
		}
	}

	private void sendChat() {
		String msg="message:"+chatInput.getText();
		sendMsg(msg);
		chatInput.replaceRange("", 0, chatInput.getText().length());
		chatInput.requestFocus();
	}
	
	private void quitChat() {
		nickName="";
		String msg="quit:\r\n";
		sendMsg(msg);
		dispose();
	}

	public static void main(String[] args) {
		String ip="192.168.0.193";//��ip
//		String ip="192.168.0.188";//������ip
//		String ip="192.168.0.169";//������ ip
//		String ip="192.168.0.192";//������ip//server ��� �Ұ�		
		int port=8080;
		Socket sock=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		//Server���� sock���� ���޹��� ���� �о���̱� 
		try {
			sock=new Socket(ip, port);
			Client client=new Client(sock);
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			while(true){
				String view=br.readLine();
				if(view.charAt(0)=='['){//����, ���� �߻��� ���
					list.removeAll();
					String temp=view.substring(1,view.length()-1);//[]����
					String[] temp2=temp.split(",");//������ ���
					for(int i=0; i<temp2.length; i++){
						list.addItem(temp2[i].trim());
						members.add(temp2[i].trim());
					}
				}else{//�Ϲ� ä��
					client.chatView.append(view+"\n");
				}
			}
		} catch (UnknownHostException e) {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();
		} finally{
			try {
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {e.printStackTrace();
			}
		}
	}//main end
}//Client class end
