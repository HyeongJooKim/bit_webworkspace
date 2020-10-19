package com.bit.day22;

//Thread 이름 호출
//main 끝난 후에도 일하고 있음. main도 하나의 Thread인 것

public class Ex05 {

	public static void main(String[] args) {
		
		Thread me=Thread.currentThread();
		//main 이름 어찌 가져오나 main은 static이므로 그냥 못가져옴. 현재 thread가 main인 것
		System.out.println(me.getName()+ "main start");
		//main도 Thread이므로 이름 있을 것. 이름이 main이네
		
//		Thread thr=new Thread("다른쓰레드"){//String 넣으면 이름이 됨
		Thread thr=new Thread(){//이름 안줘도 자동 부여된 이름이 있음. 찍어보면 Thread-0으로 찍혔네
			public void run(){
				System.out.println(this.getName()+" start");//this. 안써도 같음
				for(int i='A'; i<='Z'; i++){
					System.out.println((char)i+" ");
				}
				System.out.println(getName()+" end");
			}
		};
		thr.start();
		System.out.println("main end");
	}
}