package com.bit.day22;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JLabel;

public class Ex10 extends Frame{
	
	Ex10(){
		Panel p=new Panel();
		Panel p2=new Panel();
		p2.setBackground(new Color(200,200,255));//rgb 0~255���� ���ڵ�
//		p.setLayout(new FlowLayout());
		//Panel�� default�� FlowLayout�̹Ƿ� �����൵ ����
		p.setLayout(new GridLayout());
		
		Button btn1=new Button("btn1");
		btn1.setLabel("New Name");
		btn1.setBackground(Color.WHITE);
		
		Font font=null;
		font=new Font("�ü�", Font.ITALIC, 20);//�ü� ���� swing������ �����ϳ�.
		
		btn1.setFont(font);
		
		JLabel la1=new JLabel("��1");
		la1.setText("����մϴ�");//�ι� �̸� ������ ������
		la1.setFont(font);
		System.out.println(la1.getText());
		
		Button btn2=new Button("btn2");
		p2.add(la1);
		p2.add(btn2);
		p.add(btn1);
		p.add(p2);
		
		add(p);		
		setLocation(200,200);
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Ex10();
	}
}