package com.bit.day14;

// Interface: 추상 class의 장점을 최대한 살린 것.
// 다중상속이 불가능한 java에서 마치 다중상속을 받은 것처럼 기능하도록 함

interface Inter01{//class 처럼 쓰되 class 대신 interface 씀.
	// 오직 추상메소스만 가질 수 있음. 구현된 메소드는 가질 수 없음
	// 필드도 없음
	// 생성자도 없음 (클래스도 아니므로). 따라서 객체 생성 불가능
	// 예외) public static final 변수, 즉 상수만 가능
	// 예외) 메서드 앞에 public abstract 생략 가능
	
	public abstract void func01();
	public void func02();// abstract 안써도 됨. 어차피 다 추상메서드만 가질 수 있으니
//	private void func03();// private은 불가. 상속받는것이 목적이니 무조건 public 이어야 함.
	void func03();// interface에서는 안쓰면 public임. default 아니고
	
	public static final int su1=1111;
	static final int su2=2222; //public 생략가능
	final int su3=3333; //static도 생략가능
	int su4=4444; //상수형 변수만 가능하므로 final도 생략가능
	//즉, 변수처럼 쓰는 것으로 보여도, public static final 이 생략된 상수임.
}// end Inter01

interface Inter02{}
interface Inter03{}// API에도 이렇게 아무 내용 없는 Interface들 있다. 예: Serializable
// 빈 interface 왜 쓰나? 
	// 이름으로 클래스의 정보 제공. 
	// 분류, 제약도 가능 - 특정 클래스만 인자로 받고 싶을 때

public class Ex04 extends Object implements Inter01{
	// implements interfaces : 상속 받는 것과 거의 유사. 여러개의 Interfaces 받을 수 있다.
	// implements Inter01, Inter02, Inter03 이렇게 쓰면 됨
	// 상속도 또 받으면 다중상속 되는 셈. class 하나+Interface 여러개를 상속받을 수 있음.
	// 많이 쓰는 String 에서 있는 여러 메소드들 Interface 많다. 예: CharSequence

	public static void main(String[] args) {
		Inter01 me=new Ex04();
		me.func01();
		me.func02();
		me.func03();
		System.out.println(Inter01.su1);
		System.out.println(Inter01.su2);
		System.out.println(Inter01.su3);
		System.out.println(Inter01.su4);//su4++은 불가. final 안썼어도 final이므로.
	}
	
	@Override
	public void func01() {
	}
	
	@Override
	public void func02() {
	}
	
	@Override
	public void func03() {
	}

}// main end
