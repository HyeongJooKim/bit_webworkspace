package com.bit.day18;

//ArrayList ���� ���� �˾ƺ���
//int, String������ ��θ� �����ϴ� Object�� �ٲٸ� ��� Ÿ���� �ڷ� �Է� �ϴ�

public class Ex04 {

	public static void main(String[] args) {
		//�ڷᱸ�� ��ü����
		BitArray list=new BitArray();
		//�ڷ� �Է�
		list.add("a");
		list.add("ab");
		list.add(1234);
		list.add("abcd");
		list.add("abcde");
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
//		System.out.println("----�����ֿ� ��� ��--------");
//		java.util.ArrayList list2=new java.util.ArrayList();
//		list2.add(1111);
//		list2.add(2222);
//		list2.add(4444);
//		list2.add(7777);
//		list2.add(8888);

		//���
		
		//���� ��� 
	}

}
