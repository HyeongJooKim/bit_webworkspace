package com.bit.day19;
//�׳� ArrayList ���� ��. �����غ��ڴ�.
//ó���ӵ��� ArrayList�� �ξ� ����

public class Ex03 {

	public static void main(String[] args) {
		java.util.ArrayList list=new java.util.ArrayList();
		long before=System.currentTimeMillis();
		for(int i=0; i<999999; i++){
			list.add(i);
		}
		Object temp=null;
		for(int i=0; i<999999; i++){
			temp=list.get(i);
		}
		long after=System.currentTimeMillis();
		System.out.println(after-before);//16 ����
		
		java.util.LinkedList list2=new java.util.LinkedList();
		long before2=System.currentTimeMillis();
		for(int i=0; i<999999; i++){
			list2.add(i);
		}
		Object temp2=null;
		for(int i=0; i<999999; i++){
			temp2=list.get(i);
		}
		long after2=System.currentTimeMillis();
		System.out.println(after2-before2);//125 ����
	}

}
