package com.bit.day22;

//���� Ŭ����, �͸� Ŭ������

public class Ex03 {

//	static class Inner extends Thread{//����Ŭ�������� ��� ����. ���� Ŭ������ ������ static ���� ��
//		public void run(){
//			System.out.println("thread work");
//		}
//	}
	
	public static void main(String[] args) {

//		class Inner extends Thread{//����Ŭ�������� ��� ����. ���� Ŭ������ ������ static ���� ��
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
		Thread thr1=new Thread(){//�͸�Ŭ������
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