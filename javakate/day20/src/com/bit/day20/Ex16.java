package com.bit.day20;

//날짜처럼 객체생성 없이 값 받는 예

class Lec16{
	void func(){
		System.out.println("기능");
	}
}

class Template16{
	static <T> Box<T> newInstance(T ball){
		Box<T> lec=new Box<T>();
		lec.push(ball);
		return lec;
	}
}

public class Ex16 {

	public static void main(String[] args) {
		Box<Bowling> lec=Template16.<Bowling>newInstance(new Bowling());
		lec.pull().play();
		
	}

}
