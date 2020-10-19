package com.bit.day23;

//â�ݱ� �Ϸ��� ���� �̷��� Lec16 Ŭ���� ����� ��ӹ޾Ƶΰ� ����Ŭ������ ����� �ȴ�.
//�� ������ �� �̸� �س��� ���� WindowAdapter. �̷� ��Ư�� ���̵��� ��κ� Adapter�� ����.
//�޼ҵ� �ѵΰ��� interface�� ������ ������ ~Listener�� �ش��ϴ� ~Adapter ��κ� ������.

import java.awt.Button;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//class Lec16 implements WindowListener{
//	public void windowOpened(WindowEvent e) {}
//	public void windowClosing(WindowEvent e) {}
//	public void windowClosed(WindowEvent e) {}
//	public void windowIconified(WindowEvent e) {}
//	public void windowDeiconified(WindowEvent e) {}
//	public void windowActivated(WindowEvent e) {}
//	public void windowDeactivated(WindowEvent e) {}
//}

public class Ex16 extends Frame {
	
	public Ex16(){
//		addWindowListener(new Lec16(){
//			@Override
//			public void windowClosing(WindowEvent e) {
//				dispose();
//			}
//		});
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		setLocation(100, 200);
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex16();
	}
}