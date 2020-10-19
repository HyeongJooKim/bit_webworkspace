package com.bit.tcp01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//소켓통신을 통한 서버클라이언트 제작
//서버 먼저 열어 놓고, 클라이언트를 실행하면 됨

public class Server {

	public static void main(String[] args) {

		int port=8080;
		ServerSocket serve=null;
		Socket sock=null;
		OutputStream os=null;//1
		InputStream is=null;//2
		InputStreamReader isr=null;//2
		
		try {
			serve=new ServerSocket(port);
			System.out.println("Server: 접속대기중");
			sock=serve.accept();
			System.out.println("Server: 접속됨");
			
			//2. Client가 보낸 메시지 읽기
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			os=sock.getOutputStream();
			
			int su=-1;
			while((su=isr.read())!=-1){
//				System.out.print((char)su);
				os.write(su);
				os.flush();
//				os.close();
			}
			
			//1. Server가 Client에게 메시지 전달	
//			String msg="환영합니다";
//			os.write(msg.getBytes());
			
			//3. 받은 메시지를 다시 보내 수신 확인
			
			
		} catch (IOException e) {e.printStackTrace();
		} finally {
			try {
				if(os!=null)os.close();
				if(isr!=null)isr.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
				if(serve!=null)serve.close();
			} catch (IOException e) {e.printStackTrace();
			}
		} 
	}
}