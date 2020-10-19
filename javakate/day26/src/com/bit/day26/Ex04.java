package com.bit.day26;

//동기화 문제
//1~1000까지의 합계를 구하시오
//Thread에 반반 나눠 합해보자

public class Ex04 extends Thread {

	static int sum;
	int begin;
	int end;
	static Object key=new Object();
	//이 경우 키 하나여야 함.
	//생성자를 main에 두고 한번 생성하거나,
	//변수에서 생성하되 static으로 처리하면 하나의 key만 생성됨
	
	public Ex04(int begin, int end, Object key){
		this.begin=begin;
		this.end=end;
		this.key=key;
	}
	
//	동기화문제 해결 방법 1 블럭동기화 (이 방법이 유리) 왜?
//	동기화 문제가 발생하는 바로 거기에만 싱크로 걸어줄 수 있음.
//	메소드로 전체를 걸어버리면 그동안 all stop하므로 자원 낭비
	public void sum(int i){
//		sum+=i+1;
		int su=i+1;
		synchronized(key){
		sum=sum+su;//오류 발생하는 부분. 대입 직전에 작업 넘어가서 오류 발생
		}
	}

//	동기화문제 해결 방법 2 메소드동기화
//	다른 Thread의 sum() 메소드가 통으로 대기하게 하는 방법
//	이 경우 key사용 안하고 메소드 자체를 static으로 하여 키처럼 사용하는 것.
//	그래서 반드시 static이어야 함.
//	public static synchronized void sum(int i){
//		int su=i+1;
//		sum=sum+su;
//	}
	
	public void run(){
		for(int i=begin; i<end; i++) sum(i);
	}
	
	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<5000; i++)sum+=i+1;
		for(int i=5000; i<10000; i++)sum+=i+1;
		System.out.println("1~1000까지의 합계: "+sum);
		
//		Object key=new Object();
		Ex04 me=new Ex04(0,5000, key);
		Ex04 you=new Ex04(5000,10000, key);
		me.start();
		you.start();
		try {
			me.join();
			you.join();
		} catch (InterruptedException e) {e.printStackTrace();
		}
		System.out.println("me+you:"+Ex04.sum);
		//Thread에 나눠서 수행하니 값이 계속 바뀜. 정확한 값이 안나옴. 왜?
		//동기화 문제
		//작업단위가 끝나기도 전에 다른 Thread로 넘어가서 이런 문제 발생함.
	}
}