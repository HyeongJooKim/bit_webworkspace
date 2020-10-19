package com.bit.day22;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

//과제. 전화번호입력판 UI만들기

public class Ex11M1 {

	public static void main(String[] args) {

		Frame f=new Frame();
		Panel p=new Panel();
		GridLayout l=new GridLayout(4,3);
		p.setLayout(l);		
		
		Font font=new Font(Font.MONOSPACED,Font.BOLD,40);
		
		Button b1=new Button("1");
		Button b2=new Button("2");
		Button b3=new Button("3");
		Button b4=new Button("4");
		Button b5=new Button("5");
		Button b6=new Button("6");
		Button b7=new Button("7");
		Button b8=new Button("8");
		Button b9=new Button("9");
		Button b10=new Button("*");
		Button b11=new Button("0");
		Button b12=new Button("#");
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		b6.setFont(font);
		b7.setFont(font);
		b8.setFont(font);
		b9.setFont(font);
		b10.setFont(font);
		b11.setFont(font);
		b12.setFont(font);
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		
		f.add(p);
		f.setSize(300, 500);
		f.setVisible(true);
	}
}
