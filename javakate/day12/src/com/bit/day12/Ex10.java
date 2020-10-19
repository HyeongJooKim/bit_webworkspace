package com.bit.day12;

public class Ex10 {

	public static void main(String[] args) {
		// 
		String msg="JavaWebFramework";
		
		int su=msg.indexOf("Web");
		System.out.println(su);//찾는 단어 있으면 자릿수 나옴
		su=msg.indexOf("web");
		System.out.println(su);//찾는 단어 없으면 -1 나옴. 왜 하필 -1이지????
		
		String msg2=msg.replace('z','Z');//찾는 문자 없어도 오류는 안남
		System.out.println(msg2);
		
		char ch=msg.charAt(0);//음수 입력하면 오류
		System.out.println(ch);//J 출력
		
		boolean boo1=msg.contains("web");
		System.out.println(boo1);//false 출력. 해당문자 포함하는지 검사. 최근에 만들어져서 indexOf 더 많이 사용하게 될것
		
		boolean boo2=msg.startsWith("ja");
		System.out.println(boo2);//false 출력. 해당문자로 시작하는지 검사
		
		boolean boo3=msg.endsWith("work");
		System.out.println(boo3);//true 출력. 해당문자로 끝나는지 검사
		
		String st2=msg.toLowerCase();
		System.out.println(st2);//javawebframework 출력. 모두 소문자로 변경
		
		String st3=msg.toUpperCase();
		System.out.println(st3);//JAVAWEBFRAMEWORK 출력. 모두 대문자로 변경
		
		String msg1="";//비어 있는지 검사
		int len=msg1.length();//0나오면 빈 것. null이었으면 오류
		System.out.println(len);
		boolean boo4=msg1.isEmpty();//true 나옴. 비었으면 true. 띄어 쓰기 있으면 false. 빈 값이어야 true. null이었으면 오류
		System.out.println(boo4);
		
		String msg3="   Java         ";
		System.out.println(msg3);
		String st4=msg3.trim();//문장 앞뒤의 빈 공간 없애줌
		System.out.println(st4);
		
		
		
		
	}

}
