package com.bit.day26;

class Lec08  extends Thread{
	int tot;
	
	public void run(){
		synchronized (this){
			for(int i=0; i<5; i++){
				System.out.println(i+"를 더합니다");
				tot+=i;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
//					e.printStackTrace();
				}
			}
			notify();//이후의 wait 중 하나를 깨워 runnable 상태로 만든다
//			notifyAll();//이후의 모든 wait을 runnable로 깨운다.
		}
	}
}

public class Ex08{

	public static void main(String[] args) {
		Lec08 lec=new Lec08();
		lec.start();
		synchronized (lec) {
			try {
				lec.wait(1000);//wait();은 싱크로 안하면 오류남.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("tot:"+lec.tot);
	}
}