package com.bit.tcp03;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

//여러명이 한 서버에 접속할 수 있게

public class MultiClient extends Frame implements ActionListener {

	TextField tf;
	Socket sock;
	
	public MultiClient(Socket sock) {
		this.sock=sock;
		tf=new TextField();
		tf.addActionListener(this);
		add(tf);		
		setSize(400,80);
		setLocation(100, 100);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		OutputStream os=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		try {
			os=sock.getOutputStream();
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);
			bw.write(tf.getText());
			bw.newLine();
			bw.flush();
			tf.setText("");
			tf.setText("");
		} catch (IOException e1) {e1.printStackTrace();
//		} finally{
//			try {
//				if(bw!=null)bw.close();
//				if(osw!=null)osw.close();
//				if(os!=null)os.close();
//			} catch (IOException e1) {
////				e.printStackTrace();//에러메시지 없애려고
//			}
		}
	}
	
	public static void main(String[] args) {
//		String ip="192.168.0.169";//선생님 ip
		String ip="192.168.0.193";//내ip
//		String ip="192.168.0.192";//병무씨ip
//		String ip="192.168.0.188";//성범씨ip
		int port=8080;
		Socket sock=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try {
			sock=new Socket(ip,port);
			MultiClient me=new MultiClient(sock);
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);

			while(true){
				String msg=br.readLine();
				if(msg==null)break;//에러메시지 없애려고
				if(msg.isEmpty())break;
				System.out.println(msg);
			}
		} catch (IOException e) {
//			e.printStackTrace();//에러메시지 없애려고
		}finally{
			try {
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
//				e.printStackTrace();//에러메시지 없애려고
			}
		}
	}
}