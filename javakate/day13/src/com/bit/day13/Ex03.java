package com.bit.day13;

public class Ex03 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());//16 출력되네
		StringBuffer sb2=new StringBuffer("abc");
		System.out.println(sb2.capacity());//19 출력되네. 초기값길이3+16
	}
}
