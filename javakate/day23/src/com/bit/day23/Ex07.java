package com.bit.day23;

//Event, 마우스

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex07 extends Frame implements MouseListener{
	
	public Ex07() {

		Panel p=new Panel();
		
		Button btn=new Button("버튼");
		btn.addMouseListener(this);
		p.addMouseListener(this);//어디든 붙일 수 있음.
		p.add(btn);
		
		add(p);
		setSize(500,300);
		setLocation(100, 200);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new Ex07();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked");		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed");		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Released");		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Entered");		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Exited");		
		
	}
}
