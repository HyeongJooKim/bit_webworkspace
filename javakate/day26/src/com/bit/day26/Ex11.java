package com.bit.day26;

public class Ex11 extends Thread{
	boolean end=true;
	boolean running;
	int cnt;
	@Override
	public void run() {
		while(end){
			cnt++;
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//					e.printStackTrace();
//			}
			if(running){
				System.out.println(getName()+" is working");
			}else{
				Thread.yield();//�纸�ϰ� Runnable���·� ����
				//flag�� false�� �Ǹ� �ٸ� �����忡�� ���� �纸
			}
//			if(running){
//				if("Thread-0".equals(getName())){
//					if(cnt<20){
//						Thread.yield();//�纸�ϰ� Runnable���·� ����
//					}
//				}
//				System.out.println(getName()+"���");
//			}
		}
	}

	public static void main(String[] args) {
		Ex10 me=new Ex10();
		Ex10 you=new Ex10();
		me.start();
		you.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.running=true;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.running=false;
		you.running=true;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.end=false;
		you.end=false;
	}
}
