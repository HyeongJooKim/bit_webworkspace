package com.bit.day18;

//내부클래스
//2. 멤버 클래스

class Lec03{
	static int su1=1111;
	int su2=2222;	
	
	class Lec33{
		
//		static int su3=3333;//non-static class안에 static 변수 불가
		static final int su5=5555;//상수는 예외로 가능. 상수영역에 써놓고 시작하므로 가능.
		int su4=4444;
		
		Lec33(){}
		
//		static void func03(){}////non-static class안에 static 변수 불가

		void func04(){
			System.out.println(su1);//접근가능
			func01();//접근가능
			Lec03 lec03=new Lec03();
			System.out.println(lec03.su2);
			lec03.func02();
			func02();//역시 접근 가능. non-static 끼리 접근 가능한 것과 같아 보이는데...?
		}
	}

	Lec03(){}
	
	static void func01(){
//		System.out.println(su4);//접근 불가
		Lec03 me=new Lec03();
		Lec33 lec33=me.new Lec33();
		System.out.println(lec33.su4);
		lec33.func04();		
	}
	
	void func02(){
		Lec33 lec33=new Lec33();
		System.out.println(lec33.su4);
		lec33.func04();		
	}
}

public class Ex09 {

	public static void main(String[] args) {
		Lec03 outter=new Lec03();
		Lec03.Lec33 inner=outter.new Lec33();
		System.out.println(inner.su4);
		System.out.println(inner.su5);
		inner.func04();		
	}
}
