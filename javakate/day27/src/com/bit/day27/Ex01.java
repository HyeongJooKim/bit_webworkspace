package com.bit.day27;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {

	public static void main(String[] args) {
		String url="naver.com";
		
//		www ���������� 4�� ���µ� www ���̴� 2����

//		naver.com
//		125.209.222.142
//		---------------------
//		125.209.222.142 //���������ּ�
//		210.89.160.88   //���������ּ�
//		210.89.164.90
//		125.209.222.141

//		www ������ ���� ������ �ּ�
//		www.naver.com
//		210.89.164.90
//		---------------------
//		210.89.164.90
//		125.209.222.141
		
//		�� �ڽ�
//		localhost
//		127.0.0.1
//		---------------------
//		127.0.0.1
//		0:0:0:0:0:0:0:1
		
		java.net.InetAddress addr01=null;
		InetAddress[] all=null;
		try {
			addr01=InetAddress.getByName(url);
			System.out.println(addr01.getHostName());
			System.out.println(addr01.getCanonicalHostName());
			System.out.println(addr01.getHostAddress());
			//�ּ� �������� ��� �ٸ� �ּ� ���� �� ����.
			//��� ��Ʈ��ũ ��Ȳ�� ���� ���� ���ӵǴ� �ּҸ� �� ��
			all=addr01.getAllByName(url);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------");
		for(int i=0; i<all.length; i++){
			System.out.println(all[i].getHostAddress());
		}
	}
}