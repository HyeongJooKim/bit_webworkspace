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

public class Ex17T1 extends Frame {

	public Ex17T1(){
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
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		layout.setConstraints(btns[0], gbc);
		gbc.gridx=1;
		gbc.gridy=0;
		layout.setConstraints(btns[1], gbc);
		gbc.gridx=2;
		gbc.gridy=0;
		layout.setConstraints(btns[2], gbc);
		gbc.gridx=3;
		gbc.gridy=0;
		gbc.gridheight=2;
		layout.setConstraints(btns[3], gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridheight=1;
		layout.setConstraints(btns[4], gbc);
		gbc.gridx=1;
		gbc.gridy=1;
		layout.setConstraints(btns[5], gbc);
		gbc.gridx=2;
		gbc.gridy=1;
		layout.setConstraints(btns[6], gbc);
		
		gbc.gridx=0;
		gbc.gridy=2;
		layout.setConstraints(btns[7], gbc);
		gbc.gridx=1;
		gbc.gridy=2;
		layout.setConstraints(btns[8], gbc);
		gbc.gridx=2;
		gbc.gridy=2;
		layout.setConstraints(btns[9], gbc);
		gbc.gridx=3;
		gbc.gridy=2;
		layout.setConstraints(btns[10], gbc);

		gbc.gridx=0;
		gbc.gridy=3;
		layout.setConstraints(btns[11], gbc);
		gbc.gridx=1;
		gbc.gridy=3;
		layout.setConstraints(btns[12], gbc);
		gbc.gridx=2;
		gbc.gridy=3;
		layout.setConstraints(btns[13], gbc);
		gbc.gridx=3;
		gbc.gridy=3;
		gbc.gridheight=2;
		layout.setConstraints(btns[14], gbc);
		
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		layout.setConstraints(btns[15], gbc);
		gbc.gridx=2;
		gbc.gridy=4;
		layout.setConstraints(btns[16], gbc);
		
		for(int i=0; i<btns.length; i++){
			p2.add(btns[i]);
		}
		
		setSize(300,400);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Ex17T1();
	}
}