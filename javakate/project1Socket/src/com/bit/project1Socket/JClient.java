package com.bit.project1Socket;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
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
import java.awt.event.KeyListener;
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

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

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

public class JClient extends Frame {

	JTextPane chatView;//�������� �Է��� ���� ���� ������� ��.
	static StyledDocument doc;
	TextArea chatInput;//�Է��� ���� �޾ƿ;� ��.
	TextArea memberList;//�����ϴ� ������� �̸��� ���� ����
	String title="���ٹ� v 0.1.0";
	Button bSend;
	Button bExit;
	Socket sock;
	static List list;
	static int cnt=0;//������ ��
//	static ArrayList<String> members=new ArrayList<>();//������ ���
	Dialog dialog2;
	Button exitYes;
	Button exitNo;
	String nickName;
		
	public JClient(Socket sock){
		//Socket ���
		this.sock=sock;
		
		BorderLayout layout=new BorderLayout(5,5);
		BorderLayout layoutS=new BorderLayout(5,5);
		GridLayout layoutSE=new GridLayout(2,1);
		setLayout(layout);
		
		//Center ä�ú���
		chatView=new JTextPane();
		doc=chatView.getStyledDocument();
//		SimpleAttributeSet left=new SimpleAttributeSet();
//		StyleConstants.setAlignment(left, StyleConstants.ALIGN_LEFT);
//		StyleConstants.setForeground(left, Color.GRAY);
//		
//		SimpleAttributeSet right=new SimpleAttributeSet();
//		StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
//		StyleConstants.setForeground(right, Color.YELLOW);
		
		chatView.setEditable(false);
		Panel center=new Panel();
		center.add(chatView);
		add(BorderLayout.CENTER,center);

		//East �������
		list=new List(40);
		Panel east=new Panel();
		east.add(list);
		add(BorderLayout.EAST,east);

		//South �Է�â
		chatInput=new TextArea("",5,40,TextArea.SCROLLBARS_NONE);//�Է��� ���� �޾ƿ;� ��.
		chatInput.setEnabled(false);
		chatInput.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					sendMessage();
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
				sendMessage();
			}
		});

		bExit=new Button("��������");
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
		setVisible(true);
		pack();
		
		//��ȭ���Է�â
		Dialog dialog=new Dialog(this, "��ȭ���� �Է��ϼ���.");
		dialog.setSize(200,80);
		dialog.setLocation(getX()+getWidth()/2-dialog.getWidth()/2, getY()+getHeight()/2-dialog.getHeight()/2);
		dialog.setVisible(true);
		
		TextField tfName=new TextField(20);
		dialog.add(tfName);
		tfName.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					if((tfName.getText().isEmpty())){
						dialog.requestFocus();
						return;
					}else{
						nickName=tfName.getText();
						OutputStream os=null;
						OutputStreamWriter osw=null;
						BufferedWriter bw=null;
						try {
							os=sock.getOutputStream();
							osw=new OutputStreamWriter(os);
							bw=new BufferedWriter(osw);
							bw.write("join:"+tfName.getText());
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
		
		dialog2.setSize(200, 100);
		dialog2.setLocation(getX()+getWidth()/2-dialog2.getWidth()/2, getY()+getHeight()/2-dialog2.getHeight()/2);
		dialog2.setVisible(false);
	}//������ ����
	
	private void sendMessage() {
		OutputStream os=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		
		try {
			os=sock.getOutputStream();
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);
			bw.write("message:"+chatInput.getText());
			bw.newLine();
			bw.flush();
			chatInput.replaceRange("", 0, chatInput.getText().length());
			chatInput.requestFocus();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	private void quitChat() {
		OutputStream os=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		
		try {
			os=sock.getOutputStream();
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);
			bw.write("quit:\r\n");
			bw.newLine();
			bw.flush();
			dispose();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
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
		
		SimpleAttributeSet left=new SimpleAttributeSet();
		StyleConstants.setAlignment(left, StyleConstants.ALIGN_LEFT);
		StyleConstants.setForeground(left, Color.GRAY);
		
		SimpleAttributeSet right=new SimpleAttributeSet();
		StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
		StyleConstants.setForeground(right, Color.YELLOW);
		
		//Server���� sock���� ���޹��� ���� �о���̱� 
		try {
			sock=new Socket(ip, port);
			JClient client=new JClient(sock);
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
					}
				}else{//�Ϲ� ä��
					String[] msg=view.split(":");
					for(int i=0; i<list.getItemCount(); i++){
						if(msg[0]==list.getItem(i)){
							client.doc.insertString(doc.getLength(), view+"\n", right);
							client.doc.setParagraphAttributes(doc.getLength(), 1, right, false);
						}else{
							client.doc.insertString(doc.getLength(), view+"\n", left);
							client.doc.setParagraphAttributes(doc.getLength(), 1, left, false);
						}
					}
				}
			}
		} catch (UnknownHostException e) {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
