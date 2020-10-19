package com.bit.day20;

import java.util.Iterator;

//Set
//HashSet: Set의 default로 이걸 쓰면 됨. 입력되는 값의 hashcode로 비교
//TreeSet: 이진트리로 값을 비교해서 큰지 작은지를 비교해서 소팅함.
//TreeSet이 얼마나 불편한가?

class MyCar implements Comparable{
	int su;
	MyCar(int a){
		su=a;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return su-((MyCar)o).su;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		java.util.Set set=new java.util.TreeSet();
		set.add(new MyCar(1));//HashSet이었으면 그냥 잘 입력되었을 것
		set.add(new MyCar(2));//TreeSet에서는 이진트리로 비교하니 그냥은 비교대상이 없어 ClassCastException남
		set.add(new MyCar(3));//그래서 비교가능하도록 Comparable 을 상속받고 MyCar로 casting 해줘야 비교 가능
		set.add(new MyCar(4));
		
		Iterator ite=set.iterator();
		while(ite.hasNext()){ 
			MyCar car=(MyCar)ite.next();
			System.out.println(car.su);
		}
		
//		java.util.Set set1=new java.util.HashSet();
//		set1.add("일");
//		set1.add("이");
//		set1.add("삼");
//		set1.add("사");
//		
//		Iterator ite=set1.iterator();
//		while(ite.hasNext()){//순서 없이 Random으로 나옴. 같은 값 입력해도 결과 사람마다 다를 수 있음 
//			System.out.println(ite.next());
//		}
//		
//		System.out.println("-----------------------");
//		
//		java.util.Set set2=new java.util.TreeSet();
//		set2.add("일");
//		set2.add("이");
//		set2.add("삼");
//		set2.add("사");
//		
//		Iterator ite2=set2.iterator();
//		while(ite2.hasNext()){//문자는 문자값을 비교해서 순서대로 나옴. 이 순서는 누가 해도 같음
//			System.out.println(ite2.next());
//		}
//		
//		System.out.println("-----------------------");
//		
//		java.util.Set set3=new java.util.TreeSet();
//		set3.add(1111);
//		set3.add(2222);
//		set3.add(3333);
//		set3.add(4444);
//		
//		Iterator ite3=set3.iterator();
//		while(ite3.hasNext()){//정수는 입력순서로 나오네
//			System.out.println(ite3.next());
	
	}
}