package com.bit.day19;

import java.util.LinkedList;

//Deque : ���� ������ ����� ������ ������ ����

public class Ex07 {

	public static void main(String[] args) {
		java.util.Deque deq=new LinkedList();
		//Deque Ÿ�Ը� �Ẹ���� 
		//queue Ÿ������ �Ẹ�� (FIFO)
		deq.offerFirst("��");
		deq.offerFirst("��");
		deq.offerFirst("��");
		deq.offerFirst("��");
//		System.out.println(deq.pollLast());//��
//		System.out.println(deq.pollLast());//��
//		System.out.println(deq.pollLast());//��
//		System.out.println(deq.pollLast());//��
		
		//Stack Ÿ������ �Ẹ�� (LIFO)
		System.out.println(deq.pollFirst());//��
		System.out.println(deq.pollFirst());//��
		System.out.println(deq.pollFirst());//��
		System.out.println(deq.pollFirst());//��
		
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
