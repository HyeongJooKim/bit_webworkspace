package com.bit.day14;

interface Remote{
	void on();
	void off();
	void work();
}

class Tv2 implements Remote{

	@Override
	public void on() {
		System.out.println("전원을 공급한다");
	}

	@Override
	public void off() {
		System.out.println("전원을 차단한다");
	}

	@Override
	public void work() {
		System.out.println("화면과 소리를 재생한다");
	}
}

class Radio2 implements Remote{
	
	@Override
	public void on() {
		System.out.println("밧데리를 통해 전원을 공급한다");
	}
	
	@Override
	public void off() {
		System.out.println("밧데리를 통해 전원을 차단한다");
	}
	
	@Override
	public void work() {
		System.out.println("주파수를 찾아 소리를 재생한다");
	}
}

public class Ex06 {// class 단에서 implements 안써도 아래에서 참조변수 가져오면 다형성에 의해 접근 가능.

	public static void main(String[] args) {
		Remote remote=null;
		
		remote=new Tv2();
		remote.on();
		remote.work();
		remote.off();
		
		remote=new Radio2();
		remote.on();
		remote.work();
		remote.off();
	}
}
