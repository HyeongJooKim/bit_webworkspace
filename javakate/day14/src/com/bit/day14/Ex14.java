package com.bit.day14;

public class Ex14 {

	public static void main(String[] args) {

		java.io.InputStream inn=System.in;
		
		java.util.Scanner sc=null;

		String msg="java\nweb\nfraemwork";
		sc=new java.util.Scanner(msg);
		
		System.out.println(sc.next());//java 한단어씩 scanning함
//		System.out.println(sc.nextLine());//java 한줄씩 scanning함
//		System.out.println(sc.nextLine());//web
//		System.out.println(sc.nextLine());//framemwork
		
		
	}

}
