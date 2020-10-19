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
			//���Ͽ��� �о�� �غ�
			InputStreamReader isr = new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8);
			//StandardCharsets.UTF_8 �̷� ���� �־���...
			BufferedReader br=new BufferedReader(isr);
			//�������� ����� �غ�
			OutputStreamWriter osw=new OutputStreamWriter(socket.getOutputStream(),StandardCharsets.UTF_8);
			PrintWriter printWriter=new PrintWriter(osw);

			while(true){
				String request=br.readLine();//���Ͽ��� ���پ� �б�
				
				if(request==null){
					consoleLog("Ŭ���̾�Ʈ�κ��� ���� ����");
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
			consoleLog(this.nickname+"���� ä�ù��� �������ϴ�.");
			//���� ��� ���� �˸����� ó���ϳ�
//			e.printStackTrace();
		}
	}

	private void consoleLog(String log) {
		System.out.println(log);
	}

	private void doQuit(PrintWriter writer) {
		removeWriter(writer);
		String data=this.nickname+"���� �����߽��ϴ�";
		broadcast(data);
	}

	private void removeWriter(PrintWriter writer) {
		synchronized(listWriters){//��ũ�� ���ִ� �� �� ���� �Ȱ�...
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
		
		String data=nickname+"���� �����ϼ̽��ϴ�.";
		broadcast(data);
		
		addWriter(writer);
	}

	private void addWriter(PrintWriter writer) {
		synchronized (listWriters) {
			listWriters.add(writer);
		}
	}

//	public void start() {//��� Thread ����Ǵ� ��...
//	}

}
