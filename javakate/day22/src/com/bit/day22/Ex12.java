package com.bit.day22;

//TextField

import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class Ex12 extends Frame {
	
	static java.awt.TextField tf1;
	
	public Ex12(){
		Font font=new Font(Font.MONOSPACED,Font.BOLD,20);
		Panel p=new Panel();
		//UI���� �Է°����� ����¥�� �ʵ�
		tf1=new TextField(5);//()�ȿ� ���� ������ ���� �� ĭ��ŭ ũ�� ũ�� ����
//		tf1.setText("abcdefg");//�� ũ�⸸ŭ ũ�� ����
		//ó������ �� ���� ũ�⸦ ũ�� �ְ� �ʹ�
		tf1.setText("");
		tf1.setEchoChar('@');
		//char�� ��. UI�� �Է½� �Է°� �Ⱥ��̰� ��� �������� ���� ����
		p.add(tf1);
		add(p);
		//1920*1080
		setLocation(1920/2-500/2,1080/2-300/2);
		setSize(500, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Ex12();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(tf1.getText());//UI�� ���� �� ��������
	}
}