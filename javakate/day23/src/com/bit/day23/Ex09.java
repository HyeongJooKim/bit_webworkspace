package com.bit.day23;

//Event+������ǥ
//setLayout(null);�̸� ������ǥ.
//��� �ϳ��ϳ� ũ��, ��ġ�� ��������� ��.
//��� ���� ������. â�� �ٿ��� Ű���� �������� ����.
//â ũ�⵵ ����Ǿ� �־�� �ǹ� ����.

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class Ex09 extends Frame {

	public Ex09(){

		setResizable(false);//Frame�� ũ�� �������ִ� ��.
		Panel p=new Panel();
		p.setLayout(null);//null�̸� ������ǥ. 
		
		Button btn1=new Button("��ư1");
		btn1.setSize(200, 200);
		btn1.setLocation(0, 0);
		//�׳� Frame�� 0,0 ������ ���� �� ������ ������� ����. Panel �ְ� �� �ȿ� ������ ��
		p.add(btn1);
		
		TextField tf1=new TextField();
		tf1.setLocation(200,0);
		tf1.setSize(200,100);
		p.add(tf1);//setLocation setSize �����ָ� �ȳ���.
		
		add(p);
		setSize(500,500);
		setLocation(100, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex09();
	}
}
