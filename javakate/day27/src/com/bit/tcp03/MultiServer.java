package com.bit.tcp03;

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

//여러명이 한 서버에 접속할 수 있게. 멀티 채팅 프로그램 만들기

public class MultiServer extends Thread{

	static ArrayList<OutputStream> list = new ArrayList<>();
	Socket sock;//static이면 안됨. 각 client가 들고 온 sock을 따로따로 써야 함.

	public MultiServer(Socket sock) {
		this.sock=sock;
	}
	
	public void run() {
		InputStream is=null;
		OutputStream os=null;
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		try {
			InetAddress addr=sock.getInetAddress();
			System.out.println(addr.getHostAddress()+"접속");
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			os=sock.getOutputStream();
			list.add(os);
			while(true){
				String msg=br.readLine();
				if(msg==null)break;
				if(msg.isEmpty())break;
				for(int i=0; i<list.size();i++){
					OutputStream stu=list.get(i);
					osw=new OutputStreamWriter(stu);
					bw=new BufferedWriter(osw);
					bw.write(addr.getHostAddress()+">>"+msg);
					bw.newLine();
					bw.flush();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
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

	public static void main(String[] args) {

		int port=8080;
		ServerSocket serv=null;
		
		try {
			serv=new ServerSocket(port);
			while(true){
				Socket sock=serv.accept();
				InetAddress addr=sock.getInetAddress();
				System.out.println(addr.getHostAddress()+"접속");
				MultiServer thr=new MultiServer(sock);
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