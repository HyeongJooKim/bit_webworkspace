package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

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

public class Server extends Thread{

	static ArrayList<OutputStream> list = new ArrayList<>();
	Socket sock;
	static ArrayList<String> members=new ArrayList<>();//������ ���
	InputStream is=null;
	InputStreamReader isr=null;
	BufferedReader br=null;
	OutputStream os=null;
	OutputStreamWriter osw=null;
	BufferedWriter bw=null;
	
	public Server(Socket sock) {
		this.sock=sock;
	}
	
	public void run() {
		String nickname=null;
		String mem;
		
		try {
			InetAddress addr=sock.getInetAddress();
			System.out.println(addr.getHostAddress()+"����");
			
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			os=sock.getOutputStream();
			list.add(os);
			
			while(true){
				mem=members.toString();
				String msg=mem;
				sendMsg(msg);
				String msg2=br.readLine();
				String[] temp=msg2.split(":");
				if("join".equals(temp[0])){
					nickname=temp[1];
					msg=nickname+"���� �����ϼ̽��ϴ�.";
					sendMsg(msg);
					members.add(nickname);
					mem=members.toString();
					System.out.println("������"+mem);
					msg=mem;
					sendMsg(msg);
				}else if("message".equals(temp[0])){
					msg=nickname+":"+temp[1];
					sendMsg(msg);
				}else if("quit".equals(temp[0])){
					msg=nickname+"���� �����ϼ̽��ϴ�.";
					sendMsg(msg);
					members.remove(nickname);
					mem=members.toString();
					msg=mem;
					sendMsg(msg);
				}
			}
		} catch (IOException e) {

		} finally {
			try {
				if(br!=null)br.close();
				if(bw!=null)bw.close();
				if(isr!=null)isr.close();
				if(osw!=null)osw.close();
				if(os!=null)os.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
//				e.printStackTrace();//�����޽��� ���ַ���
			}
		} 
	}	

	private void sendMsg(String msg) {
		for(int i=0; i<list.size();i++){
			OutputStream client=list.get(i);
			osw=new OutputStreamWriter(client);
			bw=new BufferedWriter(osw);
			try {
				bw.write(msg);
				bw.newLine();
				bw.flush();
			} catch (IOException e) {
				System.out.println("Server.sendMsg() error: "+e);
			}
		}		
	}

	public static void main(String[] args) {

		int port=8080;
		ServerSocket serv=null;
		
		try {
			serv=new ServerSocket(port);
			while(true){
				Socket sock=serv.accept();
				InetAddress addr=sock.getInetAddress();
				System.out.println(addr.getHostAddress()+"����");
				Server thr=new Server(sock);
				thr.start();
			}
		} catch (IOException e) {
//			e.printStackTrace();//�����޽��� ���ַ���
		} finally {
			try {
				if(serv!=null)serv.close();
			} catch (IOException e) {
//				e.printStackTrace();//�����޽��� ���ַ���
			}
		} 
	}
}
