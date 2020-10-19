package com.bit.day23;

//Event

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex05 extends Frame implements WindowListener{
	
	public Ex05() {
		
		this.addWindowListener(this);
		setSize(500,300);
		setLocation(100, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("âȰ��ȭ��");//1������ ����ǳ�
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("â��Ȱ��ȭ��");//
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("â����");//2������ ����
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("â�ݱ�");//X ��ư ������ ����.
//		System.exit(0);//��������. �����
		dispose();//â ����
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("â����");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("�ּ�ȭ");//�ּ�ȭ ������ ����
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("�ּ�ȭ���");
		
	}


}