package com.bit.day13;

public class Ex06 {

	public static void main(String[] args) {
		//Math class
		//생성자 없음. 모두 static method임.
		//모두 private 생성자로 새 객체를 찍어내지 않음???

		double su1=3.54;
		System.out.println(Math.round(su1));//4 출력 반올림하고 int 반환
		System.out.println(Math.floor(su1));//3.0 출력 내림 double 출력
		System.out.println(Math.ceil(su1));//4.0 출력 올림하고 double 출력
		System.out.println(Math.abs(-1234));//1234 출력. 절대값 출력
		
	}

}
