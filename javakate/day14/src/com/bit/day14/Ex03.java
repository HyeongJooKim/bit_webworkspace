package com.bit.day14;

abstract class Lec03{//추상 메서드 안가져도 ok
	
	Lec03(){
		super();// default로 안써도 같음. 숨어 있음
		System.out.println("부모객체생성");
	}
	
	void func01(){
		System.out.println("구현된 정상적인 메서드입니다");
	}
	
	abstract void func02();
}

class Lec33 extends Lec03{
	Lec33(){
		super();// default로 안써도 같음. 숨어 있음
		System.out.println("자식객체생성");
	}

	@Override // override 필요한 경우 클래스 이름에 마우스오버하면 추천으로 add 옵션으로 뜸.
	// 안필요한 경우 적으면 오류메시지 나옴 
	void func02() {
		System.out.println("자식에서 func02  구현");
	}
}

public class Ex03 {

	public static void main(String[] args) {
//		Lec03 you=new Lec03();//추상class 만 있으니 객체 생성 불가능.
// 								Lec03에 생성자 만들면 되지. 그래도 안됨
		Lec33 you=new Lec33();// 부모객체생성
								// 자식객체생성
		//상속받은class로 실행 가능. Lec33에 overriding 안했으면 Lec03 실행
		you.func01();// 구현된 정상적인 메서드입니다
		you.func02();// 자식에서 func02  구현
	}

}
