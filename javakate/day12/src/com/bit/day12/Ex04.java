package com.bit.day12;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg="7";
		int[] arr={1,2,3,4,5};
		try{
			int su=Integer.parseInt(msg);
			System.out.println(arr[su]);
		}catch(Exception e){//�θ� ���� ���� ������ ������. �ڽ� ���� ���� ��� �θ� ���߿� ��ƾ� ��. �ظ��ϸ� Exception���� �� ó����
			System.out.println("Exception ��Ƴ�");
//		}catch(NumberFormatException e2){
//			System.out.println("NumberFormatException ��Ƴ�");
//		}catch(ArrayIndexOutOfBoundsException e3){
//			System.out.println("ArrayIndexOutOfBoundsException ��Ƴ�");
		}
	}
}
