package com.bit.day23;

//��� �޴��� �߰�

import java.awt.Button;
import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ex02 extends Frame{

	public Ex02() {
		
		java.awt.MenuBar mb=new MenuBar();
		java.awt.Menu mn1=new Menu("File");
		//�޴�������
		MenuItem mi1=new MenuItem("New");
		mn1.add(mi1);
		MenuItem mi2=new MenuItem("Save");
		mn1.add(mi2);
		mn1.addSeparator();
		MenuItem mi3=new MenuItem("Exit");
		mn1.add(mi3);
		mb.add(mn1);
		java.awt.Menu mn2=new Menu("Help");
		mb.add(mn2);
		
		//Checkbox�޴�
		MenuItem mn2_1=new java.awt.CheckboxMenuItem("Welcome");
		MenuItem mn2_2=new CheckboxMenuItem("Help", true);
		MenuItem mn2_3=new CheckboxMenuItem("About");
//		MenuItem mn2_4=new MenuItem("����");
		Menu mn2_4=new Menu("����");
		MenuItem mn2_4_1=new MenuItem("����1");
		MenuItem mn2_4_2=new MenuItem("����2");
		mn2_4.add(mn2_4_1);
		mn2_4.add(mn2_4_2);
		
		mn2.add(mn2_1);
		mn2.add(mn2_2);
		mn2.add(mn2_3);
		mn2.add(mn2_4);
		
		setMenuBar(mb);//add�� ������ �ȵ�. add�ϸ� ��ư �ֵ��� ȭ�鿡 ������ �ǳ�?
		
		Button btn=new Button("test");
		add(btn);
		
		setSize(500,300);
		setLocation(100, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}