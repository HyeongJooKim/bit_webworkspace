package com.bit.day20;

//Generic: jdk 1.5 �� ����
//Collections Framework�� Generic ���� �Ǿ� ����

import java.util.ArrayList;

public class Ex11 {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String> ();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
//		list.add(5);//int ������ ����

		String item1=list.get(0);
		String item2=list.get(1);
		String item3=list.get(2);
		String item4=list.get(3);
	}
}