package com.bit.day23;

//�׸���
//�̹���ó�����:��Ʈ�� ���, ���͹�� �ΰ���
//��Ʈ�� ���: �׸���� �̾��� �ִ� ��. ���ƺ��̳� Ȯ���ϸ� �׸�� ����.
//				�׶��̼� ����. �Ϲ� ������. ���伥 
//���� ���: �� ���� �մ� �� ����. Ȯ���ص� ��ȭ ����.
//				�׶��̼� �����(�뷮 ��û Ŀ��). �Ϸ���Ʈ������. �ڷ���ο쵵 �� ����̳�.
//				�ڹٴ� ���͹����.

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Ex04 extends Frame{

	class MyCanvas extends Canvas{//Canvas ��ɵ� ���� ���ؼ�
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