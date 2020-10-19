package com.bit.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//보내는 쪽에서 받을 쪽 주소를 알아야 함.

public class UdpSender {

	public static void main(String[] args) {
		String msg="hello UDP";
		
		
		byte[] ip={(byte)192,(byte)168,(byte)0,(byte)193};//ip주소를 4바이트 정보로 변환해서 제공
//		byte[] ip={(byte)127,(byte)0,(byte)0,(byte)1};//ip주소를 4바이트 정보로 변환해서 제공
		int port=8080;
		
		DatagramSocket sock=null;
		DatagramPacket pack=null;
		
		try {
			sock=new DatagramSocket();
			InetAddress addr=InetAddress.getByAddress(ip); 
			pack=new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, port);
			sock.send(pack);

			pack=new DatagramPacket("한글테스트 ".getBytes(), msg.getBytes().length, addr, port);
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