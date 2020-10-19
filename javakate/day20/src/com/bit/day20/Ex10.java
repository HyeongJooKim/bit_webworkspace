package com.bit.day20;

//Generic
//이렇게 원하는 타입으로 casting해서 써야 하는 귀찮음을 덜기 위해
//새로 도입된 문법

class Com{
	void play(){
		System.out.println("열심히 총을 쏜다");
	}
}

class Ball{
	String color="검정색";
	void play(){
		System.out.println(color+" 공이 굴러갑니다");
	}
}

class BaseBall extends Ball{
	String color="흰색";
	void play(){
		System.out.println(" 던지고 놀 수도 있습니다");
	}
}

class Bowling extends Ball{
	String color="주황색";
	void play(){
		System.out.println("핀을 향해 ");
		super.play();
	}
	
}

class Box<T>{//Ball, Com 을 둘 다 담으려면 Object로. 다시 Generic으로 Object를 T로 (꼭 T가 아니어도 됨) 
	private T myBall;
	
	void push(T myBall){
		this.myBall=myBall;
	}
	
	T pull(){//변수를 private 했으니 함수 팔요
		return myBall;
	}
}

public class Ex10 {

	public static void main(String[] args) {

		BaseBall base=new BaseBall();
		Bowling bow=new Bowling();
		Com com=new Com();
		
		Box<BaseBall> box=new Box<BaseBall>();//객체 생성시 타입을 정해주는 것. 안정해주면 Object 임
		box.push(base);
		
		BaseBall ball2=box.pull();//<>를 넣어주니 casting 불필요
		ball2.play();
		
//		Bowling myBall=new Bowling();
//		myBall.play();//검정색 공이 굴러갑니다 나옴. this.color 가 지칭하는 Ball의 값이 나옴. Bowling 이 아니라
	}
}
