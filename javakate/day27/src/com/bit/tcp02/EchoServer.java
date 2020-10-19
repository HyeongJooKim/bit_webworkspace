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

//�ѱ۵� �ǰ� ����(�ۼ��� 1����Ʈ, �б�� 2����Ʈ�� �־ �ѱ� �ȉ����) - ���ڿ� ��Ʈ������
//�ܼ��� �ʹ� �����ߴ� - ������ ���ุ �ϰ� �޽��� ������
//���� �ȵǰ� ���ѷ������� - -1�δ� �� �ȵǴ� ���͵ι��̸� ����ǰ�(null)

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
				if(msg==null)break;//�����޽��� ���ַ���
				if(msg.isEmpty())break;
				bw.write("["+user+"]"+msg);
				bw.newLine();
				bw.flush();
			}//������ ���� ����Ǵ� ��Ȳ�� ����Ǿ� �������� ������ ���ǿ����� �̷� �� ������ ũ�� �Ű澵 �� ����.
		} catch (IOException e) {
//			e.printStackTrace();//�����޽��� ���ַ���
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
//				e.printStackTrace();//�����޽��� ���ַ���
			}
		} 
	}
}