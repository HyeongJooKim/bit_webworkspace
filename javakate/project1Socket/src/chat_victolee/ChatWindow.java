package chat_victolee;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ChatWindow {

	private String name;
	private Frame f;
	private Panel p;
	private Button bSend;
	private TextField tf;
	private TextArea ta;
	
	private Socket socket;
	
	public ChatWindow(String name, Socket socket) {
		this.name=name;
		f=new Frame(name);
		p=new Panel();
		bSend=new Button("Send");
		tf=new TextField();
		ta=new TextArea(30,80);
		this.socket=socket;
		
		new ChatClientReceiveThread(socket).start();//inner class ������ ��
	}

	public void show() {

		bSend.setBackground(Color.GRAY);
		bSend.setForeground(Color.WHITE);
		bSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});
		
		tf.setColumns(80);
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				char keyCode=e.getKeyChar();
				if(keyCode == KeyEvent.VK_ENTER){
					sendMessage();
				}
			}
		});
		
		p.setBackground(Color.LIGHT_GRAY);
		p.add(tf);
		p.add(bSend);
		f.add(BorderLayout.SOUTH, p);//new BorderLayout���� ���ص� �ǳ�!!!
		//Panel�� TF �־ South��
		
		ta.setEditable(false);
		f.add(BorderLayout.CENTER, ta);//TA �ϳ��� center��
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				OutputStream os=null;
				OutputStreamWriter osw=null;
				PrintWriter pw=null;
				try {
					os=socket.getOutputStream();
					osw=new OutputStreamWriter(os, StandardCharsets.UTF_8);
					pw=new PrintWriter(osw, true);
					String request="quit\r\n";// �̰� ��?
					pw.println(request);
					System.exit(0);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		f.setVisible(true);
		f.pack();//�ڵ����� â�� �ּ�ȭ
	}

	//Thread�� ����� ��ȭ�� ��������
	private void sendMessage() {
		OutputStream os=null;
		OutputStreamWriter osw=null;
		PrintWriter pw=null;
		
		try {
			os=socket.getOutputStream();
			osw=new OutputStreamWriter(os, StandardCharsets.UTF_8);
			pw=new PrintWriter(osw, true);
			String message=tf.getText();
			String request="message:"+message+"\r\n";
			pw.println(request);
			
			tf.setText("");
			tf.requestFocus();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private class ChatClientReceiveThread extends Thread{
		//Inner class. ������ �����ϴ� �޽����� �����ϱ� ���� Thread
		//�� ���� �ٸ� cleint�� �޽����� �Է��ϸ�
		//������ ��� clients���� �޽����� ������ �Ǵµ�, �̰� �������� ���� Thread 
		Socket socket=null;
		
		public ChatClientReceiveThread(Socket socket) {
			this.socket=socket;
		}
		
		@Override
		public void run() {
			InputStream is=null;
			InputStreamReader isr=null;
			BufferedReader br=null;
			
			try {
				is=socket.getInputStream();
				isr=new InputStreamReader(is, StandardCharsets.UTF_8);
				br=new BufferedReader(isr);
				while(true){
					String msg=br.readLine();
					ta.append(msg);
					ta.append("\n");
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}//ChatWindow class end
