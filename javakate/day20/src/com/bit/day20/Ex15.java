package com.bit.day20;

//��¥ó�� ��ü���� ���� �� �޴� ��

class Lec15{
	void func(){
		System.out.println("���");
	}
}

class Template{
	static Box<BaseBall> newInstance(BaseBall ball){
		Box<BaseBall> lec=new Box<BaseBall>();
		lec.push(ball);
		return lec;
	}
}

public class Ex15 {

	public static void main(String[] args) {
		Box<BaseBall> lec=Template.newInstance(new BaseBall());
		lec.pull().play();
		
	}

}
