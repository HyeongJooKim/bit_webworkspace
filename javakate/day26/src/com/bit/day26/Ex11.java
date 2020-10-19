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
				Thread.yield();//양보하고 Runnable상태로 빠짐
				//flag가 false가 되면 다른 스레드에세 실행 양보
			}
//			if(running){
//				if("Thread-0".equals(getName())){
//					if(cnt<20){
//						Thread.yield();//양보하고 Runnable상태로 빠짐
//					}
//				}
//				System.out.println(getName()+"출력");
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
