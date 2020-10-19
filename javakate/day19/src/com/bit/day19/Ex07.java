package com.bit.day19;

import java.util.LinkedList;

//Deque : 양쪽 끝에서 입출력 가능한 데이터 구조

public class Ex07 {

	public static void main(String[] args) {
		java.util.Deque deq=new LinkedList();
		//Deque 타입만 써보려고 
		//queue 타입으로 써보면 (FIFO)
		deq.offerFirst("일");
		deq.offerFirst("이");
		deq.offerFirst("삼");
		deq.offerFirst("사");
//		System.out.println(deq.pollLast());//일
//		System.out.println(deq.pollLast());//이
//		System.out.println(deq.pollLast());//삼
//		System.out.println(deq.pollLast());//사
		
		//Stack 타입으로 써보면 (LIFO)
		System.out.println(deq.pollFirst());//사
		System.out.println(deq.pollFirst());//삼
		System.out.println(deq.pollFirst());//이
		System.out.println(deq.pollFirst());//일
		
		deq.offerLast("A");
		deq.offerLast("B");
		deq.offerLast("C");
		deq.offerLast("D");
		
//		System.out.println(deq.pollFirst());//A
//		System.out.println(deq.pollFirst());//B
//		System.out.println(deq.pollFirst());//C
//		System.out.println(deq.pollFirst());//D
		
		System.out.println(deq.pollLast());//D
		System.out.println(deq.pollLast());//C
		System.out.println(deq.pollLast());//B
		System.out.println(deq.pollLast());//A
		
	}

}
