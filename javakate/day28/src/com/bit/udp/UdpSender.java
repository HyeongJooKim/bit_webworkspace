package com.bit.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//������ �ʿ��� ���� �� �ּҸ� �˾ƾ� ��.

public class UdpSender {

	public static void main(String[] args) {
		String msg="hello UDP";
		
		
		byte[] ip={(byte)192,(byte)168,(byte)0,(byte)193};//ip�ּҸ� 4����Ʈ ������ ��ȯ�ؼ� ����
//		byte[] ip={(byte)127,(byte)0,(byte)0,(byte)1};//ip�ּҸ� 4����Ʈ ������ ��ȯ�ؼ� ����
		int port=8080;
		
		DatagramSocket sock=null;
		DatagramPacket pack=null;
		
		try {
			sock=new DatagramSocket();
			InetAddress addr=InetAddress.getByAddress(ip); 
			pack=new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, port);
			sock.send(pack);

			pack=new DatagramPacket("�ѱ��׽�Ʈ ".getBytes(), msg.getBytes().length, addr, port);
			sock.send(pack);
		
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(sock!=null)sock.close();
		}
	}
}