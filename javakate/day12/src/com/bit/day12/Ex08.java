package com.bit.day12;

public class Ex08 {

	public static void main(String[] args) {
		//try~catch를 어느 위치에서 할 것인가?
		//1. for 안에서 하는 경우:
		int[] arr={1,2,3,4,5};
		for(int i=0; i<=5; i++){
			try{
				System.out.println(arr[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("에러회피");
				e.printStackTrace();
			}
		}
	}
}
