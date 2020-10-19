package com.bit.day21;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

//UI-배치관리자

public class Ex13 {

	public static void main(String[] args) {
		
		java.awt.Frame frame=new Frame();
		java.awt.Panel p=new Panel();
//		java.awt.FlowLayout layout=new FlowLayout();
		//버튼 크기는 글씨길이에 따라 최소크기로 자동 생성
		//버튼 위치 위부터 가운데정렬함. 모자라면 개행함
		java.awt.GridLayout layout=new GridLayout(2,2);
		//default는 1열로 나옴 
		//(row, column) 지정 가능, 배치 순서는 1열 채우고 다음열
		//Grid를 넘어가는 양이 들어가면 row는 고정하고 가로를 쪼갬
		
		p.setLayout(layout);
		
		Button btn01=new Button();
		btn01.setLabel("버튼1");
		Button btn02=new Button();
		btn02.setLabel("버튼2");
		Button btn03=new Button();
		btn03.setLabel("길이가긴버튼3");
		Button btn04=new Button();
		btn04.setLabel("길이가긴버튼4");
		Button btn05=new Button();
		btn05.setLabel("길이가긴버튼4");
		
		p.add(btn01);
		p.add(btn02);
		p.add(btn03);
		p.add(btn04);
		p.add(btn05);
		
		frame.add(p);
		frame.setSize(200, 300);
		frame.setVisible(true);
	}
}
