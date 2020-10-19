package com.bit.day27;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {

	public static void main(String[] args) {
		String url="naver.com";
		
//		www 없었을때는 4개 떴는데 www 붙이니 2개만

//		naver.com
//		125.209.222.142
//		---------------------
//		125.209.222.142 //국내전용주소
//		210.89.160.88   //국내전용주소
//		210.89.164.90
//		125.209.222.141

//		www 전세계 접근 가능한 주소
//		www.naver.com
//		210.89.164.90
//		---------------------
//		210.89.164.90
//		125.209.222.141
		
//		나 자신
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
			//주소 여러개인 경우 다른 주소 나올 수 있음.
			//당시 네트워크 상황상 가장 빨리 접속되는 주소를 준 것
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