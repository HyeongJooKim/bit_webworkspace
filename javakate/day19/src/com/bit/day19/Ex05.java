package com.bit.day19;
//ArrayList�� method��. LinkedList������ ������
import java.util.ArrayList;

public class Ex05 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add(111);
		list1.add(2222);
		list1.add(1, 3333);//index 1 �ڸ��� �����ֱ�
		list1.add(5555);
		
		ArrayList list2=new ArrayList();
		list2.addAll(list1);//��������ó�� ��
		list2.clear();//��� �� ����
		
		ArrayList list3=(ArrayList)list1.clone();//��������ó�� ��
		list1.add(4444);//1���� �߰���. ������ 2.3���� �ȴ�����.
		list3.set(1,"clone");
		System.out.println(list3.toString());
		
		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i));
		}
		
		System.out.println("---------------------");
		
		for(int i=0; i<list2.size(); i++){
			System.out.println(list2.get(i));
		}
		
		System.out.println("---------------------");
		
		for(int i=0; i<list3.size(); i++){
			System.out.println(list3.get(i));
		}

		System.out.println(list1.contains(4444));//true
		System.out.println(list1.indexOf(3333));//1
		list1.add(3333);
		System.out.println(list1.indexOf(3333));//1 ������ ��� ù�� ��ȯ
		System.out.println(list1.lastIndexOf(3333));//4
		System.out.println(list1.isEmpty());//false
		System.out.println(list2.isEmpty());//true
		
		System.out.println("---------------------");
		list1.remove(2);
//		list1.remove(2222);//������, ������ ������ index ��ȣ�� �ν�
//		list1.removeAll(list3);//list3�� �ִ� ���鸸 �� ����		
		list1.set(0,1111);//0��ġ�� ���� �ٽ� ����.
		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i));
		}
		System.out.println("---------------------");
		Object[] arr=list1.toArray();//ArrayList�� Array�� �迭�� ��ȯ
		//ArrayList�� �⺻������ Object Ÿ����
		for(int i=0; i<list1.size(); i++){
			System.out.println(arr[i]);
		}
		//int �迭�� �ް� ������ ����ȯ�ؼ� �����ؾ� ��
		int[] arr2=new int[arr.length];
		for(int i=0; i<arr.length; i++){
			arr2[i]=(int)arr[i];
		}
		
		list1.trimToSize();//�Ⱦ��� ũ�⸦ ���ְ� �� �ִ� ��ŭ���θ� �迭 buffer ũ�� ����
		
	}

}
