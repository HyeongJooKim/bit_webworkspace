package com.bit.day18;

//내부클래스
//3. 로컬 클래스

class Lec04{
	static int su1=1111;
	int su2=2222;	
	
	Lec04(){}
	
	static void func01(){
//		static int su=0;//불가
		int su99=999999;
		class Lec55{}
			}
	
	void func02(final int su5){ //(fianl int su5)라도 쓰인 것과 같음. 즉 값을 못바꿈
//		static int su=0;//불가
//		static final int su5=5555;//가능
		int su9=9999;//final이 숨어 있음
		
		class Lec44{
//			static int su=0;//불가
			static final int su33=1;//가능
			int su9=9999;
//			su9=1111;//이렇게 값을 바꾸면 오류남
			Lec44(){}
//			static void func03(){}
			void func04(){}
			void func05(){
				func04();
				func02(1);
				//~jdk 1.7 지역변수에서는 final  필수
				//jdk 1.8~ final 생략가능. 생략되어 있는 거지 없는 건 아님.
				int a=su9;
				int b=su1;
				int c=su2;
			}
		}
	}
}

public class Ex10 {

	public static void main(String[] args) {

	}
}
