package com.bit.day20;

import java.util.List;

//sort (List type)

//class Lec05 implements java.util.Comparator{//����Ŭ������ ���� static �ٿ��൵ ����. main ������ ����local class ���൵ ����. �ѹ� ���� ������ �͸�Ŭ������ �ص� ����.
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
////		return (int)o1-(int)o2;//�Էµ� ������ ���� �� �ְ� �� �� ��.
////		return (int)o2-(int)o1;//�������� ���ĵ�
////		return 1;//�Է¼����� ���ĵ�
//		return -1;//�Է� �������� ���ĵ�
//	}
//}

public class Ex05 {

	public static void main(String[] args) {
		java.util.List list=new java.util.ArrayList();
		list.add(1111);
		list.add(2222);
		list.add(7777);
		list.add(3333);
		list.add(2222);
		
		//����Ʈ�� �Է¼�
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println("--------------");
		
		//�����غ���
//		list.sort(new Lec05());//���ڷ� comparator �䱸��. �׷��� Class ������� 
		list.sort(new java.util.Comparator(){//�͸�Ŭ������ 
			@Override
			public int compare(Object o1, Object o2) {
				return (int)o1-(int)o2;//�Էµ� ������ ���� �� �ְ� �� �� ��.
//				return (int)o2-(int)o1;//�������� ���ĵ�
//				return 1;//�Է¼����� ���ĵ�
//				return -1;//�Է� �������� ���ĵ�
			}
		});

		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println("--------------");
		
		List list2=list.subList(1, 3);
		for(int i=0; i<list2.size(); i++){
			System.out.println(list2.get(i));
		}
	}
}