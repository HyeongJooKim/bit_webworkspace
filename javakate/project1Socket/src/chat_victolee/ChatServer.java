package chat_victolee;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	
	public static final int port=8080;//public static final�� �ٿ���
	
	public static void main(String[] args) {
		
		ServerSocket serverSocket=null;//������ ����� ������ �����
		
		ArrayList<PrintWriter> listWriters=new ArrayList<PrintWriter>();//Outstream�� ������� �����ϱ� ���� ����
		
		try {
			//1.���� ���� ����
			serverSocket=new ServerSocket();//������ ����� ������ �����
			
			//2.���ε� // ������ �츮�� �������� ���� �κ��ε�. �� �κ��� �����ؼ� ����ID �޵��� �ؾ� �� ��.
			String hostAddress=InetAddress.getLocalHost().getHostAddress();//�� �ּ� �˾Ƴ���
			serverSocket.bind(new InetSocketAddress(hostAddress, port));
			consoleLog("���� ��ٸ� - "+hostAddress+":"+port);

			//3.��û���, ����
			while(true){
				Socket socket=serverSocket.accept();//Client�� ����� �� ������ �޴� ��.
				new ChatServerProcessThread(socket, listWriters).start();//Thread ����
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(serverSocket!=null && !serverSocket.isClosed()) serverSocket.close();
				//�̹� ������ �ʾҴٸ� �̶�� ������ ������.
			} catch (IOException e) {e.printStackTrace();
			}
		}
	}//main end
	
	private static void consoleLog(String log){
		System.out.println("[server"+Thread.currentThread().getId()+"]"+log);
		//���� Thread�� Id�� ������ �� �� �ְ� �ϴ� ��...
	}
}//class end