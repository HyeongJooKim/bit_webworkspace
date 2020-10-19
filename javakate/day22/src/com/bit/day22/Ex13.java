package com.bit.day22;

//TextArea

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex13 extends Frame {

	public Ex13(){
		Panel p=new Panel();
		p.setBackground(Color.BLUE);
		
		//여러줄 쓸 수 있는 text공간. 자동으로 스크롤바 생김
//		java.awt.TextArea ta=new TextArea(3,20);
		java.awt.TextArea ta=new TextArea("초기값",3,20,TextArea.SCROLLBARS_BOTH);
		//네번째 값 0이면 가로 세로 다 스크롤, 1이면 세로스크롤만, 2면 가로스크롤만, 3이면 둘 다 없음
//		ta.setText("출력\n두번째줄");
		ta.setEditable(true);//false면 수정 안됨. 긁어갈 수 있음
		ta.setEnabled(true);//false면 희미하게 보임 긁어가기도 안됨
		ta.setColumns(10);
		ta.setRows(10);
		p.add(ta);
		
		Button btn=new Button();
		btn.setEnabled(true);//버튼이 희미하게 보임. 불활성화. 클릭 안됨

		add(p);
		setLocation(200,200);
		setSize(500, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Ex13();
	}
}