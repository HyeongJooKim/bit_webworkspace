package com.bit.day20;

//Set: 수학의 집합 개념. 순서 없다. 즉, 중복값 불가.
//List타입은 index 번호란 게 숨어 있으니 중복값도 가능했었지만.
//HashSet

public class Ex03 {

	public static void main(String[] args) {
		java.util.HashSet set01= new java.util.HashSet();
		set01.add("일");
		set01.add("이");
		set01.add("삼");
		set01.add("사");
		set01.add("일");//입력 오류는 안나도 값이 4개인 것으로 받아들임. 입력안된 것
		
		System.out.println(set01.size());//4
		
		java.util.Iterator ite=set01.iterator();//Vector의 Enumeration 과 유사
		//Iterator는 일회용. 한 번 읽고 나면 다시 읽지는 않는다. 
		//그래서 while, for 둘다는 안되는 것. 다시 읽어오려면 Iterator를 다시 만들어야 함.
		//이건 Enumeration도 같음.
//		System.out.println(ite.next());//순서 없으니 제맘대로 나옴
//		System.out.println(ite.next());//갯수 넘어가면 java.util.NoSuchElementException
		
		System.out.println("----------------------");
		
		for(int i=0; i<set01.size(); i++){
			System.out.println(ite.next());			
		}
		
		System.out.println("----------------------");
		java.util.Iterator ite2=set01.iterator();//다시 만들면 읽어짐
		while(ite2.hasNext()){//for는 오류날 확률 높으니 while방식 쓰는 게 좋다
			System.out.println(ite2.next());			
		}
	}

}
