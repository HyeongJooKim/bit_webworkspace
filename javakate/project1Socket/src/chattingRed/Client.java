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
	Button bSend, bExit, bReport, exitYes, exitNo;
	Socket sock;
	static List list;
	static ArrayList<String> members=new ArrayList<>();//������ ���
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
		//Socket ���
		this.sock=sock;
		
		BorderLayout layout=new BorderLayout(1,1);
		BorderLayout layoutS=new BorderLayout(1,1);
		GridLayout layoutSE=new GridLayout(2,1);
		setLayout(layout);
		Font fontCenter=new Font(Font.MONOSPACED, Font.BOLD, 12);
		Font fontName=new Font(Font.MONOSPACED, Font.BOLD, 34);
		
		//Center ä�ú���
		String notice=""
				+ "*******************************************************\n"
				+ "   ������ v1.0.0�� ���� ���� ȯ���մϴ�.\n"
				+ "*******************************************************\n"
				+ "   �������� ������ ������ �� �ִ� ���� ä�ù��Դϴ�.\n"
				+ "   �弳, ���, ���� ǥ�� ���� �ﰡ�� �ּ���.\n"
				+ "*******************************************************\n"
				+ "   �г����� ������ �ϴ��� '�Ű��ϱ�'�� ������\n"
				+ "   �ش� �г��ӿ� ���� �Ű� ��ο��� �����˴ϴ�.\n"
				+ "*******************************************************\n\n"
				+ "";
		chatView=new TextArea(notice,40,50,TextArea.SCROLLBARS_VERTICAL_ONLY);
		chatView.setEditable(false);
		Panel center=new Panel();
		center.add(chatView);
		add(BorderLayout.CENTER,center);

		//East �������. �Ű��ϱ�
		Panel east=new Panel();
		east.setLayout(new BorderLayout());
		east.setSize(10, 40);
		add(BorderLayout.EAST,east);
		Panel east2=new Panel();
		east2.setLayout(new BorderLayout());
		east.add(east2);
		list=new List(30);
		east2.add(BorderLayout.CENTER,list);
		laCount=new Label("�� 0 �� ������");
		east2.add(BorderLayout.SOUTH,laCount);
		bReport=new Button("�Ű��ϱ�");
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
	
		//South �Է�â
		chatInput=new TextArea("",5,40,TextArea.SCROLLBARS_NONE);//�Է��� ���� �޾ƿ;� ��.
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
		
		//�����ϱ� ��ư
		JButton bEnter=new JButton("�����ϱ�");
		dialog.add(bEnter);
		bEnter.setSize(300, 30);
		bEnter.setBackground(new Color(111, 214, 237));
		bEnter.setLocation(getX()+getWidth()/2-bEnter.getWidth()/2, 600);
		bEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nickNameCheck();
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
		}else if(members.contains(nickName)){//�̹� �ִ� �̸��� �ߺ��̸�??
			laName.setText("�̹� ������� �̸��Դϴ�. �ٽ� �Է��ϼ���.");
			tfName.setText("");
		}else if(nickName.getBytes().length>16){//�̸� ���
			laName.setText("�ѱ�8��,����16�� �̳��� ��ȭ���� �Է��ϼ���");
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
							members.add(temp2[i].trim());
							list.addItem(temp2[i].trim());
					}
					laCount.setText("�� "+list.getItemCount()+"�� ������");
				}else{//�Ϲ� ä��
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