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
//		io�� ���� �ð� ���� �ɸ��� �۾�
//		�̷� ������ �ð� �� �ɸ��� �ٸ� �Ϸ� �ٻڰ� ���ָ�
//		������ �Ǵ� �� ����� �߰����� ���߰� �Ѿ�� Ȯ���� ������ �پ��
	}

//		����ȭ���� �ذ� ��� 2 �޼ҵ嵿��ȭ
//		�ٸ� Thread�� sum() �޼ҵ尡 ������ ����ϰ� �ϴ� ���
//		�� ��� key��� ���ϰ� �޼ҵ� ��ü�� static���� �Ͽ� Űó�� ����ϴ� ��.
//		�׷��� �ݵ�� static�̾�� ��.
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
		System.out.println("1~1000������ �հ�: "+sum);
		
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