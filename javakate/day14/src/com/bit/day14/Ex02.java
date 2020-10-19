package com.bit.day14;
// 추상클래스 연습
abstract class Machine{// 이제 abstract가 되었으니 이젠 이 class를 상속받는 다른 class들은 반드시 work()을 overriding 해야 오류 안남.
	
	void on(){
		System.out.println("환영합니다");
	}
	void off(){
		System.out.println("종료합니다");
	}
	
	abstract void work();//상속받아서 override해서 구현할거야라고 abstract 달아서 표시해줌

}

class Tv extends Machine{
	void work(){
		System.out.println("화면과 소리를 재생합니다");
	}
//	너무 중복이 많으니 상속으로 해결
//	void on(){
//		System.out.println("환영합니다");
//	}
//	void off(){
//		System.out.println("종료합니다");
//	}
}

class Radio extends Machine{ 
	void work(){
		System.out.println("주파수를 잡아 소리를 재생합니다");
	}
	
//	work(){}를 작성 안하면 실행시 아래 오류 떨어짐
//	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		The type Audio must implement the inherited abstract method Machine.work()
//
//		at com.bit.day14.Audio.work(Ex02.java:41)
//		at com.bit.day14.Ex02.main(Ex02.java:88)

//	void on(){
//		System.out.println("환영합니다");
//	}
//	void off(){
//		System.out.println("종료합니다");
//	}
}

class Audio extends Machine{
	void work(){
		System.out.println("주파수를 잡아 소리를 재생합니다");
	}
//	void on(){
//		System.out.println("환영합니다");
//	}
//	void off(){
//		System.out.println("종료합니다");
//	}
}

public class Ex02 {

	public static void main(String[] args) {

//		Tv remote=new Tv();
//		remote.on();
//		remote.work();
//		remote.off();
//
//		Radio remote=new Radio();
//		remote.on();
//		remote.work();
//		remote.off();
		
		//한 리모콘으로 Tv, Radio 다 컨트롤하고 싶다

//		Machine remote=new Audio(); // Audio에 work()을 overriding 안하니 work은 수행이 안됨. 이러면 코딩을 제대로 안하고 까먹고 넘어갈 수 있음. 강제성 부여의 필요가 있음. 그래서 abstract를 붙여줌
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		Machine remote=null;
		
		while(true){
			System.out.println("1.TV 2.Radio 3.Audio 0.종료>>");
			int input=sc.nextInt();
			if(input==0){
				break;
			}else if(input==1){
				remote=new Tv();
			}else if(input==2){
				remote=new Radio();
			}else if(input==3){
				remote=new Audio();
			}
		remote.on();
		remote.work();
		remote.off();
		}
	}

}
