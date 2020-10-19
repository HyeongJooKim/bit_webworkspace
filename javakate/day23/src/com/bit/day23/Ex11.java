package com.bit.day23;

//더블클릭만들어보자

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex11 extends Frame implements MouseListener{
	
	int cnt;
	long before;
	long after;

	@Override
	public void mouseClicked(MouseEvent e) {
		cnt++;
		if(cnt==1){
			before=System.currentTimeMillis();
		}else if(cnt==2){
			after=System.currentTimeMillis();
			if(after-before<1000){
				System.out.println("더블클릭");
				cnt=0;
			}else{
				before=after;
				cnt=1;
			}
		}	
	}
	
	public Ex11(){

		addMouseListener(this);
		setSize(600,600);
		setLocation(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex11();
	}

	@Override
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}


}
