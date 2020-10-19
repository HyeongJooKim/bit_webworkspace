package com.bit.day22;

//Choice

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class Ex16 extends Frame {

	public Ex16(){
		
		Panel p=new Panel();
		List list=new List(5, true);//기본 길이는 4줄. 길이 늘리면 됨;
		//다중선택 가능하게 하려면 두번깨 요소를 true로
		list.addItem("item1");//오해의 없으려고 일부러 이걸 쓰는 개발자들 많음.
		list.addItem("item2");
		list.add("item3");//method 이름 같으니 import잘해야 함.
		list.add("item4");

		list.select(0);//이 값으로 선택된 태로 보임
		
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