package com.bit.day12;

public class Ex03 {

	public static void main(String[] args) {
		String msg="1a";//1a등 문자가 섞여 있으면 오류 메시지 나옴: java.lang.NumberFormatException
		int[] arr=new int[10];//
//		try{
//			try{
//				int su=Integer.parseInt(msg);
//				double su2=10.0/su;
//				arr[su]=(int)su2;//새로운 오류 발생. java.lang.ArrayIndexOutOfBoundsException
//				System.out.println("10/"+msg+"="+su2);
//			}catch(NumberFormatException e){
//				System.out.println("숫자만 입력하세요");
//			}
//		}catch(ArrayIndexOutOfBoundsException e2){
//			System.out.println("배열의 범위를 벗어났어요");
//		}
			
			try{
				int su=Integer.parseInt(msg);
				double su2=10.0/su;
				arr[su]=(int)su2;//새로운 오류 발생. java.lang.ArrayIndexOutOfBoundsException
				System.out.println("10/"+msg+"="+su2);
			}catch(RuntimeException e){
				System.out.println("에러를 회피했습니다");// 두 오류의 부모 class 오류를 입력하면 자식들 모두 잡아냄.
			}
	}
}