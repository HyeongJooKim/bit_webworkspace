package com.bit.day20;

//Vector. java 초기부터 있던 동적할당 자료구조
//implements List
//Vector를 직접 쓸 일은 거의 없을 것이나, Vector를 사용한 정보를 받을 일은 많을 것이다.
//값을 뽑아낼 줄은 알아야 함.

public class Ex01 {

	public static void main(String[] args) {
		java.util.Vector vec01=new java.util.Vector();
		vec01.addElement("일");
		vec01.addElement("이");
		vec01.addElement("삼");
		vec01.addElement("사");
		
		for(int i=0; i<vec01.size(); i++){
			System.out.println(vec01.get(i));
		}
		System.out.println("------------------");
		
		System.out.println(vec01.elementAt(0));
		System.out.println(vec01.elementAt(1));
		System.out.println(vec01.elementAt(2));
		System.out.println(vec01.elementAt(3));
		
		System.out.println("------------------");
		
		vec01.insertElementAt("3번째", 2);//끼워넣기
		vec01.removeElementAt(3);//index 번호로 삭제
		vec01.removeElement("사");//값으로 삭제
		
		System.out.println(vec01.elementAt(0));
		System.out.println(vec01.elementAt(1));
		System.out.println(vec01.elementAt(2));
		
		System.out.println("------------------");
		
		vec01.add("오");
		vec01.add("육");
		
		java.util.Enumeration em=vec01.elements();//번호를 세서 읽어줌.
		//읽은 값을 바꿔도 원래 값은 안바뀜(당연한듯) 읽기전용되는 것.
		//자료는 보호하고 읽기로 공유할 수 있다.
//		System.out.println(em.nextElement());//다음 값 없으면 java.util.NoSuchElementException
//		System.out.println(em.hasMoreElements());//다음 값이 있으면 true
		
		while(em.hasMoreElements()){//동적 출력 가능하게
			System.out.println(em.nextElement());
		}
		vec01.lastIndexOf("다섯번째");
	}
}
