package com.bit.day13;

public class Ex04 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("abcdefg");
		sb1.reverse();//���� ������ ��. char�̶� ������ ��
		System.out.println(sb1);//gfedcba ��� �̰� String���� �غ��� �� �����غ���.
		
		char[] dest=new char[sb1.length()];
		sb1.getChars(5, sb1.length(), dest, 2);//StringBuffer���� �迭�� ��ȯ���ִ� method
		//sb1�� 5�ڸ����� �������� ���ڸ� dest �迭�� 2��° �ڸ����� ä����
		for(int i=0; i<dest.length; i++){
			System.out.println(i+"="+dest[i]);
		}
	}

}
