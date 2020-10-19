package chat_victolee;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ChatClientApp {
	private static final String SERVER_IP="192.168.0.193";
	private static final int SERVER_PORT=8080;
	//private static final ���� ���� �� �𸣰���
	
	public static void main(String[] args) {
		String name=null;//
		Scanner scanner=new Scanner(System.in);
		while(true){
			System.out.println("��ȭ���� �Է��ϼ���.");
			System.out.print(">>> ");
			name=scanner.nextLine();
			
			if(name.isEmpty()==false){
				break;
			}
			
			System.out.println("��ȭ���� �ѱ��� �̻� �Է��ؾ� �մϴ�.\n");
		}
		scanner.close();
		
		Socket socket=new Socket();
		try {
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
			consoleLog("ä�ù濡 �����Ͽ����ϴ�.");
			new ChatWindow(name, socket).show();
			OutputStreamWriter osw=new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8);
			PrintWriter pw=new PrintWriter(osw, true);//true�� �ϸ� autoflush�� �ǳ�
			String request="join:"+name+"\r\n";
			pw.println(request);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main end

	private static void consoleLog(String log) {
		System.out.println(log);
	}
}//class end