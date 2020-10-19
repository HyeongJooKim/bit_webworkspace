package chat_victolee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ChatServerProcessThread extends Thread {
	
	private String nickname=null;
	private Socket socket=null;
	ArrayList<PrintWriter> listWriters=null;

	public ChatServerProcessThread(Socket socket, ArrayList<PrintWriter> listWriters) {
		this.socket=socket;
		this.listWriters=listWriters;
	}

	@Override
	public void run() {

		try {
			//소켓에서 읽어올 준비
			InputStreamReader isr = new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8);
			//StandardCharsets.UTF_8 이런 것이 있었군...
			BufferedReader br=new BufferedReader(isr);
			//소켓으로 출력할 준비
			OutputStreamWriter osw=new OutputStreamWriter(socket.getOutputStream(),StandardCharsets.UTF_8);
			PrintWriter printWriter=new PrintWriter(osw);

			while(true){
				String request=br.readLine();//소켓에서 한줄씩 읽기
				
				if(request==null){
					consoleLog("클라이언트로부터 연결 끊김");
					doQuit(printWriter);
					break;
				}
				
				String[] tokens=request.split(":");
				if("join".equals(tokens[0])){
					doJoin(tokens[1], printWriter);
				}else if("message".equals(tokens[0])){
					doMessage(tokens[1]);
				}else if("quit".equals(tokens[0])){
					doQuit(printWriter);
				}
			}
		} catch (IOException e) {
			consoleLog(this.nickname+"님이 채팅방을 나갔습니다.");
			//오류 대신 퇴장 알림으로 처리하네
//			e.printStackTrace();
		}
	}

	private void consoleLog(String log) {
		System.out.println(log);
	}

	private void doQuit(PrintWriter writer) {
		removeWriter(writer);
		String data=this.nickname+"님이 퇴장했습니다";
		broadcast(data);
	}

	private void removeWriter(PrintWriter writer) {
		synchronized(listWriters){//싱크로 해주는 것 잘 이해 안감...
			listWriters.remove(writer);
		}
	}
	private void broadcast(String data) {
		synchronized (listWriters) {
			for(PrintWriter writer : listWriters){
				writer.println(data);
				writer.flush();
			}
		}
	}

	private void doMessage(String data) {
		broadcast(this.nickname+":"+data);
	}
	
	private void doJoin(String nickname, PrintWriter writer) {
		this.nickname=nickname;
		
		String data=nickname+"님이 입장하셨습니다.";
		broadcast(data);
		
		addWriter(writer);
	}

	private void addWriter(PrintWriter writer) {
		synchronized (listWriters) {
			listWriters.add(writer);
		}
	}

//	public void start() {//없어도 Thread 실행되는 듯...
//	}

}
