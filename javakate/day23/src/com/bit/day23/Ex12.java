package com.bit.day23;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex12 extends Frame implements KeyListener{

	TextField tf;
	Label la;
	
	public Ex12(){
		
		Panel p=new Panel();
		p.setLayout(null);
		
		tf=new TextField(10);
		tf.addKeyListener(this);
		p.add(tf);
		
		la=new Label("@");
		la.setLocation(0, 0);
		la.setSize(50, 50);
		p.add(la);
		
		Button btn=new Button();
		btn.addKeyListener(this);//아무 Component에도 다 달 수 있음. 입력은 안되지만.
		p.add(btn);
		
		addKeyListener(this);//아무 Component에도 다 달 수 있음. 입력은 안되지만.
		add(p);
		setSize(500,300);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Ex12();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		System.out.println("keyTyped: "+e.getKeyCode());//키보드 누른 키값
//		System.out.println("keyTyped: "+e.getKeyChar());//키보드 누른 키값
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed: "+tf.getText());
		//값이 입력되는 순간이므로 이 순간엔 값이 없다. 문잡값이 있는 키를 눌러야만 작동됨
		System.out.println("keyPressed: "+e.getKeyCode());
//		System.out.println("keyPressed: "+e.getKeyChar());
		int x=la.getX();
		int y=la.getY();
		if(e.getKeyCode()==38){
			la.setLocation(x, y-10);
		}else if(e.getKeyCode()==40){
			la.setLocation(x, y+10);
		}else if(e.getKeyCode()==39){
			if(x+10<=500){
				la.setLocation(x+10, y);
			}else{
				la.setLocation(0, y);
			}
		}else if(e.getKeyCode()==37){
			if(x-10>=0){
				la.setLocation(x-10, y);
			}else{
				la.setLocation(500, y);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {//입력값 있음
//		System.out.println("keyReleased: "+e.getKeyCode());
		System.out.println("keyReleased: "+e.getKeyChar());
	}
}
