package com.bit.day22;

//TextField

import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class Ex12 extends Frame {
	
	static java.awt.TextField tf1;
	
	public Ex12(){
		Font font=new Font(Font.MONOSPACED,Font.BOLD,20);
		Panel p=new Panel();
		//UI에서 입력가능한 한줄짜리 필드
		tf1=new TextField(5);//()안에 정수 넣으면 거의 그 칸만큼 크기 크게 생김
//		tf1.setText("abcdefg");//이 크기만큼 크게 생김
		//처음부터 빈 공간 크기를 크게 주고 싶다
		tf1.setText("");
		tf1.setEchoChar('@');
		//char만 됨. UI에 입력시 입력값 안보이게 대신 보여지는 문자 지정
		p.add(tf1);
		add(p);
		//1920*1080
		setLocation(1920/2-500/2,1080/2-300/2);
		setSize(500, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Ex12();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(tf1.getText());//UI에 적힌 값 가져오기
	}
}