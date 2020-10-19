package com.bit.tcp02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

//한글도 되게 개선
//콘솔이 너무 복잡했다
//종료 안되고 무한루프였다

public class EchoClient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		String ip="192.168.0.169";//선생님 ip
		String ip="127.0.0.1";
		int port=8080;
		Socket sock=null;
		InputStream is=null;
		OutputStream os=null;
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		try {
			sock=new Socket(ip,port);
			is=sock.getInputStream();
			os=sock.getOutputStream();
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			br=new BufferedReader(isr);
			bw=new BufferedWriter(osw);

			while(true){
				bw.write(sc.nextLine());
				bw.newLine();
				bw.flush();
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
}