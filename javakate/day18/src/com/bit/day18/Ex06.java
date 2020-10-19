package com.bit.day18;

public class Ex06 {

	public static void main(String[] args) {
		BitStack stack = new BitArray();
		//interface BitStack타입을 가져옴으로써 그 interface에서 제한한 두 기능만 가능함
		stack.push(1);
		stack.push(12);
		stack.push(123);
		stack.push(1234);
		stack.push(12445);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
