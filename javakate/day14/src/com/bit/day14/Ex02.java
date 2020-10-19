package com.bit.day14;
// �߻�Ŭ���� ����
abstract class Machine{// ���� abstract�� �Ǿ����� ���� �� class�� ��ӹ޴� �ٸ� class���� �ݵ�� work()�� overriding �ؾ� ���� �ȳ�.
	
	void on(){
		System.out.println("ȯ���մϴ�");
	}
	void off(){
		System.out.println("�����մϴ�");
	}
	
	abstract void work();//��ӹ޾Ƽ� override�ؼ� �����Ұž߶�� abstract �޾Ƽ� ǥ������

}

class Tv extends Machine{
	void work(){
		System.out.println("ȭ��� �Ҹ��� ����մϴ�");
	}
//	�ʹ� �ߺ��� ������ ������� �ذ�
//	void on(){
//		System.out.println("ȯ���մϴ�");
//	}
//	void off(){
//		System.out.println("�����մϴ�");
//	}
}

class Radio extends Machine{ 
	void work(){
		System.out.println("���ļ��� ��� �Ҹ��� ����մϴ�");
	}
	
//	work(){}�� �ۼ� ���ϸ� ����� �Ʒ� ���� ������
//	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		The type Audio must implement the inherited abstract method Machine.work()
//
//		at com.bit.day14.Audio.work(Ex02.java:41)
//		at com.bit.day14.Ex02.main(Ex02.java:88)

//	void on(){
//		System.out.println("ȯ���մϴ�");
//	}
//	void off(){
//		System.out.println("�����մϴ�");
//	}
}

class Audio extends Machine{
	void work(){
		System.out.println("���ļ��� ��� �Ҹ��� ����մϴ�");
	}
//	void on(){
//		System.out.println("ȯ���մϴ�");
//	}
//	void off(){
//		System.out.println("�����մϴ�");
//	}
}

public class Ex02 {

	public static void main(String[] args) {

//		Tv remote=new Tv();
//		remote.on();
//		remote.work();
//		remote.off();
//
//		Radio remote=new Radio();
//		remote.on();
//		remote.work();
//		remote.off();
		
		//�� ���������� Tv, Radio �� ��Ʈ���ϰ� �ʹ�

//		Machine remote=new Audio(); // Audio�� work()�� overriding ���ϴ� work�� ������ �ȵ�. �̷��� �ڵ��� ����� ���ϰ� ��԰� �Ѿ �� ����. ������ �ο��� �ʿ䰡 ����. �׷��� abstract�� �ٿ���
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		Machine remote=null;
		
		while(true){
			System.out.println("1.TV 2.Radio 3.Audio 0.����>>");
			int input=sc.nextInt();
			if(input==0){
				break;
			}else if(input==1){
				remote=new Tv();
			}else if(input==2){
				remote=new Radio();
			}else if(input==3){
				remote=new Audio();
			}
		remote.on();
		remote.work();
		remote.off();
		}
	}

}
