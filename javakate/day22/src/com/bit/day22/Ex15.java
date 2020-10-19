package com.bit.day22;

//Choice

import java.awt.Choice;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;

public class Ex15 extends Frame {

	public Ex15(){
		Panel p=new Panel();
//		Font font=new Font(Font.MONOSPACED,Font.BOLD,20);
//		
		Choice cho=new Choice();
		cho.addItem("item1");
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4");

		cho.select(1);

		p.add(cho);

		
		add(p);
		setSize(500, 300);
		Dimension dim=getSize();
		int w=dim.width;
		int h=dim.height;
		setLocation(1920/2-w/2,1080/2-h/2);
		setVisible(true);
		System.out.println(cho.getSelectedIndex());
		System.out.println(cho.getSelectedItem());
	}
	
	public static void main(String[] args) {

		new Ex15();
	}
}