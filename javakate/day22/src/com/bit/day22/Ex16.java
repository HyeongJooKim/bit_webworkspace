package com.bit.day22;

//Choice

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class Ex16 extends Frame {

	public Ex16(){
		
		Panel p=new Panel();
		List list=new List(5, true);//�⺻ ���̴� 4��. ���� �ø��� ��;
		//���߼��� �����ϰ� �Ϸ��� �ι��� ��Ҹ� true��
		list.addItem("item1");//������ �������� �Ϻη� �̰� ���� �����ڵ� ����.
		list.addItem("item2");
		list.add("item3");//method �̸� ������ import���ؾ� ��.
		list.add("item4");

		list.select(0);//�� ������ ���õ� �·� ����
		
		p.add(list);
		add(p);
		Dimension dim=new Dimension(500,300);
		setSize(dim);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Ex16();
	}
}