package com.bit.day23;

//Event+절대좌표

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex10 extends Frame implements MouseMotionListener{
	
	Button btn;
	
	public Ex10(){

		Panel p=new Panel();
		p.setLayout(null);
		p.addMouseMotionListener(this);
		
		btn=new Button("#");
		btn.setSize(50, 50);
		btn.setLocation(0, 0);//600,600 하면 Frame 밖에 있어서 숨어 있음
		p.add(btn);
	
		add(p);
		setSize(600,600);
		setLocation(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex10();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int x=e.getX();
		int y=e.getY();
		btn.setLocation(x, y);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
//		int x=e.getX();
//		int y=e.getY();
//		btn.setLocation(x, y);
	}
}
