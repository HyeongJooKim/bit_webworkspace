package com.bit.day12;

public class Ex03 {

	public static void main(String[] args) {
		String msg="1a";//1a�� ���ڰ� ���� ������ ���� �޽��� ����: java.lang.NumberFormatException
		int[] arr=new int[10];//
//		try{
//			try{
//				int su=Integer.parseInt(msg);
//				double su2=10.0/su;
//				arr[su]=(int)su2;//���ο� ���� �߻�. java.lang.ArrayIndexOutOfBoundsException
//				System.out.println("10/"+msg+"="+su2);
//			}catch(NumberFormatException e){
//				System.out.println("���ڸ� �Է��ϼ���");
//			}
//		}catch(ArrayIndexOutOfBoundsException e2){
//			System.out.println("�迭�� ������ ������");
//		}
			
			try{
				int su=Integer.parseInt(msg);
				double su2=10.0/su;
				arr[su]=(int)su2;//���ο� ���� �߻�. java.lang.ArrayIndexOutOfBoundsException
				System.out.println("10/"+msg+"="+su2);
			}catch(RuntimeException e){
				System.out.println("������ ȸ���߽��ϴ�");// �� ������ �θ� class ������ �Է��ϸ� �ڽĵ� ��� ��Ƴ�.
			}
	}
}