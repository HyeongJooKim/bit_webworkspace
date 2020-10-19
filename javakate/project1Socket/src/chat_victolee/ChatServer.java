package chat_victolee;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	
	public static final int port=8080;//public static final을 붙였네
	
	public static void main(String[] args) {
		
		ServerSocket serverSocket=null;//서버가 사용할 소켓을 만들고
		
		ArrayList<PrintWriter> listWriters=new ArrayList<PrintWriter>();//Outstream을 목록으로 저장하기 위한 공간
		
		try {
			//1.서버 소켓 생성
			serverSocket=new ServerSocket();//서버가 사용할 소켓을 만들고
			
			//2.바인딩 // 이쪽이 우리가 수업에서 안한 부분인듯. 이 부분을 개선해서 개인ID 받도록 해야 할 듯.
			String hostAddress=InetAddress.getLocalHost().getHostAddress();//내 주소 알아내기
			serverSocket.bind(new InetSocketAddress(hostAddress, port));
			consoleLog("연결 기다림 - "+hostAddress+":"+port);

			//3.요청대기, 연결
			while(true){
				Socket socket=serverSocket.accept();//Client가 사용한 그 소켓을 받는 것.
				new ChatServerProcessThread(socket, listWriters).start();//Thread 실행
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(serverSocket!=null && !serverSocket.isClosed()) serverSocket.close();
				//이미 닫히지 않았다면 이라는 조건을 더했음.
			} catch (IOException e) {e.printStackTrace();
			}
		}
	}//main end
	
	private static void consoleLog(String log){
		System.out.println("[server"+Thread.currentThread().getId()+"]"+log);
		//현재 Thread의 Id로 누군지 알 수 있게 하는 군...
	}
}//class end