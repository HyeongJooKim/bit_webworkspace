package com.bit.day26;

public class Ex06 extends Thread {
	
	public void run(){
		System.out.println(getName()+" start");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		//익셉션 이름을 보면, 이미 방해받을 줄 알고 있었다가, 방해받으면 빠져나옴
//			e.printStackTrace();
		}
		System.out.println(getName()+" end");
	}

	public static void main(String[] args) {

		System.out.println("main start");
		Ex06 me=new Ex06();
		me.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.interrupt();//강제로 Thread 깨움
		System.out.println("main end");
	}
}