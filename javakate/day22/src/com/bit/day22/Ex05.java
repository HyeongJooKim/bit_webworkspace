package com.bit.day22;

//Thread �̸� ȣ��
//main ���� �Ŀ��� ���ϰ� ����. main�� �ϳ��� Thread�� ��

public class Ex05 {

	public static void main(String[] args) {
		
		Thread me=Thread.currentThread();
		//main �̸� ���� �������� main�� static�̹Ƿ� �׳� ��������. ���� thread�� main�� ��
		System.out.println(me.getName()+ "main start");
		//main�� Thread�̹Ƿ� �̸� ���� ��. �̸��� main�̳�
		
//		Thread thr=new Thread("�ٸ�������"){//String ������ �̸��� ��
		Thread thr=new Thread(){//�̸� ���൵ �ڵ� �ο��� �̸��� ����. ���� Thread-0���� ������
			public void run(){
				System.out.println(this.getName()+" start");//this. �Ƚᵵ ����
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