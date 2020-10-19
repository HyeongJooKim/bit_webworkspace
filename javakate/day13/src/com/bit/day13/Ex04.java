package com.bit.day13;

public class Ex04 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("abcdefg");
		sb1.reverse();//순서 뒤집어 줌. char이라 가능한 것
		System.out.println(sb1);//gfedcba 출력 이걸 String에서 해보는 것 연습해보라.
		
		char[] dest=new char[sb1.length()];
		sb1.getChars(5, sb1.length(), dest, 2);//StringBuffer에서 배열로 변환해주는 method
		//sb1의 5자리부터 끝까지의 문자를 dest 배열의 2번째 자리부터 채워라
		for(int i=0; i<dest.length; i++){
			System.out.println(i+"="+dest[i]);
		}
	}

}
