package com.bit.day19;

public class Ex01 {

	public static void main(String[] args) {
		BitArrayList list=new BitArrayList();
//		java.util.ArrayList list=new java.util.ArrayList();//이것과 같음.
//		같은 method 명령어를 BitArrayList에 사용해보았음.
		list.add("1");
		list.add("12");
		list.add("123");
		list.add("1234");
		list.add("12345");
		list.add("문자열도 가능");

		for(int i=0; i<list.size(); i++){
//			Object item=list.get(i);//형변환 관련 내일Generic 다룰 것
			//다 문자열이면
			String item=(String)list.get(i);//형변환 관련 내일Generic 다룰 것
			System.out.println(list.get(i));
		}
	}
}
