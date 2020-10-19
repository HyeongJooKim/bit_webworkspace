package com.bit.day20;

import java.util.Iterator;

//Set
//HashSet: Set�� default�� �̰� ���� ��. �ԷµǴ� ���� hashcode�� ��
//TreeSet: ����Ʈ���� ���� ���ؼ� ū�� �������� ���ؼ� ������.
//TreeSet�� �󸶳� �����Ѱ�?

class MyCar implements Comparable{
	int su;
	MyCar(int a){
		su=a;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return su-((MyCar)o).su;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		java.util.Set set=new java.util.TreeSet();
		set.add(new MyCar(1));//HashSet�̾����� �׳� �� �ԷµǾ��� ��
		set.add(new MyCar(2));//TreeSet������ ����Ʈ���� ���ϴ� �׳��� �񱳴���� ���� ClassCastException��
		set.add(new MyCar(3));//�׷��� �񱳰����ϵ��� Comparable �� ��ӹް� MyCar�� casting ����� �� ����
		set.add(new MyCar(4));
		
		Iterator ite=set.iterator();
		while(ite.hasNext()){ 
			MyCar car=(MyCar)ite.next();
			System.out.println(car.su);
		}
		
//		java.util.Set set1=new java.util.HashSet();
//		set1.add("��");
//		set1.add("��");
//		set1.add("��");
//		set1.add("��");
//		
//		Iterator ite=set1.iterator();
//		while(ite.hasNext()){//���� ���� Random���� ����. ���� �� �Է��ص� ��� ������� �ٸ� �� ���� 
//			System.out.println(ite.next());
//		}
//		
//		System.out.println("-----------------------");
//		
//		java.util.Set set2=new java.util.TreeSet();
//		set2.add("��");
//		set2.add("��");
//		set2.add("��");
//		set2.add("��");
//		
//		Iterator ite2=set2.iterator();
//		while(ite2.hasNext()){//���ڴ� ���ڰ��� ���ؼ� ������� ����. �� ������ ���� �ص� ����
//			System.out.println(ite2.next());
//		}
//		
//		System.out.println("-----------------------");
//		
//		java.util.Set set3=new java.util.TreeSet();
//		set3.add(1111);
//		set3.add(2222);
//		set3.add(3333);
//		set3.add(4444);
//		
//		Iterator ite3=set3.iterator();
//		while(ite3.hasNext()){//������ �Է¼����� ������
//			System.out.println(ite3.next());
	
	}
}