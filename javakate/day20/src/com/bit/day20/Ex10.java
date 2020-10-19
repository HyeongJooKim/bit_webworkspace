package com.bit.day20;

//Generic
//�̷��� ���ϴ� Ÿ������ casting�ؼ� ��� �ϴ� �������� ���� ����
//���� ���Ե� ����

class Com{
	void play(){
		System.out.println("������ ���� ���");
	}
}

class Ball{
	String color="������";
	void play(){
		System.out.println(color+" ���� �������ϴ�");
	}
}

class BaseBall extends Ball{
	String color="���";
	void play(){
		System.out.println(" ������ �� ���� �ֽ��ϴ�");
	}
}

class Bowling extends Ball{
	String color="��Ȳ��";
	void play(){
		System.out.println("���� ���� ");
		super.play();
	}
	
}

class Box<T>{//Ball, Com �� �� �� �������� Object��. �ٽ� Generic���� Object�� T�� (�� T�� �ƴϾ ��) 
	private T myBall;
	
	void push(T myBall){
		this.myBall=myBall;
	}
	
	T pull(){//������ private ������ �Լ� �ȿ�
		return myBall;
	}
}

public class Ex10 {

	public static void main(String[] args) {

		BaseBall base=new BaseBall();
		Bowling bow=new Bowling();
		Com com=new Com();
		
		Box<BaseBall> box=new Box<BaseBall>();//��ü ������ Ÿ���� �����ִ� ��. �������ָ� Object ��
		box.push(base);
		
		BaseBall ball2=box.pull();//<>�� �־��ִ� casting ���ʿ�
		ball2.play();
		
//		Bowling myBall=new Bowling();
//		myBall.play();//������ ���� �������ϴ� ����. this.color �� ��Ī�ϴ� Ball�� ���� ����. Bowling �� �ƴ϶�
	}
}
