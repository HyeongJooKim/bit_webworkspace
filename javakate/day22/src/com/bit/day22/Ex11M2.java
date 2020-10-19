package com.bit.day22;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.util.ArrayList;

//과제. 전화번호입력판 UI만들기
//반복 너무 많은데 Array로 해보자

public class Ex11M2 {

	public static void main(String[] args) {

		String[] arr={"1","2","3","4","5","6","7","8","9","*","0","#"};

		Frame f=new Frame();
		Panel p=new Panel();
		GridLayout l=new GridLayout(4,3);
		p.setLayout(l);		
		Font font=new Font(Font.MONOSPACED,Font.BOLD,40);
		
		for(int i=0; i<12; i++){
			Button btn=new Button(arr[i]);
			btn.setFont(font);
			p.add(btn);
		}
	
		f.add(p);
		f.setLocation(200,200);
		f.setSize(300, 500);
		f.setVisible(true);
	}
}