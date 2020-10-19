package com.bit.day20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//로또번호생성기
//Set은 이미 중복허용 안하니 
//TreeSet은 정렬되어 나오니
//추가로 보너스번호 출력하시오

public class Ex07 {//선생님코드

	public static void main(String[] args) {

		java.util.Set lotto=new java.util.HashSet();
		java.util.Random ran=new java.util.Random();
		
		while(lotto.size()<7){
			lotto.add(ran.nextInt(45)+1);
		}
		
		Iterator note=lotto.iterator();
		while(note.hasNext()){
			System.out.print(note.next()+" ");
		}
		System.out.println();
		System.out.println("-------------------");
				
		java.util.List list=new ArrayList(lotto);
		for(int i=0; i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		
		List list2=list.subList(0, 6);
		list2.sort(new Comparator(){
			@Override
			public int compare(Object o1, Object o2) {
				return (int)o1-(int)o2;//입력된 값들을 비교할 수 있게 해 준 것.
			}
		});
		list2.add(list.get(6));

		System.out.println();
		System.out.println("-------------------");
		
		for(int i=0; i<list2.size(); i++){
			System.out.print(list2.get(i)+" ");
		}
	}
}