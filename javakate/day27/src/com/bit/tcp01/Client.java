package com.bit.tcp01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

//��������� ���� ����Ŭ���̾�Ʈ ����

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
			System.out.println("Client:������ ������");

			//2. Client�� ���� �޽��� ��������
//			String msg="�� ����";
			os=sock.getOutputStream();
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			os.flush();
//			os.close();
			
			//1. Server�� Client���� �޽��� ����			
			int su=-1;
			os.write(System.in.read());//���� �޽����� �����ϱ� ���� �� �� ����
			while((su=isr.read())!=-1){
				os.write(System.in.read());//�ι�° ���� �޽�����
				System.out.print((char)su);
				System.out.flush();
			}

			//3. ���´� �޽����� �ٽ� �޾� Ȯ���ϱ�
			
			
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