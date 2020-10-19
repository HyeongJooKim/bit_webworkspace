package com.bit.day12;

public class Ex07 {

	public static void main(String[] args) {
		System.out.println("main start");
		try{
		func01();
		}catch(Exception e){
			System.out.println("회피");
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();//가능하면 써서 어디서 오류가 났는지 볼 수 있다. 
			//이 한줄만 쓰면 개발자 입장에서 알 수 있음. 
			//시스템에 여유 생기면 출력하는 거라 아무 순서로 출력함. 
			//그래서 어떨땐 main end 앞에, 어떨땐 뒤에 나오네...
		}
		System.out.println("main end");
	}

	public static void func01() throws NumberFormatException {
		//호출하는 곳에서 try~catch를 한다면 오류가 발생할 곳에서 throws 예외 이름 써줘서 오류발생 위치 던져줌
//		NumberFormatException err=new NumberFormatException();
//		throw err;
//		int a=Integer.parseInt("a");
	}
}
