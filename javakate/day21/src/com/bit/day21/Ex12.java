package com.bit.day21;

public class Ex12 {

	public static void main(String[] args) {

		java.awt.Frame frame=new java.awt.Frame();
//		javax.swing.JFrame frame=new javax.swing.JFrame();
		//method �̸��� ���� ����. swing��AWT ������� ��������� ������
		
		//��ġ������ �ʿ�
		//������Ʈ ������ҵ� ����, ����� �˾ƾ�
		//�̺�Ʈ ó�� �ʿ�. ��ɺο��ؾ�
		
		java.awt.Button btn01=new java.awt.Button();
		btn01.setSize(100, 50);
		btn01.setLocation(100, 50);
		btn01.setLabel("��ư�Դϴ�");
		frame.add(btn01);
		
		java.awt.Button btn02=new java.awt.Button();
		btn02.setSize(100, 50);
		btn02.setLocation(200, 50);
		btn02.setLabel("�ι�° ��ư");
		frame.add(btn02);

		java.awt.Button btn03=new java.awt.Button();
		btn03.setSize(100, 50);
		btn03.setLocation(200, 100);
		btn03.setLabel("����° ��ư");
		frame.add(btn03);

		frame.setSize(500, 300);//�ȼ� ����
		frame.setLocation(100, 300);
		frame.setVisible(true);
	}
}
