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
		btn.addKeyListener(this);//�ƹ� Component���� �� �� �� ����. �Է��� �ȵ�����.
		p.add(btn);
		
		addKeyListener(this);//�ƹ� Component���� �� �� �� ����. �Է��� �ȵ�����.
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
		
		System.out.println("keyTyped: "+e.getKeyCode());//Ű���� ���� Ű��
//		System.out.println("keyTyped: "+e.getKeyChar());//Ű���� ���� Ű��
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed: "+tf.getText());
		//���� �ԷµǴ� �����̹Ƿ� �� ������ ���� ����. ���Ⱚ�� �ִ� Ű�� �����߸� �۵���
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
	public void keyReleased(KeyEvent e) {//�Է°� ����
//		System.out.println("keyReleased: "+e.getKeyCode());
		System.out.println("keyReleased: "+e.getKeyChar());
	}
}
