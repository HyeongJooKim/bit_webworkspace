package com.bit.day22;

//익명클래스

public class Ex04 {

	public static void main(String[] args) {

		Runnable work=new Runnable(){
			public void run(){
				System.out.println("thread work");
			}
		};
		Thread thr1=new Thread(work);
		Thread thr2=new Thread(work);

		thr1.start();
		thr2.start();
		
	}
}