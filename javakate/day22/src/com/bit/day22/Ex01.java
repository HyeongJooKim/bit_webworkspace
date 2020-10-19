package com.bit.day22;

//main과 run이 순차적으로 수행하지 않고 동시에 진행하는 것 보자

public class Ex01 extends Thread {

	public void run (){
		System.out.println("Thread start");
		for(int i=0; i<10; i++){
			System.out.println("Thread work");
		}
		System.out.println("Thread end");
	}

	public static void main(String[] args) {
		
		System.out.println("main start");
		
		Ex01 me = new Ex01();
//		me.run();//run() 다 하고 나서 다음줄로 넘어감. 멀티 안됨
		me.start();//Thread의 run()을 수행하라는 명령. 일단 출발 신호 쏘고 다음줄로 넘어가므로 두 가지가 동시에 일어나게 됨
		for(int i=0; i<5; i++){
			String temp=new String("test"+i);
			System.out.println("main work");
		}
		System.out.println("main end");
	}
}
