package com.bit.day23;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex14 extends Frame implements TextListener {

	public Ex14(){
		Panel p=new Panel();
		TextField tf=new TextField(20);
		tf.addTextListener(this);
		p.add(tf);
		add(p);
		setLocation(100, 200);
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex14();
	}

	@Override
	public void textValueChanged(TextEvent e) {
		System.out.println(((TextField)e.getSource()).getText());
		//값이 있는 키보드키에만 반응. 즉, 입력값이 변할 때만 호출됨
	}
}