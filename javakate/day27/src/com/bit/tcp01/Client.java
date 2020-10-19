package com.bit.tcp01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

//소켓통신을 통한 서버클라이언트 제작

public class Client {

	public static void main(String[] args) {

		String ip="127.0.0.1";
		int port=8080;
		Socket sock=null;
		InputStream is=null;//1
		InputStreamReader isr=null;//1
		OutputStream os=null;//2
		
		
		try {
			sock=new Socket(ip,port);
			System.out.println("Client:서버에 접속함");

			//2. Client가 먼저 메시지 보내보기
//			String msg="나 왔음";
			os=sock.getOutputStream();
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			os.flush();
//			os.close();
			
			//1. Server가 Client에게 메시지 전달			
			int su=-1;
			os.write(System.in.read());//먼저 메시지를 전달하기 위해 한 번 먼저
			while((su=isr.read())!=-1){
				os.write(System.in.read());//두번째 이후 메시지들
				System.out.print((char)su);
				System.out.flush();
			}

			//3. 보냈던 메시지를 다시 받아 확인하기
			
			
		} catch (IOException e) {e.printStackTrace();
		}finally{
			try {
				if(isr!=null)isr.close();
				if(os!=null)os.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {e.printStackTrace();
			}
		}
	}
}