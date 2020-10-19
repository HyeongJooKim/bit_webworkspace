package com.bit.day19;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		//()빈값이면 10개로 시작. 원하는 크기가 더 크면 초기 크기값을 주는 게 낫다.
		list1.add(1111);
		list1.add(2222);
		list1.add(3333);
		
		ArrayList list2=new ArrayList(list1);//깊은 복사됨
		list2.add(4444);//추가해도 list1에는 영향 없고, list2에만 추가됨
		for(int i=0; i<list2.size();i++){
			System.out.println(list2.get(i));//
		}
		
		System.out.println("---------------------------------");
		for(int i=0; i<list1.size();i++){
			System.out.println(list1.get(i));
		}
		System.out.println("---------------------------------");
		
	}

}
