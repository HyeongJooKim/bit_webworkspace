package com.bit.day22;

//TextArea

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex13 extends Frame {

	public Ex13(){
		Panel p=new Panel();
		p.setBackground(Color.BLUE);
		
		//������ �� �� �ִ� text����. �ڵ����� ��ũ�ѹ� ����
//		java.awt.TextArea ta=new TextArea(3,20);
		java.awt.TextArea ta=new TextArea("�ʱⰪ",3,20,TextArea.SCROLLBARS_BOTH);
		//�׹�° �� 0�̸� ���� ���� �� ��ũ��, 1�̸� ���ν�ũ�Ѹ�, 2�� ���ν�ũ�Ѹ�, 3�̸� �� �� ����
//		ta.setText("���\n�ι�°��");
		ta.setEditable(true);//false�� ���� �ȵ�. �ܾ �� ����
		ta.setEnabled(true);//false�� ����ϰ� ���� �ܾ�⵵ �ȵ�
		ta.setColumns(10);
		ta.setRows(10);
		p.add(ta);
		
		Button btn=new Button();
		btn.setEnabled(true);//��ư�� ����ϰ� ����. ��Ȱ��ȭ. Ŭ�� �ȵ�

		add(p);
		setLocation(200,200);
		setSize(500, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Ex13();
	}
}