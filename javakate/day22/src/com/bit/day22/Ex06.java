package com.bit.day22;

//Thread 우선순위 할당해보자

public class Ex06 {
	public static void main(String[] args) {
		Runnable work=new Runnable(){
			public void run() {
				Thread me=Thread.currentThread();
				System.out.println(me.getName()+" 시작");
				for(int i=0; i<10; i++){
					System.out.println(me.getName()+" work "+i);
				}
				System.out.println(me.getName()+" 종료");
			}
		};
		Thread thr1=new Thread(work,"첫번째");
		Thread thr2=new Thread(work,"두번째");
		Thread thr3=new Thread(work,"세번째");
		
		//그냥 두면 시작 이후는 세 개가 무작위로 막 돌아감 
		//setPriority - 1~10 사이의 우선순위 부여. 10이 높은 것. 1이 낮음.
		//상대 우선순위이지 등거리는 아님.
		thr1.setPriority(1);
		thr1.setPriority(Thread.MIN_PRIORITY);//1
		thr2.setPriority(5);
		thr2.setPriority(Thread.NORM_PRIORITY);//5 default 값
		thr3.setPriority(10);
		thr3.setPriority(Thread.MAX_PRIORITY);//10
		thr1.start();
		thr2.start();
		thr3.start();
	}
}
