package com.bit.day14;

public class Ex13 {

	public static void main(String[] args) {
		// java.util 계속
		
		java.util.Random ran=new java.util.Random();
		System.out.println(ran.nextInt());
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println(ran.nextDouble());
		System.out.println(Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		System.out.println(ran.nextInt(3));//0<=int<3 (0~2)까지의 정수 반환됨
		System.out.println(ran.nextInt(45)+1);//0<=int<45 (0~44)까지의 정수 반환됨
	}
}
