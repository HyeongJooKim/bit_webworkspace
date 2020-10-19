package com.bit.day12;

public class Ex02 {

	public static void main(String[] args) {
	//예외처리
		String msg="1234원";
//		for(int i=0; i<msg.length(); i++){
//			if(Character.isDigit(msg.charAt(i))){
//			}else{
//				System.out.println("문자가 들어갔습니다");
//				return;
//			}
//		}
		try{//try{} 안에 있는 내용을 시도해보고 catch() 안에 있는 오류가 있는 경우 실행 멈춤.
		System.out.println("다음줄에서 에러발생 가능");
		Integer su=new Integer(msg);//이줄에서 에러발생하므로 이줄부터는 실행 멈춘 것 
		System.out.println("에러가 없었네요");
		System.out.println("su="+su);
		}catch(NumberFormatException a){//오류없는 경우만 실행하고, 오류가 있으면 멈춰버림
			System.out.println("오류를 잡아냈습니다");			
		}
		System.out.println("실행했었음");

	}

}
