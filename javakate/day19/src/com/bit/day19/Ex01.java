package com.bit.day19;

public class Ex01 {

	public static void main(String[] args) {
		BitArrayList list=new BitArrayList();
//		java.util.ArrayList list=new java.util.ArrayList();//�̰Ͱ� ����.
//		���� method ��ɾ BitArrayList�� ����غ�����.
		list.add("1");
		list.add("12");
		list.add("123");
		list.add("1234");
		list.add("12345");
		list.add("���ڿ��� ����");

		for(int i=0; i<list.size(); i++){
//			Object item=list.get(i);//����ȯ ���� ����Generic �ٷ� ��
			//�� ���ڿ��̸�
			String item=(String)list.get(i);//����ȯ ���� ����Generic �ٷ� ��
			System.out.println(list.get(i));
		}
	}
}
