package com.bit.day20;

import java.util.Iterator;
import java.util.Set;

//로또번호생성기
//Set은 이미 중복허용 안하니 
//TreeSet은 정렬되어 나오니

//추가로 보너스번호 출력하시오

public class Ex08 {

	public static void main(String[] args) {

		java.util.Set lotto=new java.util.TreeSet();
		java.util.Random ran=new java.util.Random();
		
		while(lotto.size()<6){
			lotto.add(ran.nextInt(45+1));
		}
		
		Iterator note=lotto.iterator();
		while(note.hasNext()){
			System.out.println(note.next()+" ");
		}
		
//추가로 보너스번호 출력하시오
		System.out.println("---------------");
		
		Set lotto7=new java.util.HashSet();
		lotto7.addAll(lotto);
		
		while(lotto7.size()<7){
			lotto7.add(ran.nextInt(45+1));//중복 없는 수가 들어감. 이 순서를 그대로 뽑아야 함.
		}
		
		Iterator note7=lotto7.iterator();
		while(note7.hasNext()){
			System.out.println(note7.next()+" ");
		}
		
//		Iterator note2=lotto.iterator();
//		Iterator note7=lotto7.iterator();
//		for(int i=0; i<lotto7.size(); i++){
//			for(int j=0; j<lotto.size(); j++){
//				note2.nextInt()==note7.nextInt();				
//			}
//		}
//		while(true){
//			
//		}
		
	}

}
