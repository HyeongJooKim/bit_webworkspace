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
		
		CheckboxGroup cbg=new CheckboxGroup();//���׶� ����� �����ڽ���. �ϳ��� true���� ��.
		
		Checkbox chk01=new Checkbox("item1", false, cbg);
		Checkbox chk02=new Checkbox("item2", true, cbg);//check�� ���·� ���
		Checkbox chk03=new Checkbox("item3", true, cbg);//true �� �� �ִ� �������� ������ ������ ������ ��.
		//���� �ڵ� �ƴ�. �ϳ��� true�� �ڵ��϶�.
		
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