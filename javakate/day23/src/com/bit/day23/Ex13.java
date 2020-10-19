package com.bit.day23;

import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;

public class Ex13 extends Frame implements ItemListener {
	
	Choice cho;
	List list;
	Checkbox ch1, ch2, ch3;
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
//		System.out.println("이벤트발생"+cho.getSelectedIndex());
//		System.out.println("이벤트발생"+cho.getSelectedItem());
////		System.out.println("이벤트발생"+list.getSelectedIndex());
////		System.out.println("이벤트발생"+list.getSelectedItem());
//		//멀티초이스일 경우
//		System.out.println(Arrays.toString(list.getSelectedIndexes()));
//		System.out.println(Arrays.toString(list.getSelectedItems()));
//		System.out.println(ch1.getState());
		System.out.println(e.getSource());
		
		if(e.getSource()==ch1){
			Checkbox obj = (Checkbox)e.getSource();
			System.out.println(obj.getLabel()+":"+obj.getState());
		}else if(e.getSource()==cho){
			System.out.println(cho.getSelectedItem());
		}	
	}
	public Ex13(){
	
		Panel p=new Panel();

		ch1=new Checkbox("check1");
		ch2=new Checkbox("check2");
		ch3=new Checkbox("check3");
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
		p.add(ch1);
		p.add(ch2);
		p.add(ch3);
		
		cho=new Choice();
		cho.addItemListener(this);
		cho.addItem("choice1");
		cho.addItem("choice2");
		cho.addItem("choice3");
		cho.addItem("choice4");
		p.add(cho);
		
		list=new List(4, true);
		list.addItemListener(this);
		list.addItem("item1");
		list.addItem("item2");
		list.addItem("item3");
		list.addItem("item4");
		p.add(list);

		add(p);
		setLocation(100, 200);
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex13();
	}
}
