package com.bit.web;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {

	public static void main(String[] args) {

		int port=80;
		ServerSocket serv=null;
		Socket sock=null;
		OutputStream os=null;
		PrintStream ps=null;
		try {
			serv=new ServerSocket(port);
			sock=serv.accept();
			os=sock.getOutputStream();
			ps=new PrintStream(os);
			
			//web���� ��ӵ� ��� �Ծ�. �Ծ��� ���Ѿ� ������ ��.
			ps.println("HTTP/1.1 200 OK \r\n");
			//���� �����߰� ���������� �޽����� ����ص� ����. ��� ��
//			ps.println("HTTP/1.1 404 Not Found\r\n");
			//�������� ã�� �� ����. �̶�� ��
			//�̷� �� ó�����ִ� ���� ������ ���α׷�(��: 
//			ps.println("print ok?...");
			
			for(int i=0; i<5; i++){
				ps.println("<h1>print "+i+"ok?...</h1>");//�۾� Ŀ���� bold��
			}
			//front-end ����(html, CSS(ȭ�� �̻ڰ�),javascript-j����(javascript�� ���� ���� �ٷ�� ���� ���̺귯��))
			//�����δ� ��µ� ������� ����� �Ϳ� �ַ�. ����, ��� ���� ������ ���α׷����� �� ������ ��.
			//�ڵ�ȭ�� ���ο� ����� ������ ���� JSP
			//JSP(���� ������ ��)�� �鿣�� ���� �� ����Ŭ �ϰ�
			//sublet(���� �������� ��)�ε� �鿣�� ���� �� ����Ŭ �� �Ŵ�.
			//front-end - ù ����Ŭ�� �� ǥ�� ���� �� �ܼ��� �� �� �ϰ�
			//�ι� °�� �� ǥ�ؿ� ���� �� ���� �ٷ� ��.
			//����ó��(�ڵ��� ���� �� �ƴ϶� ������ �� �ۿ� ���� ���� �ٲ�� ��)�� �ʿ�
			//File I/O�� �� ���� �ְ�����, ���� ����. �ε�����, �뷮 �ʹ� Ŀ���� ���...
			//�׷��� DB �� ����� �Ŵ�. �츮�� Oracle DB ��� ��. Oracle DB: ������ DB�� ����.
			//Oracle DB: �� �����ϱ� ������ �ظ��� ������ DB�� ���� ���� ��.
			
			ps.flush();
			//���� �� ���������� localhost �����ϸ� print ok?... ����
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(os!=null) os.close();
				if(sock!=null) sock.close();
				if(serv!=null) serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
