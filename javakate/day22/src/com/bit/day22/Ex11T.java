package com.bit.day22;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex11T extends Frame {

	public Ex11T(){
		Panel p=new Panel();
		p.setLayout(new GridLayout(4,3));
		for(int i=0; i<12; i++){
			String num=null;
			if(i==9){
				num="*";
			}else if(i==10){
				num="0";
			}else if(i==11){
				num="#";
			}else{
				num=i+1+"";
			}
			Button btn=new Button(i+1+"");
			p.add(btn);
		}
		add(p);
		setLocation(200,200);
		setSize(300, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex11T();
	}
}