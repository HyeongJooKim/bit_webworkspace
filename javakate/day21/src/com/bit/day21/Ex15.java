package com.bit.day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class Ex15 extends Frame{

	Ex15(){
		java.awt.BorderLayout layout=new BorderLayout();
		//가장 흔하게 쓰는 layout. 대부분 바깥은 이거
		//바깥을 이걸로 하고 내부를 다른 layout으로 대체해서 다채롭게 꾸미면 됨
		java.awt.FlowLayout layout2=new FlowLayout();
		Panel p=new Panel();
		p.setLayout(layout);

		Button btn1=new Button("버튼1");//이름 바로 넣을 수 있음
		Button btn2=new Button("버튼2");
		Button btn3=new Button("버튼3");
		Button btn4=new Button("버튼4");
		
		Panel center=new Panel();
		p.setLayout(layout);
		
		Button btn5=new Button("버튼5");
		center.add(btn5);
		
//		p.add(btn1,"North");
		p.add(BorderLayout.NORTH,btn1);//이렇게 써도 같음
		p.add(btn2,"South");
		p.add(btn3,"East");
		p.add(btn4,"West");
		p.add(center,"Center");
		
		add(p);
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Ex15();
	}
}