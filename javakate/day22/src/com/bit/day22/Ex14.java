package com.bit.day22;

//Checkbox

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex14 extends Frame {

	public Ex14(){
		Panel p=new Panel();
		Font font=new Font(Font.MONOSPACED,Font.BOLD,20);
		
		CheckboxGroup cbg=new CheckboxGroup();//동그란 모양의 라디오박스로. 하나만 true값이 됨.
		
		Checkbox chk01=new Checkbox("item1", false, cbg);
		Checkbox chk02=new Checkbox("item2", true, cbg);//check된 상태로 출력
		Checkbox chk03=new Checkbox("item3", true, cbg);//true 두 개 주니 마지막에 선택한 값으로 나오긴 함.
		//좋은 코딩 아님. 하나만 true로 코딩하라.
		
		chk01.setFont(font);
		chk02.setFont(font);
		chk03.setFont(font);
		
		p.add(chk01);
		p.add(chk02);
		p.add(chk03);

		add(p);
		setLocation(200,200);
		setSize(500, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Ex14();
	}
}