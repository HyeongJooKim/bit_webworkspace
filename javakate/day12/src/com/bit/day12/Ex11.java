package com.bit.day12;

public class Ex11 {

	public static void main(String[] args) {
		// 쓰면 좋은 것들
		
		String msg1="abcd";
		String msg2="abcd";
		String msg3="abcdefg";
		String msg4="abcf";
		String msg5="abcdefghijk";
		
		System.out.println(msg1.compareTo(msg2));//0 나옴
		System.out.println(msg1.compareTo(msg3));//-3 나옴. 비교할 문자가 있는 곳까지 동일할 경우, 한 문자가 끝나버리면 길이를 비교.
		System.out.println(msg3.compareTo(msg1));//3 나옴
		System.out.println(msg1.compareTo(msg4));//-2 나옴. 2번까지는 동일했기 때문에 0이었다가 3번에서 다른 문자가 들어오면 두 문자간의 거리를 비교. 즉 d-f 해서 -2 나온 것
		System.out.println(msg1.compareTo(msg5));//-7 나옴
	}

}
