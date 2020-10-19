package com.bit.day19;

import java.util.Stack;

//class Stack : LIFO 방식 입출력

public class Ex08 {

	public static void main(String[] args) {

		java.util.Stack stack=new Stack();
		
		stack.push("item1");
		stack.push("item2");
		stack.push("item3");
		stack.push("item4");
		
//		System.out.println(stack.peek());//item4
//		System.out.println(stack.peek());//item4
//		System.out.println(stack.peek());//item4
//		System.out.println(stack.peek());//item4
//		
//		System.out.println(stack.pop());//item4
//		System.out.println(stack.pop());//item3
//		System.out.println(stack.pop());//item2
//		System.out.println(stack.pop());//item1

		while(!stack.empty()){
			System.out.println(stack.pop());//4~1로 출력
		}
		
	}

}
