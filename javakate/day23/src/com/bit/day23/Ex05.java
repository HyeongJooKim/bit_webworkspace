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
		System.out.println("창활성화됨");//1번으로 실행되네
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("창비활성화됨");//
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("창열림");//2번으로 실행
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("창닫기");//X 버튼 누르면 실행.
//		System.exit(0);//강제종료. 비권장
		dispose();//창 닫힘
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("창닫힘");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("최소화");//최소화 누르면 실행
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("최소화취소");
		
	}


}