package com.bit.day22;

//계산기판 만들어 보기
//상위 TextField추가

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Ex17T2 extends Frame {

	public Ex17T2(){
		Panel p=new Panel();
		Panel p2=new Panel();
		
		setLayout(new BorderLayout());
		add(BorderLayout.NORTH, new TextField());
		add(BorderLayout.CENTER, p2);
		
		String[] names={"ac","*","/","+","7","8","9","4","5","6","-","1","2","3","=","0","."};
		
		Button[] btns=new Button[17];
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button(names[i]);
		}
		GridBagLayout layout=new GridBagLayout();
		p2.setLayout(layout);
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;

		int a=0;
		func(p2, layout, gbc, btns[a++], 0,0,1,1);
		func(p2, layout, gbc, btns[a++], 1,0,1,1);
		func(p2, layout, gbc, btns[a++], 2,0,1,1);
		func(p2, layout, gbc, btns[a++], 3,0,1,2);
		func(p2, layout, gbc, btns[a++], 0,1,1,1);
		func(p2, layout, gbc, btns[a++], 1,1,1,1);
		func(p2, layout, gbc, btns[a++], 2,1,1,1);
		func(p2, layout, gbc, btns[a++], 0,2,1,1);
		func(p2, layout, gbc, btns[a++], 1,2,1,1);
		func(p2, layout, gbc, btns[a++], 2,2,1,1);
		func(p2, layout, gbc, btns[a++], 3,2,1,1);
		func(p2, layout, gbc, btns[a++], 0,3,1,1);
		func(p2, layout, gbc, btns[a++], 1,3,1,1);
		func(p2, layout, gbc, btns[a++], 2,3,1,1);
		func(p2, layout, gbc, btns[a++], 3,3,1,2);
		func(p2, layout, gbc, btns[a++], 0,4,2,1);
		func(p2, layout, gbc, btns[a++], 2,4,1,1);
		
		setSize(300,400);
		setLocation(200,200);
		setVisible(true);
	}
	
	public void func(Panel p2, GridBagLayout layout, GridBagConstraints gbc, Button btn, int x, int y, int w, int h){
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=w;
		gbc.gridheight=h;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btn, gbc);
		p2.add(btn);
	}
	
	public static void main(String[] args) {

		new Ex17T2();
	}
}