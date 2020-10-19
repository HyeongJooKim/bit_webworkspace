package com.bit.tcp01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//��������� ���� ����Ŭ���̾�Ʈ ����
//���� ���� ���� ����, Ŭ���̾�Ʈ�� �����ϸ� ��

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
			System.out.println("Server: ���Ӵ����");
			sock=serve.accept();
			System.out.println("Server: ���ӵ�");
			
			//2. Client�� ���� �޽��� �б�
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
			
			//1. Server�� Client���� �޽��� ����	
//			String msg="ȯ���մϴ�";
//			os.write(msg.getBytes());
			
			//3. ���� �޽����� �ٽ� ���� ���� Ȯ��
			
			
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