package com.bit.day12;

public class Ex11 {

	public static void main(String[] args) {
		// ���� ���� �͵�
		
		String msg1="abcd";
		String msg2="abcd";
		String msg3="abcdefg";
		String msg4="abcf";
		String msg5="abcdefghijk";
		
		System.out.println(msg1.compareTo(msg2));//0 ����
		System.out.println(msg1.compareTo(msg3));//-3 ����. ���� ���ڰ� �ִ� ������ ������ ���, �� ���ڰ� ���������� ���̸� ��.
		System.out.println(msg3.compareTo(msg1));//3 ����
		System.out.println(msg1.compareTo(msg4));//-2 ����. 2�������� �����߱� ������ 0�̾��ٰ� 3������ �ٸ� ���ڰ� ������ �� ���ڰ��� �Ÿ��� ��. �� d-f �ؼ� -2 ���� ��
		System.out.println(msg1.compareTo(msg5));//-7 ����
	}

}
