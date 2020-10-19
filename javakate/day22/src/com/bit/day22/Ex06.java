package com.bit.day22;

//Thread �켱���� �Ҵ��غ���

public class Ex06 {
	public static void main(String[] args) {
		Runnable work=new Runnable(){
			public void run() {
				Thread me=Thread.currentThread();
				System.out.println(me.getName()+" ����");
				for(int i=0; i<10; i++){
					System.out.println(me.getName()+" work "+i);
				}
				System.out.println(me.getName()+" ����");
			}
		};
		Thread thr1=new Thread(work,"ù��°");
		Thread thr2=new Thread(work,"�ι�°");
		Thread thr3=new Thread(work,"����°");
		
		//�׳� �θ� ���� ���Ĵ� �� ���� �������� �� ���ư� 
		//setPriority - 1~10 ������ �켱���� �ο�. 10�� ���� ��. 1�� ����.
		//��� �켱�������� ��Ÿ��� �ƴ�.
		thr1.setPriority(1);
		thr1.setPriority(Thread.MIN_PRIORITY);//1
		thr2.setPriority(5);
		thr2.setPriority(Thread.NORM_PRIORITY);//5 default ��
		thr3.setPriority(10);
		thr3.setPriority(Thread.MAX_PRIORITY);//10
		thr1.start();
		thr2.start();
		thr3.start();
	}
}
