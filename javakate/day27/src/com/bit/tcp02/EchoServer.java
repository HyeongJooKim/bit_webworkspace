package com.bit.tcp02;

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

//한글도 되게 개선(작성은 1바이트, 읽기는 2바이트로 있어서 한글 안됬었음) - 문자열 스트림으로
//콘솔이 너무 복잡했다 - 서버는 실행만 하고 메시지 없애자
//종료 안되고 무한루프였다 - -1로는 잘 안되니 엔터두번이면 종료되게(null)

public class EchoServer {

	public static void main(String[] args) {

		int port=8080;
		ServerSocket serve=null;
		Socket sock=null;
		OutputStream os=null;
		InputStream is=null;
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		try {
			serve=new ServerSocket(port);
			sock=serve.accept();
			InetAddress addr=sock.getInetAddress();
			String user=addr.getHostAddress();
			is=sock.getInputStream();
			os=sock.getOutputStream();
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			br=new BufferedReader(isr);
			bw=new BufferedWriter(osw);
			String msg=null;
			while(true){
				msg=br.readLine();
				if(msg==null)break;//에러메시지 없애려고
				if(msg.isEmpty())break;
				bw.write("["+user+"]"+msg);
				bw.newLine();
				bw.flush();
			}//서버가 먼저 종료되는 상황이 연출되어 에러나는 거지만 현실에서는 이런 일 없으니 크게 신경쓸 것 없다.
		} catch (IOException e) {
//			e.printStackTrace();//에러메시지 없애려고
		} finally {
			try {
				if(br!=null)br.close();
				if(bw!=null)bw.close();
				if(isr!=null)isr.close();
				if(osw!=null)osw.close();
				if(os!=null)os.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
				if(serve!=null)serve.close();
			} catch (IOException e) {
//				e.printStackTrace();//에러메시지 없애려고
			}
		} 
	}
}