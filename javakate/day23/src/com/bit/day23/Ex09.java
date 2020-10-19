package com.bit.day23;

//Event+절대좌표
//setLayout(null);이면 절대좌표.
//요소 하나하나 크기, 위치를 지정해줘야 함.
//모든 값이 고정됨. 창을 줄여도 키워도 동적반응 안함.
//창 크기도 고장되어 있어야 의미 있음.

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class Ex09 extends Frame {

	public Ex09(){

		setResizable(false);//Frame도 크기 고정해주는 것.
		Panel p=new Panel();
		p.setLayout(null);//null이면 절대좌표. 
		
		Button btn1=new Button("버튼1");
		btn1.setSize(200, 200);
		btn1.setLocation(0, 0);
		//그냥 Frame에 0,0 넣으면 제목 줄 때문에 깔끔하지 않음. Panel 넣고 그 안에 넣으면 됨
		p.add(btn1);
		
		TextField tf1=new TextField();
		tf1.setLocation(200,0);
		tf1.setSize(200,100);
		p.add(tf1);//setLocation setSize 안해주면 안나옴.
		
		add(p);
		setSize(500,500);
		setLocation(100, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex09();
	}
}
