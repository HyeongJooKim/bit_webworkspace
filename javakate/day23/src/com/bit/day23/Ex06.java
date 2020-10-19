package com.bit.day23;

import javax.swing.JFrame;

public class Ex06 extends JFrame{//swing이간 하나 mac에서 실행하면 종료버튼 왼쪽으로 가게 해놨음
	
	public Ex06(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);//WindowListener 안써도 됨
		setSize(500,300);
		setLocation(100, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex06();
	}
}
