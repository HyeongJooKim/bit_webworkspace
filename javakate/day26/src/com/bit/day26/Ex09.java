package com.bit.day26;

//getState()�� Thread�� ���� Ȯ��
//Thread.State.NEW
//Thread.State.RUNNABLE
//Thread.State.BLOCKED
//Thread.State.TERMINATED
//Thread.State.TIMED_WAITING
//Thread.State.WAITING

class Lec09  extends Thread{
	int tot;
	
	public void run(){
		System.out.println(getName()+" start");
		for(int i=0; i<50; i++){
			System.out.println(i+"�� ���մϴ�");
			tot+=i;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
		System.out.println(getName()+" end");
	}
}

public class Ex09{
	public static void toggle(Lec09 lec){
		if(lec.getState()==Thread.State.NEW){
			lec.start();
		}else if(lec.getState()==Thread.State.RUNNABLE){
			lec.suspend();
		}else if(lec.getState()==Thread.State.TIMED_WAITING){
			lec.stop();
		}
	}
	
	public static void main(String[] args) {
		Lec09 lec=new Lec09();

		lec.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		toggle(lec);
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		lec.suspend();//�Ͻ�����
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		lec.resume();//�簳
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		lec.stop();//����
//		System.out.println("tot:"+lec.tot);
	}
}