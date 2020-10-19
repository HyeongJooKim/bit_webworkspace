package com.bit.day26;

public class Ex05 extends Thread {

	static int sum;
	int begin;
	int end;
	static Object key=new Object();
	
	public Ex05(int begin, int end, Object key){
		this.begin=begin;
		this.end=end;
		this.key=key;
	}

	public void sum(int i){
		sum+=i+1;
//		try {
//			Thread.sleep(20);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println();
//		io는 가장 시간 많이 걸리는 작업
//		이런 식으로 시간 더 걸리는 다른 일로 바쁘게 해주면
//		문제가 되는 저 계산줄 중간에서 멈추고 넘어가는 확률이 현저히 줄어듬
	}

//		동기화문제 해결 방법 2 메소드동기화
//		다른 Thread의 sum() 메소드가 통으로 대기하게 하는 방법
//		이 경우 key사용 안하고 메소드 자체를 static으로 하여 키처럼 사용하는 것.
//		그래서 반드시 static이어야 함.
//		public static synchronized void sum(int i){
//			int su=i+1;
//			sum=sum+su;
//		}
	
	public void run(){
		for(int i=begin; i<end; i++) sum(i);
	}
	
	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<50; i++)sum+=i+1;
		for(int i=50; i<100; i++)sum+=i+1;
		System.out.println("1~1000까지의 합계: "+sum);
		
		Ex04 me=new Ex04(0,50, key);
		Ex04 you=new Ex04(50,100, key);
		me.start();
		you.start();
		try {
			me.join();
			you.join();
		} catch (InterruptedException e) {e.printStackTrace();
		}
		System.out.println("me+you:"+Ex04.sum);
	}
}