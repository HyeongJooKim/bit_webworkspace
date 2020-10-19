package com.bit.day18;

public class Ex05 {

	public static void main(String[] args) {
		Queue que = new BitArray();
		//BitArray 객체를 생성했지만 interface BitStack타입을 가져옴으로써 그 interface에서 제한한 두 기능만 가능함
		que.push(1);
		que.push(12);
		que.push(123);
		que.push(1234);
		que.push(12445);
		System.out.println(que.pull());
		System.out.println(que.pull());
		System.out.println(que.pull());
		System.out.println(que.pull());
		System.out.println(que.pull());
	}
}
