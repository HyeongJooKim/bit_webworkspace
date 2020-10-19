package com.bit.web01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

//������ ������
//�����ϸ� ������. ��? ����Ŭ ��鼭 8080 �����߱� ����
//����Ŭ�� 9090���� ������
//���������� http://localhost:8080/ �Է��ϸ� ���� �޽��� ��
//���� �޽��� ������ �ߴ� ��, ������, �̹��� �� ���� ������ �ޱ� ����
//������ ���������� �۵� ����. 
//	�������� �۵����� �ʽ��ϴ�.
//	localhost���� �߸��� ������ �����߽��ϴ�.
//	ERR_INVALID_HTTP_RESPONSE
//��? ��ӵ� ������� ������ ������ �ʾұ� ������. ��� ��
//�ڹ��� Window>show view>other>General>browser ���� �ϸ� �ٷ� ����
//http://192.168.0.193:8080/
//�� ��� ������ �͵��� ��Ĺ���� �� ���� ���ش�.

public class Server extends Thread{
	
	Socket sock;

	public Server(Socket sock) {
		this.sock=sock;
	}
	
	public void run() {
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		OutputStream os=null;
		FileInputStream fis=null;
		File file=null;
		try {
			SocketAddress addr=sock.getRemoteSocketAddress();
//			System.out.println(addr.toString());///192.168.0.193:49802 ����
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			String request=br.readLine();
//			System.out.println(request);
			//�������� http://192.168.0.193:8080/hangle.txt �ϸ� �ֿܼ� GET /hangle.txt HTTP/1.1 ����
			String[] arr=request.split(" ");
			os=sock.getOutputStream();
			os.write("HTTP/1.1 200 OK\r\n".getBytes());//�� �� �����ϴ� �Ʒ��� �������� �ν��ؼ� �ѹ� �������� �ٲ�
			os.write("Content-type: text/html; charset=utf-8".getBytes());//���ڵ� ���� ������
			os.write("\r\n\r\n".getBytes());//������ ��������� ������ ���� �� �� �� ��
//			file=new File("www/hangle.txt");// \\ ��� \ �ϳ� �ᵵ �Ǵ� �� ����. \\�� �����쿡���� �׷� ��
			//���� �ּ� ���� �� �� �ְ�
			if(arr[1].equals("/")){
				arr[1]="/index.html";
				//����Ʈ�� ��� ���� ����. http://192.168.0.193:8080/ �� �ص� abc.txt ���� ���
				//index ������ �̷� ����Ʈ ���Ϸ� ����
			}
			file=new File("www"+arr[1]);
			//���� ����. �������� ���� �̸����� ���ָ� �����ؼ� �����. ���� ���� ������ ���ָ� �� ã�ư�.
			//�ѱ��� ����.��� �κп��� ���� UTF-8�� �����ٰ� ��ȣ��� ��
			fis=new FileInputStream(file);
			int su=-1;
			while((su=fis.read())!=-1){
				os.write(su);
			}
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(br!=null) br.close();
				if(isr!=null) isr.close();
				if(is!=null) is.close();
				if(fis!=null) fis.close();
				if(os!=null) os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		int port=8080;
		ServerSocket serv=null;
		try {
			serv=new ServerSocket(port);
			//���� ������� ��� ������� ��
			while(true){
				Socket sock=serv.accept();
				Server thr=new Server(sock);
				thr.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(serv!=null) serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}