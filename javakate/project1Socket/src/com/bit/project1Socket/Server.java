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

//Server 요구사항:
//1. 여러명이 동시에 접속할 수 있도록 Thread 작업

//약속구문
//[n] 입장 Client는 안붙여도 됨. 최초 접속시 첫 메시지로 알 수 있음.
	//Server->Client 입장신호 주면 Client에서 입장안내 & 채팅명단 리뉴
//[q] 퇴장 Client->Server 퇴장처리. Server->Client 채팅명단에서 삭세.
	//Server->Client 퇴장신호 주면 Client에서 퇴장안내 & 채팅명단 리뉴
//[m] 메시지 //불필요할지도. [q] 아니면 다 [m]인 셈

public class Server extends Thread{

//	static ArrayList<OutputStream> list = new ArrayList<>();//Thread 명단
	Socket sock;
	Connected connected;
	ArrayList<Connected> list=new ArrayList<>();//참여자 명단
	
	public Server(Socket sock) {
		this.sock=sock;
	}
	
	public static void main(String[] args) {
		int port=8080;
		ServerSocket serv=null;
		try {
			serv=new ServerSocket(port);
			System.out.println("서버 대기중...");
			while(true){
				Socket sock=serv.accept();
				Server thread=new Server(sock);
				thread.start();//Server.run(); 실행
			}
		} catch (Exception e) {
			System.out.println("Server error: "+e);
		}
	}
	
	//새client 접속하면 받아주고 이름 뿌려주고 Connected.run()으로 넘겨주는 것 까지만
	//client 접속할때마다 새 Thread 열림
	public void run() {
		while(true){
			try {
				InetAddress addr=sock.getInetAddress();
				System.out.println(addr.getHostAddress()+" 접속함");
				connected=new Connected(sock);//연결된 sock을 받아서 Connected 객체 생성
				connected.start();//Connected.run(); 실행
				connected.nickName=connected.br.readLine();//접속하고 첫 메시지는 이름이므로 이걸 이름으로 입력
				if(connected.equals(connected.nickName)){//중복된 이름이면
					connected.msgSend("duplicated");
				}else{
					connected.msgSend("[n]"+connected.nickName);//이게 꼭 필요한가??? 입장처리하려면 필요함
					for(int i=0; i<list.size(); i++){
						connected.msgSend("[n]"+connected.nickName);
					}
					
					list.add(connected);//접속한 client 객체를 ArrayList list에 담음.
				}
			} catch (IOException e){
				System.out.println("Server.run() error: "+e);
			}
		}
	}//Server.run() end

	//접속한 client별 처리를 위한 내부 클래스
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
			
			try {//sock에서 읽고 쓸 준비
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
					if(msg==null || msg=="") continue; //꼭 필요한가?
					if(msg.charAt(0)=='[' && msg.charAt(1)=='q'){//퇴장 처리
						msgSendAll("[q]"+nickName);
						list.remove(this);//지금 돌아가는 이 Thread에 해당하는 Connected 객체를 삭제
						br.close();
						bw.close();
						isr.close();
						osw.close();
						is.close();
						os.close();
						sock.close();
					}else{//일반메시지
						msgSendAll(nickName+":"+msg);//[m]붙여오면 여기서 떼고 보내야 함. 그래서 더욱 [m] 불필요한 듯.
					}
				}catch(Exception e){
					System.out.println("Connected.run() error: "+e);
				}
			}
		}//Connected.run() end

		public void msgSend(String msg) {//I/O연결 여기서
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
