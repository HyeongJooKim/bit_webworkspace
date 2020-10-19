package com.bit.day20;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

//Vector capacity

public class Ex02 {

	public static void main(String[] args) {

		Vector vec1=new Vector();
		System.out.println(vec1.capacity());//10 값이 없으면 10을 기본값으로

		ArrayList list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Vector vec2=new Vector(list);
		System.out.println(vec2.capacity());//5 값을 넣고 시작하니 그 크기만큼만
//		Enumeration em=vec2.elements();
//		while(em.hasMoreElements()){
//			System.out.println(em.nextElement());
//		}
		
		Vector vec3=new Vector(3);
		System.out.println(vec3.capacity());//3 크기를 지정
		
		for(int i=0; i<11; i++){
			vec1.addElement(i);
		}
		System.out.println(vec1.capacity());//20 모자라지면 기존의 2배로 커짐
		
		Vector vec4=new Vector(3,2);//3개 시작, 2개씩 늘어나는 Vector.
		//쓸데없이 buffer를 크게 가져가지 않기에 유용함.
		//임베디드나 서버 등 자원 효율사용이 중요한 경우 Vector가 여전히 많이 사용되는 이유
		//Array 기반이라 성능은 좋다.
		
	}

}
