package com.bit.day26;

//����ȭ ����
//1~1000������ �հ踦 ���Ͻÿ�
//Thread�� �ݹ� ���� ���غ���

public class Ex04 extends Thread {

	static int sum;
	int begin;
	int end;
	static Object key=new Object();
	//�� ��� Ű �ϳ����� ��.
	//�����ڸ� main�� �ΰ� �ѹ� �����ϰų�,
	//�������� �����ϵ� static���� ó���ϸ� �ϳ��� key�� ������
	
	public Ex04(int begin, int end, Object key){
		this.begin=begin;
		this.end=end;
		this.key=key;
	}
	
//	����ȭ���� �ذ� ��� 1 ������ȭ (�� ����� ����) ��?
//	����ȭ ������ �߻��ϴ� �ٷ� �ű⿡�� ��ũ�� �ɾ��� �� ����.
//	�޼ҵ�� ��ü�� �ɾ������ �׵��� all stop�ϹǷ� �ڿ� ����
	public void sum(int i){
//		sum+=i+1;
		int su=i+1;
		synchronized(key){
		sum=sum+su;//���� �߻��ϴ� �κ�. ���� ������ �۾� �Ѿ�� ���� �߻�
		}
	}

//	����ȭ���� �ذ� ��� 2 �޼ҵ嵿��ȭ
//	�ٸ� Thread�� sum() �޼ҵ尡 ������ ����ϰ� �ϴ� ���
//	�� ��� key��� ���ϰ� �޼ҵ� ��ü�� static���� �Ͽ� Űó�� ����ϴ� ��.
//	�׷��� �ݵ�� static�̾�� ��.
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
		System.out.println("1~1000������ �հ�: "+sum);
		
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
		//Thread�� ������ �����ϴ� ���� ��� �ٲ�. ��Ȯ�� ���� �ȳ���. ��?
		//����ȭ ����
		//�۾������� �����⵵ ���� �ٸ� Thread�� �Ѿ�� �̷� ���� �߻���.
	}
}