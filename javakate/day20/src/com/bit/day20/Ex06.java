package com.bit.day20;

import java.util.ArrayList;

//�ζǹ�ȣ������(ver0.1.0)

public class Ex06 {//���ڵ�

	public static void main(String[] args) {
		System.out.println("�ζǹ�ȣ������(ver0.1.0)");
		System.out.println("-------------------------");
		
		ArrayList lotto=new ArrayList();
		java.util.Random ran=new java.util.Random();
		int a=ran.nextInt(45)+1;
		for(int i=0; i<6; i++){
			while(lotto.contains(a)){//�̹� �ִ� ���̸�
				a=ran.nextInt(45)+1;
			}
			lotto.add(a);
		}
		
		lotto.sort(new java.util.Comparator(){ 
			@Override
			public int compare(Object o1, Object o2) {
				return (int)o1-(int)o2;
			}
		});
				
		for(int i=0; i<lotto.size(); i++){
			System.out.println(lotto.get(i));
		}
	}
}
