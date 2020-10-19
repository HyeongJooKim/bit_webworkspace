package com.bit.day14;

abstract class Lec01{
	// 추상클래스
	// 추상 클래스를 0개 이상 갖는 클래스
	// 추상메서드? 메서드의 선언만 있고 구현이 없는 메서드
		
		public abstract void func01();
		// {} 부분이 없는 메서드 ;필요함 문법상 안맞으니 오휴 떨어짐
		// abstract이라고 명확하게 알려줘야 함. 그러나 Class도 abstract붙어여 함		
}

class Lec11 extends Lec01{
	public void func01(){
		System.out.println("구현했음");// 상속받아 override하였음.
	}
}

public class Ex01 {

	public static void main(String[] args) {
//		Lec01 lec=new Lec01();// 호출이 안됨. 상속받거나 내부 클래스로 (다음에 배울 것)
//		lec.func01();
		Lec11 lec=new Lec11();// 상속받아서 구현됨. 뭔의미???
		lec.func01();// 협업시 placeholder 역할.
		// 연결고리만 만들어 놓고 일단 넘어갈 수 있게.
		// 강제성이 있음. 왜? method가 추상이면, class도 추상이어야 오류가 안 나니깐,
		// 구현을 덜한 메소드가 있다는 사실을 까먹지 않게 tagging 역할 하는 것. 
		
	}// main end
}// class Ex01 end
