package com.bit.day22;

public class Ex07 {

	public static void main(String[] args) {

		System.out.println("main start");
		
		try {
			Thread.sleep(3000);//3초 동안 잠듦
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main end");
	}
}