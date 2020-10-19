package com.bit.day21;

public class Ex12 {

	public static void main(String[] args) {

		java.awt.Frame frame=new java.awt.Frame();
//		javax.swing.JFrame frame=new javax.swing.JFrame();
		//method 이름은 거의 같음. swing이AWT 기반으로 만들어졌기 때문에
		
		//배치관리자 필요
		//컴포넌트 구성요소들 종류, 사용방법 알아야
		//이벤트 처리 필요. 기능부여해야
		
		java.awt.Button btn01=new java.awt.Button();
		btn01.setSize(100, 50);
		btn01.setLocation(100, 50);
		btn01.setLabel("버튼입니다");
		frame.add(btn01);
		
		java.awt.Button btn02=new java.awt.Button();
		btn02.setSize(100, 50);
		btn02.setLocation(200, 50);
		btn02.setLabel("두번째 버튼");
		frame.add(btn02);

		java.awt.Button btn03=new java.awt.Button();
		btn03.setSize(100, 50);
		btn03.setLocation(200, 100);
		btn03.setLabel("세번째 버튼");
		frame.add(btn03);

		frame.setSize(500, 300);//픽셀 단위
		frame.setLocation(100, 300);
		frame.setVisible(true);
	}
}
