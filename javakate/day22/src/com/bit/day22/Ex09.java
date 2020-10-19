package com.bit.day22;

public class Ex09 extends Thread{

	public static void main(String[] args) {

	System.out.println("main start");
	Ex09 me=new Ex09();
	Ex09 you=new Ex09();
	me.start();
	you.start();
	
	try {
		me.join();//�ش� Thread �� ���� ������ ���� ������ ��� hold 
//		you.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("main end");//main�� �� �������� ������ ������ join()
	
	}//main end

	public void run(){
		for(int i=0; i<5; i++){
			System.out.println(getName()+"work"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}