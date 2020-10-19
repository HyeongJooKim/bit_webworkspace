package com.bit.day12;

public class Ex01 extends com.bit.day11.Lec01 {
//class의 접근제한자: public, default 뿐

	public static void main(String[] args) {


		//상속안받은 경우
//		com.bit.day11.Lec01 you=new com.bit.day11.Lec01();
//		you.func01();
		
		//상속받은 경우
		Ex01 me=new Ex01();
		me.func01();
	}

}
