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
		//패킷 정보 어찌 알지? 패킷이 작으면 데이터 소실됨.
		//패킷의 크기를 일정하게 정해놓고 보내거나 그래야 함.
		try {
			sock=new DatagramSocket(port);

			System.out.println("receive 대기중");
			pack=new DatagramPacket(buf, buf.length);
			sock.receive(pack);
			System.out.println("receive 받음");
			byte[] data=pack.getData();
			System.out.println(new String(data));

			System.out.println("2차 receive 대기중");
			pack=new DatagramPacket(buf, buf.length);
			sock.receive(pack);
			System.out.println("2차 receive 받음");
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