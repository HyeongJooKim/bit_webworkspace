package com.bit.day18;

//내부클래스(inner class)
//국내에선 그닥 선호 안함. 욕먹을수도
//안드로이드앱 제작하려면 써야 함.
//클래스 안에 있는 클래스. 메소드 안에 있을 수도 있음.
//naming pattern: Ex07$Ex77 이런 식으로 사용함.
//상속개념이 생기기 전 활용도 높았음. 내부클래스가 외부클래스를 상속한 것와 동일한 효과

class Lec01{

	//1. 스태틱 클래스, 정적(중첩)클래스
	static class Lec11{}
	
	//2. 인스턴스 클래스, 멤버 클래스
	class Lec12{}
	
	void func01(){
		//3. 로컬 클래스, 지역 클래스
		class Lec13{
			
		}
	}
}

public class Ex07 {

	public static void main(String[] args) {
		
	}
}
