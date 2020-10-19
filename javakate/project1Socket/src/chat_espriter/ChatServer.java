package chat_espriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class ChatServer implements Runnable {

	ServerSocket ss;
	CConnected cconnected;
	ArrayList<CConnected> list=new ArrayList<>();
	
	public ChatServer() {
		try {
			ss=new ServerSocket(8088);
			System.out.println("ä�� ���� ��...");
			new Thread().start();
		} catch (IOException e) {
			System.out.println("ChatServer error: "+e);
		}
	}

	public void run() {
		while(true){
			try {
				Socket sock=ss.accept();
				cconnected=new CConnected(sock);
				cconnected.start();
				cconnected.nickName=cconnected.br.readLine();//�������� �̸� �б�
				cconnected.messageSend("/c"+cconnected.nickName);
				for(CConnected serv : list){//�� ���� �Ȱ�.... ���߿� �ٽ� ����
					serv.messageSend("/c"+cconnected.nickName);
					cconnected.messageSend("/c"+cconnected.nickName);
				}
				list.add(cconnected);//client�� �ϳ��� service�� �װ� add	
			} catch (IOException e) {
				System.out.println("ChatServer run error: "+e);
			}
		}
	}//run end
	
	//client �� ó���� ���� ���� Ŭ����
	class CConnected extends Thread {
		String nickName;
		BufferedReader br;
		OutputStream os;
		Socket sock;
		
		public CConnected(Socket sock) {
			this.sock=sock;
			try {
				br=new BufferedReader(new InputStreamReader(sock.getInputStream(), "euc-kr"));
				os=sock.getOutputStream();
			} catch (Exception e) {
				System.out.println("Service error: "+e);
			}
		}
		
		public void run(){
			while(true){
				try {
					String msg=br.readLine();
					if(msg==null || msg.equals("")) continue;
					if(msg.charAt(0)=='/'){
						if(msg.charAt(1)=='r'){//��ȭ�� ����
							messageAll("r"+nickName+"-"+msg.substring(2));
							nickName=msg.substring(2);
						}else if(msg.charAt(1)=='s'){//�ӼӸ�
							String name=msg.substring(2, msg.indexOf('-')).trim();
							for(CConnected serv : list){
								if(name.equals(serv.nickName)){
									serv.messageSend(nickName+">(secret)"+msg.substring(msg.indexOf('-')+1));
								}
							}
						}else if(msg.charAt(1)=='q'){//����
							messageAll("/q"+nickName);
							list.remove(this);
							br.close();
							os.close();
							sock.close();
						}
					}else{//�Ϲ� �޽���
						messageAll(nickName+">"+msg);
					}
				} catch (Exception e) {
					break;//���� ���� �׳� ��������������
				}
			}
		}//Connected.run() end
		
		public void messageSend(String msg) {
			try {
				os.write((msg+"\n").getBytes("euc-kr"));
			} catch (Exception e) {
				System.out.println("messageSend error: "+e);
			}
		}//Connected.messageSend() end
		
		public void messageAll(String msg){
			try{
				for(int i=0; i<list.size(); i++){
					CConnected serv=list.get(i);
					serv.messageSend(msg);
				}
			}catch(Exception e){
				System.out.println("messageAll error: "+e);
			}
		}//Connected.messageAll() end
		
	}//Connected class end
}//class end
