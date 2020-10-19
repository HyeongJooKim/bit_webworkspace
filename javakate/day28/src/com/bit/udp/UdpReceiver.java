package com.bit.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiver {
  
	public static void main(String[] args) {
		int port=8080;
		DatagramSocket sock=null;
		DatagramPacket pack=null;
		byte[] buf=new byte[20];
		//��Ŷ ���� ���� ����? ��Ŷ�� ������ ������ �ҽǵ�.
		//��Ŷ�� ũ�⸦ �����ϰ� ���س��� �����ų� �׷��� ��.
		try {
			sock=new DatagramSocket(port);

			System.out.println("receive �����");
			pack=new DatagramPacket(buf, buf.length);
			sock.receive(pack);
			System.out.println("receive ����");
			byte[] data=pack.getData();
			System.out.println(new String(data));

			System.out.println("2�� receive �����");
			pack=new DatagramPacket(buf, buf.length);
			sock.receive(pack);
			System.out.println("2�� receive ����");
			byte[] data2=pack.getData();
			System.out.println(new String(data2));
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(sock!=null)sock.close();
		}
	}
}