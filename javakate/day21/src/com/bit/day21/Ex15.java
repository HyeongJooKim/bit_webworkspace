package com.bit.day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class Ex15 extends Frame{

	Ex15(){
		java.awt.BorderLayout layout=new BorderLayout();
		//���� ���ϰ� ���� layout. ��κ� �ٱ��� �̰�
		//�ٱ��� �̰ɷ� �ϰ� ���θ� �ٸ� layout���� ��ü�ؼ� ��ä�Ӱ� �ٹ̸� ��
		java.awt.FlowLayout layout2=new FlowLayout();
		Panel p=new Panel();
		p.setLayout(layout);

		Button btn1=new Button("��ư1");//�̸� �ٷ� ���� �� ����
		Button btn2=new Button("��ư2");
		Button btn3=new Button("��ư3");
		Button btn4=new Button("��ư4");
		
		Panel center=new Panel();
		p.setLayout(layout);
		
		Button btn5=new Button("��ư5");
		center.add(btn5);
		
//		p.add(btn1,"North");
		p.add(BorderLayout.NORTH,btn1);//�̷��� �ᵵ ����
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