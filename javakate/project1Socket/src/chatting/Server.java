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

//사용자 요구사항
	//원하는 대화명을 입력하고 채팅방에 입장한다. (대화명 중복 금지, 길이 제한)
	//입력창에 입력하고 엔터/보내기 하면  메시지가 채팅창으로 전송된다.
	//채팅에 참여중인 사람들의 명단을 볼 수 있다.
//UI 요구사항
	//대화명 입력창: 대화명 길이 한글 8자, 영문 16자 이내, 대화명 중복 금지.
	//메인화면: 채팅영역, 참여자명단, 입력창으로 구성
		//채팅창 : 입력기능 없이 보이기만 할 것, 상하 스크롤 필요. 오픈채팅방
		//입력창 :  메시지 입력한 후  엔터(또는 전송버튼 누르기)치면 메시지 전송됨.
		//참여자명단 보이기
	//종료확인창: 종료의사 다시 한 번 확인
//Server 요구사항
	//여러명이 동시에 접속할 수 있도록 Thread 작업

public class Server extends Thread{

	static ArrayList<OutputStream> list = new ArrayList<>();
	Socket sock;
	static ArrayList<String> members=new ArrayList<>();//참여자 명단
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
			System.out.println(addr.getHostAddress()+"접속");
			
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
					msg=nickname+"님이 입장하셨습니다.";
					sendMsg(msg);
					members.add(nickname);
					mem=members.toString();
					System.out.println("입장후"+mem);
					msg=mem;
					sendMsg(msg);
				}else if("message".equals(temp[0])){
					msg=nickname+":"+temp[1];
					sendMsg(msg);
				}else if("quit".equals(temp[0])){
					msg=nickname+"님이 퇴장하셨습니다.";
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
//				e.printStackTrace();//에러메시지 없애려고
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
				System.out.println(addr.getHostAddress()+"접속");
				Server thr=new Server(sock);
				thr.start();
			}
		} catch (IOException e) {
//			e.printStackTrace();//에러메시지 없애려고
		} finally {
			try {
				if(serv!=null)serv.close();
			} catch (IOException e) {
//				e.printStackTrace();//에러메시지 없애려고
			}
		} 
	}
}
