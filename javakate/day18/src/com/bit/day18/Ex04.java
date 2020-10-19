package com.bit.day18;

//ArrayList 동작 원리 알아보자
//int, String만들어보고 모두를 통합하는 Object로 바꾸면 모든 타입의 자료 입력 하능

public class Ex04 {

	public static void main(String[] args) {
		//자료구조 객체생성
		BitArray list=new BitArray();
		//자료 입력
		list.add("a");
		list.add("ab");
		list.add(1234);
		list.add("abcd");
		list.add("abcde");
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
//		System.out.println("----다음주에 배울 것--------");
//		java.util.ArrayList list2=new java.util.ArrayList();
//		list2.add(1111);
//		list2.add(2222);
//		list2.add(4444);
//		list2.add(7777);
//		list2.add(8888);

		//출력
		
		//수정 기능 
	}

}
