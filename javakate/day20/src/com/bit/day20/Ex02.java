package com.bit.day20;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

//Vector capacity

public class Ex02 {

	public static void main(String[] args) {

		Vector vec1=new Vector();
		System.out.println(vec1.capacity());//10 ���� ������ 10�� �⺻������

		ArrayList list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Vector vec2=new Vector(list);
		System.out.println(vec2.capacity());//5 ���� �ְ� �����ϴ� �� ũ�⸸ŭ��
//		Enumeration em=vec2.elements();
//		while(em.hasMoreElements()){
//			System.out.println(em.nextElement());
//		}
		
		Vector vec3=new Vector(3);
		System.out.println(vec3.capacity());//3 ũ�⸦ ����
		
		for(int i=0; i<11; i++){
			vec1.addElement(i);
		}
		System.out.println(vec1.capacity());//20 ���ڶ����� ������ 2��� Ŀ��
		
		Vector vec4=new Vector(3,2);//3�� ����, 2���� �þ�� Vector.
		//�������� buffer�� ũ�� �������� �ʱ⿡ ������.
		//�Ӻ���峪 ���� �� �ڿ� ȿ������� �߿��� ��� Vector�� ������ ���� ���Ǵ� ����
		//Array ����̶� ������ ����.
		
	}

}
