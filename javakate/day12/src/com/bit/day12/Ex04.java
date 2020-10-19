package com.bit.day12;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg="7";
		int[] arr={1,2,3,4,5};
		try{
			int su=Integer.parseInt(msg);
			System.out.println(arr[su]);
		}catch(Exception e){//부모가 먼저 오면 하위는 오류남. 자식 먼저 오류 잡고 부모 나중에 잡아야 함. 왠만하면 Exception으로 다 처리됨
			System.out.println("Exception 잡아냄");
//		}catch(NumberFormatException e2){
//			System.out.println("NumberFormatException 잡아냄");
//		}catch(ArrayIndexOutOfBoundsException e3){
//			System.out.println("ArrayIndexOutOfBoundsException 잡아냄");
		}
	}
}
