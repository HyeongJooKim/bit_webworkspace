package com.bit.day13;

public class Ex02 {

	public static void main(String[] args) {
		// StringBuffer�� Buffer�� ũ��� �뷮 �����ϴ� ��
		StringBuffer sb1=new StringBuffer();
		System.out.println("buffer size="+sb1.capacity());//buffer size=16 ���
		StringBuffer sb2=new StringBuffer(5);//�������� ���ڿ��� �ƴ� int�� �Է��ϸ� �ʱ� buffer ũ�� �����Ͽ� ���� �ø� �� ����.
		System.out.println(sb2);// buffer size=5 ���
		
		System.out.println("buffer size=" + sb2.capacity());// buffer size=5 ���
		for (int i = 0; i<9; i++) {
			sb2.append(i);
			System.out.println(sb2 + ":" + sb2.capacity());
			//���� ������ ������� ���� ���� ������ 
			//�ʿ��� ���� 2���� �迭�� �ڵ�����(��������)�ϵ��� �Ǿ� ����. 
		}
		for (int i = 0; i<6; i++) {
			sb2.delete(sb2.length()-1,sb2.length());
			System.out.println(sb2 + ":" + sb2.capacity());
			//�ѹ� �þ Buffer �� �뷮�� �پ���� ���� 
		}
		sb2.trimToSize();//�Ⱦ��� �뷮�� ������.
		System.out.println(sb2 + ":" + sb2.capacity());
		
	}
}
