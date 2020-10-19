package com.bit.day22;

//내부 클래스, 익명 클래스로

public class Ex03 {

//	static class Inner extends Thread{//내부클래스에서 상속 받음. 로컬 클래스로 보내서 static 떼고 됨
//		public void run(){
//			System.out.println("thread work");
//		}
//	}
	
	public static void main(String[] args) {

//		class Inner extends Thread{//내부클래스에서 상속 받음. 로컬 클래스로 보내서 static 떼고 됨
//			public void run(){
//				System.out.println("thread work");
//			}
//		}
//		
//		Inner thr1=new Inner();
//		Inner thr2=new Inner();
//		thr1.start();
//		thr2.start();
//
		Thread thr1=new Thread(){//익명클래스로
			public void run(){
				System.out.println("thread1 work");
			}
		};
		Thread thr2=new Thread(){
			public void run(){
				System.out.println("thread2 work");
			}
		};
		thr1.start();
		thr2.start();
	}
}