package com.bit.day19;

import java.util.LinkedList;

//LinkedList에서만 더 있는 method들

public class Ex06 {

	public static void main(String[] args) {
		java.util.Queue list=new LinkedList();
		//Queue 타입만 쓰려고 다형성 이용
		//Queue는 FIFO 방식. 중간 값 못 빼냄
		list.offer("첫번째");//List의 add()에 해당
		list.offer("두번째");
		list.offer("세번째");
		list.offer("네번째");
		
//		for(int i=0; i<4; i++){
//			String msg=(String)list.peek();//List의 element()에 해당
//			System.out.println(msg);//아무리 뽑아도 첫번째 값만 계속 리턴함. 그 값을 지워줘야 다음 값을 리턴할 수 있는 구조임
//			list.poll();//List의 remove() 에 해당. 입력된 순서대로 값을 지움. 
//		}

		while(list.peek()!=null){
			String msg=(String)list.poll();
			System.out.println(msg);
		}
	}
}
