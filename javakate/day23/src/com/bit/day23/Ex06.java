package com.bit.day23;

import javax.swing.JFrame;

public class Ex06 extends JFrame{//swing�̰� �ϳ� mac���� �����ϸ� �����ư �������� ���� �س���
	
	public Ex06(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);//WindowListener �Ƚᵵ ��
		setSize(500,300);
		setLocation(100, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex06();
	}
}
