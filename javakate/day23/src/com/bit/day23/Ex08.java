package com.bit.day23;

//마우스동작

import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex08 extends Frame implements MouseMotionListener {

	public Ex08(){
		Panel p=new Panel();
		p.addMouseMotionListener(this);
		
		add(p);
		setSize(500,300);
		setLocation(100, 200);
		setVisible(true);
		System.out.println("w:"+p.getWidth()+"h:"+p.getHeight());//Frame보다 좀 작아짐. 484, 261로
	}
	
	public static void main(String[] args) {
		new Ex08();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int x=e.getX();
		int y=e.getY();
		System.out.println("mouseDragged x:"+x+", y:"+y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouseMoved");
	}
}
