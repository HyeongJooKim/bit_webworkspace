package com.bit.day22;

//계산기판 만들어 보기

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.List;
import java.awt.Panel;

public class Ex17M1 extends Frame {

	public Ex17M1(){
		
		Panel p=new Panel();
//		BorderLayout lo=new BorderLayout();
		GridBagLayout l=new GridBagLayout();
		p.setLayout(l);

		Button bac=new Button("ac");
		GridBagConstraints c=new GridBagConstraints();
		c.fill=GridBagConstraints.BOTH;
		c.gridx=0;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		l.setConstraints(bac, c);
		p.add(bac);
		
		Button bstar=new Button("*");
		c=new GridBagConstraints();
		c.fill=GridBagConstraints.BOTH;
		c.gridx=1;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		l.setConstraints(bstar, c);
		p.add(bstar);
		
		Button bslash=new Button("/");
		c=new GridBagConstraints();
		c.fill=GridBagConstraints.BOTH;
		c.gridx=2;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		l.setConstraints(bslash, c);
		p.add(bslash);
		
		Button bplush=new Button("+");
		c=new GridBagConstraints();
		c.fill=GridBagConstraints.BOTH;
		c.gridx=3;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=2;
		c.weightx=1.0;
		c.weighty=1.0;
		l.setConstraints(bplush, c);
		p.add(bplush);
		
		Button bminus=new Button("-");
		c=new GridBagConstraints();
		c.fill=GridBagConstraints.BOTH;
		c.gridx=3;
		c.gridy=2;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		l.setConstraints(bminus, c);
		p.add(bminus);
		
		Button bequal=new Button("=");
		c=new GridBagConstraints();
		c.fill=GridBagConstraints.BOTH;
		c.gridx=3;
		c.gridy=3;
		c.gridwidth=1;
		c.gridheight=2;
		c.weightx=1.0;
		c.weighty=1.0;
		l.setConstraints(bequal, c);
		p.add(bequal);
		
		Button b0=new Button("0");
		c=new GridBagConstraints();
		c.fill=GridBagConstraints.BOTH;
		c.gridx=0;
		c.gridy=4;
		c.gridwidth=2;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		l.setConstraints(b0, c);
		p.add(b0);
		
		Button bdot=new Button(".");
		c=new GridBagConstraints();
		c.fill=GridBagConstraints.BOTH;
		c.gridx=2;
		c.gridy=4;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		l.setConstraints(bdot, c);
		p.add(bdot);
				
		int num=7;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				Button btn=new Button(num+j+"");
				c=new GridBagConstraints();
				c.fill=GridBagConstraints.BOTH;
				c.gridx=j;
				c.gridy=i+1;
				c.gridwidth=1;
				c.gridheight=1;
				c.weightx=1.0;
				c.weighty=1.0;
				l.setConstraints(btn, c);
				p.add(btn);
			}
			num=num-3;
		}
		
		p.setLayout(l);
		add(p);
		setSize(300,400);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Ex17M1();
	}
}