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
	
	int count=0;//���� �ο���
	
	public ChatClient() {
	//try catch �߰��ؾ� �ϴ� ��
		chatWindow();
		addListener();
	}
	
	private void chatWindow() {//jbInit()���� �̸� �ٲ�
		this.getContentPane().setLayout(null);//���ο� �͵��̳�
		this.setSize(new Dimension(652, 264));
		this.setTitle("ä�� ���α׷�");
		this.setBackground(new Color(198, 214, 255));
		//ù��
		la1.setText("��ȭ��");
		la1.setBounds(new Rectangle(15, 10, 45, 25));
		tfName.setBounds(new Rectangle(60, 10, 105, 25));
		bConn.setText("����");
		bConn.setBounds(new Rectangle(165, 10, 60, 25));
		bChange.setText("��ȭ����");
		bChange.setBounds(new Rectangle(230, 10, 110, 25));
		radio1.setText("�ӼӸ�");
		radio1.setBounds(new Rectangle(345, 10, 70, 25));
		radio1.setText("�ӼӸ�����");
		radio1.setBounds(new Rectangle(420, 10, 90, 25));
		ButtonGroup group=new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		
		sp.setBounds(new Rectangle(15, 40, 495, 155));
		//�ٴ���
		tfSend.setBounds(new Rectangle(15, 200, 435, 25));
		bOk.setText("Ȯ��");
		bOk.setBounds(new Rectangle(450, 200, 60, 25));
		bClose.setText("������");
		bClose.setBounds(new Rectangle(530, 200, 90, 25));
		
		//������
		la2.setText("������ ���");
		la2.setBounds(new Rectangle(520, 10, 75, 20));
		list.setBounds(new Rectangle(525, 40, 110, 120));
		la3.setText("�ο�:");
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
			//��ȭ�� �Է� �� ����
			if(tfName.getText().equals("")){//�̸� �Է� ���ϸ� - �̰� ����� �� �ְڴ�
				JOptionPane.showMessageDialog(this, "��ȭ���Է�");
				tfName.requestFocus();
				return;
			}
			try {
				sock=new Socket("192.168.0.193", 8088);
				br=new BufferedReader(new InputStreamReader(sock.getInputStream(), "euc-kr"));
				os=sock.getOutputStream();
				os.write((tfName.getText()+"\n").getBytes("euc-kr"));
				new Thread(this).start();//run�� ȣ��
			} catch (Exception e1) {
				System.out.println("���ӿ���:"+e1);
			}
		}else if(e.getSource()==tfSend || e.getSource()==bOk){
			//�޽��� ����
			try {
				if(radio1.isSelected()){//�ӼӸ� �޽���. ��� �׻�����Ը� ������???
					String name=list.getSelectedItem();//��ܿ��� ���õ� ��� �̸�
					os.write(("/s"+name+"-"+tfSend.getText()+"\n").getBytes("euc-kr"));
					ta.append(name+"�Կ��� �ӼӸ��� ���޵Ǿ����ϴ�.\n");
				}else{//�Ϲ� �޽���
					os.write((tfSend.getText()+"\n").getBytes("euc-kr"));
				}
				tfSend.setText("");//���� �����
				tfSend.requestFocus();
			} catch (Exception e1) {
				System.out.println("�޼��� ���� ����:"+e1);
			}
		}else if(e.getSource()==bChange){
			//��ȭ�� ����
			if(bChange.getText().equals("��ȭ����")){//�̰� �� true�ƴѰ�? �� Ŭ������ ���� ���� ���� ����?
				bChange.setText("����Ȯ��");//��ȣ ��ư�� �۾��� �ٲٳ�
				tfName.setEditable(true);
				tfName.requestFocus();
			}else{
				bChange.setText("��ȭ����");
				tfName.setEditable(false);
				try {
					os.write(("/r"+tfName.getText()+"\n").getBytes("euc-kr"));
				} catch (Exception e1) {
					System.out.println("��ȭ�� ���� ����:"+e1);
				}
			}
		}else if(e.getSource()==bClose){
			//������
			try {
				os.write(("/q\n").getBytes());
				br.close();
				os.close();
				sock.close();
			} catch (Exception e1) {
				System.out.println("������ ����:"+e1);
			} finally{
				System.exit(0);
			}
		}
	}
	
	public void run() {
		while(true){
			try {
				String msg=br.readLine();//�����κ��� �޼��� ����
				if(msg==null || msg.equals("")) return;
				if(msg.charAt(0)=='/'){//�̰� ��ȣ�� �߱�
					if(msg.charAt(1)=='c'){//����. 'c' �������� ����
						list.add(msg.substring(2),count);
						count++;
						la4.setText(String.valueOf(count));//�� �ο��� ǥ��
						ta.append("**"+msg.substring(2)+"���� �����߽��ϴ�.\n");
						tfName.setEditable(false);//��ȭ�� ���̻� �Է� �Ұ�
						bConn.setEnabled(false);
					}else if(msg.charAt(1)=='q'){//����
						ta.append("^^"+msg.substring(2)+"���� �����߽��ϴ�.\n");
						String cname=msg.substring(2);
						for(int i=0; i<count; i++){
							if(cname.equals(list.getItem(i))){
								list.remove(i);
								count--;
								la4.setText(String.valueOf(count));
								break;
							}
						}
					}else if(msg.charAt(1)=='r'){//��ȭ�� ����
						String oldName=msg.substring(2, msg.indexOf('-'));//'-' �������� ����
						String newName=msg.substring(msg.indexOf('-')+1);
						ta.append("*"+oldName+"���� ��ȭ����"+newName+"���� ����Ǿ����ϴ�.\n");
						for(int i=0; i<count; i++){
							if(oldName.equals(list.getItem(i))){
								list.replaceItem(newName, i);
								break;
							}
						}
					}
				}else{//�Ϲ� �޼���. ��� �޼����� �������� ó��
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
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�̷��� �� ����		
	}
}
