package com.bit.project1Socket;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Test extends Frame implements KeyListener{

	TextField tf;
	Label la;
	
	public Test(){
		
		Panel p=new Panel();
		
		tf=new TextField(10);
		tf.addKeyListener(this);
		p.add(tf);
		
		addKeyListener(this);//아무 Component에도 다 달 수 있음. 입력은 안되지만.
		add(p);
		setSize(500,300);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Test();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

		System.out.println("keyTyped"+e.getKeyCode());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed"+e.getKeyCode());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("keyPressed"+e.getKeyCode());
		
	}

}
