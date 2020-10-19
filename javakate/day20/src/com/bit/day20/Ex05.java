package com.bit.day20;

import java.util.List;

//sort (List type)

//class Lec05 implements java.util.Comparator{//내부클래스로 보내 static 붙여줘도 같다. main 안으로 보내local class 해줘도 같다. 한번 쓰고 버리니 익명클래스로 해도 같다.
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
////		return (int)o1-(int)o2;//입력된 값들을 비교할 수 있게 해 준 것.
////		return (int)o2-(int)o1;//역순으로 정렬됨
////		return 1;//입력순으로 정렬됨
//		return -1;//입력 역순으로 정렬됨
//	}
//}

public class Ex05 {

	public static void main(String[] args) {
		java.util.List list=new java.util.ArrayList();
		list.add(1111);
		list.add(2222);
		list.add(7777);
		list.add(3333);
		list.add(2222);
		
		//디폴트는 입력순
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println("--------------");
		
		//소팅해보자
//		list.sort(new Lec05());//인자로 comparator 요구함. 그래서 Class 만들어줌 
		list.sort(new java.util.Comparator(){//익명클래스로 
			@Override
			public int compare(Object o1, Object o2) {
				return (int)o1-(int)o2;//입력된 값들을 비교할 수 있게 해 준 것.
//				return (int)o2-(int)o1;//역순으로 정렬됨
//				return 1;//입력순으로 정렬됨
//				return -1;//입력 역순으로 정렬됨
			}
		});

		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println("--------------");
		
		List list2=list.subList(1, 3);
		for(int i=0; i<list2.size(); i++){
			System.out.println(list2.get(i));
		}
	}
}