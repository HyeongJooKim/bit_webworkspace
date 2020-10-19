package com.bit.day21;

public class Ex11 {

	public static void main(String[] args) {
		
		boolean boo=true;
		try{
			int[] arr={1,3,5};
			System.out.println(arr[3]);
			if(boo){
//				System.exit(1);//이 경우만 제외. 이 경우는 JVM이 종료되므로 finally도 수행 안됨
				return;
				}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("에러회피");
		}finally{
			System.out.println("수고하셨습니다");
			//에러가 나던 안나던 반드시 수행함. 심지어 return 있어도 수행함.
			//try~catch~finally 또는 try~finally도 가능
		}
	}
}
