package com.bit.project1Socket;

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

//Server �䱸����:
//1. �������� ���ÿ� ������ �� �ֵ��� Thread �۾�

//��ӱ���
//[n] ���� Client�� �Ⱥٿ��� ��. ���� ���ӽ� ù �޽����� �� �� ����.
	//Server->Client �����ȣ �ָ� Client���� ����ȳ� & ä�ø�� ����
//[q] ���� Client->Server ����ó��. Server->Client ä�ø�ܿ��� �輼.
	//Server->Client �����ȣ �ָ� Client���� ����ȳ� & ä�ø�� ����
//[m] �޽��� //���ʿ�������. [q] �ƴϸ� �� [m]�� ��

public class Server extends Thread{

//	static ArrayList<OutputStream> list = new ArrayList<>();//Thread ���
	Socket sock;
	Connected connected;
	ArrayList<Connected> list=new ArrayList<>();//������ ���
	
	public Server(Socket sock) {
		this.sock=sock;
	}
	
	public static void main(String[] args) {
		int port=8080;
		ServerSocket serv=null;
		try {
			serv=new ServerSocket(port);
			System.out.println("���� �����...");
			while(true){
				Socket sock=serv.accept();
				Server thread=new Server(sock);
				thread.start();//Server.run(); ����
			}
		} catch (Exception e) {
			System.out.println("Server error: "+e);
		}
	}
	
	//��client �����ϸ� �޾��ְ� �̸� �ѷ��ְ� Connected.run()���� �Ѱ��ִ� �� ������
	//client �����Ҷ����� �� Thread ����
	public void run() {
		while(true){
			try {
				InetAddress addr=sock.getInetAddress();
				System.out.println(addr.getHostAddress()+" ������");
				connected=new Connected(sock);//����� sock�� �޾Ƽ� Connected ��ü ����
				connected.start();//Connected.run(); ����
				connected.nickName=connected.br.readLine();//�����ϰ� ù �޽����� �̸��̹Ƿ� �̰� �̸����� �Է�
				if(connected.equals(connected.nickName)){//�ߺ��� �̸��̸�
					connected.msgSend("duplicated");
				}else{
					connected.msgSend("[n]"+connected.nickName);//�̰� �� �ʿ��Ѱ�??? ����ó���Ϸ��� �ʿ���
					for(int i=0; i<list.size(); i++){
						connected.msgSend("[n]"+connected.nickName);
					}
					
					list.add(connected);//������ client ��ü�� ArrayList list�� ����.
				}
			} catch (IOException e){
				System.out.println("Server.run() error: "+e);
			}
		}
	}//Server.run() end

	//������ client�� ó���� ���� ���� Ŭ����
	class Connected extends Thread {
		String nickName;
		Socket sock;
		//in
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		//out
		OutputStream os=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		
		public Connected(Socket sock) {
			this.sock=sock;
			
			try {//sock���� �а� �� �غ�
				is=sock.getInputStream();
				isr=new InputStreamReader(is);
				br=new BufferedReader(isr);
				os=sock.getOutputStream();
			} catch (Exception e) {
				System.out.println("Connected error: "+e);
			}
		}
		
		public void run(){
			while(true){
				try{
					String msg=br.readLine();
					if(msg==null || msg=="") continue; //�� �ʿ��Ѱ�?
					if(msg.charAt(0)=='[' && msg.charAt(1)=='q'){//���� ó��
						msgSendAll("[q]"+nickName);
						list.remove(this);//���� ���ư��� �� Thread�� �ش��ϴ� Connected ��ü�� ����
						br.close();
						bw.close();
						isr.close();
						osw.close();
						is.close();
						os.close();
						sock.close();
					}else{//�Ϲݸ޽���
						msgSendAll(nickName+":"+msg);//[m]�ٿ����� ���⼭ ���� ������ ��. �׷��� ���� [m] ���ʿ��� ��.
					}
				}catch(Exception e){
					System.out.println("Connected.run() error: "+e);
				}
			}
		}//Connected.run() end

		public void msgSend(String msg) {//I/O���� ���⼭
			try {
				if(!(msg==null || msg=="")){
					bw.write(msg+"\n");
					bw.flush();
				}
			} catch (Exception e) {
				System.out.println("Connected.msgSend() error: "+e);
			}
		}//Connected.msgSend() end
		
		private void msgSendAll(String msg) {
			try {
				for(int i=0; i<list.size();i++){
					Connected conn=list.get(i);
					conn.msgSend(msg);
				}
			} catch (Exception e) {
				System.out.println("Connected.msgSendAll() error: "+e);
			}
		}//Connected.msgSendAll() end
		
		public boolean equals(Object o){
			if(o instanceof Connected){
				Connected conn=(Connected)o;
				if(nickName.equals(conn.nickName)) return true;
			}
			return false;
		}
	}//class Connected end
}//class Server end
