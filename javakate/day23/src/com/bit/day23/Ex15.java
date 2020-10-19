package com.bit.day23;

import java.awt.Button;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex15 extends Frame implements ActionListener {
//동작이 발생하는 모두에 붙일 수 있음. 버튼 등
	
	public Ex15(){
		Panel p=new Panel();
		TextField tf=new TextField(20);
		tf.addActionListener(this);
		p.add(tf);
		
		Button btn=new Button();
		btn.addActionListener(this);
		p.add(btn);
		
		List list=new List();
		list.addActionListener(new ActionListener(){
			//익명클래스 써서 여러 개의 Action들 구분할 수 있다.
			public void actionPerformed(ActionEvent e) {
				System.out.println("list의 이벤트");				
			}
		});//선택하고 엔터 쳐야 Action발생하네
		list.addItem("item1");
		list.addItem("item2");
		list.addItem("item3");
		p.add(list);
		
		add(p);
		setLocation(100, 200);
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex15();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("이벤트발생");///입력후 엔터 누르니 발생
	}
}
