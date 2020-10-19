package com.bit.day23;

//그리기
//이미지처리방식:비트맵 방식, 벡터방식 두가지
//비트맵 방식: 네모들이 이어져 있는 것. 좋아보이나 확대하면 네모로 깨짐.
//				그라데이션 쉬움. 일반 사진들. 포토샵 
//벡터 방식: 두 점을 잇는 선 개념. 확대해도 변화 없음.
//				그라데이션 어려움(용량 엄청 커짐). 일러스트레이터. 코렐드로우도 이 방식이네.
//				자바는 벡터방식임.

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Ex04 extends Frame{

	class MyCanvas extends Canvas{//Canvas 명령들 쓰기 위해서
		public void paint(Graphics g){
			g.drawString("welcome", 200, 200);
			g.setColor(Color.RED);
			g.drawLine(200, 200, 400, 400);
			g.drawRect(300, 300, 100, 100);
			g.fillRect(300, 400, 100, 100);
			g.setColor(Color.BLUE);
			g.fill3DRect(100, 100, 100, 100, true);
			g.drawArc(300, 100, 50, 100, 0, 180);
		}
	}
	
	public Ex04() {
		
		java.awt.Canvas can=new MyCanvas();
		add(can);
		
		setSize(800,600);
		setLocation(10, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex04();
	}
}