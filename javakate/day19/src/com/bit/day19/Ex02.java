package com.bit.day19;

public class Ex02 {

	public static void main(String[] args) {
		BitLinkedList list=new BitLinkedList();
//		java.util.LinkedList list=new java.util.LinkedList();
		//이걸 쓰면 됨
		
		list.add(1);
		list.add(12);
		list.add(123);
		list.add(1234);
		list.add("12345");
		list.add("문자도 가능");
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}