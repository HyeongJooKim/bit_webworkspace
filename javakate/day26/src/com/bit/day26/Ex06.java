package com.bit.day26;

public class Ex06 extends Thread {
	
	public void run(){
		System.out.println(getName()+" start");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		//�ͼ��� �̸��� ����, �̹� ���ع��� �� �˰� �־��ٰ�, ���ع����� ��������
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
		me.interrupt();//������ Thread ����
		System.out.println("main end");
	}
}