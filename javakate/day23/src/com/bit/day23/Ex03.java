package com.bit.day23;

//���ӵ� â

import java.awt.FileDialog;
import java.awt.Frame;

public class Ex03 extends Frame{

	public Ex03() {
		
//		this.setName("Ex03");//�̰� �ȵǳ�...
		setSize(800,600);
		setLocation(10, 200);
		setVisible(true);
		
//		java.awt.Dialog dia=new Dialog(this, "Dialogâ");//�� ������ �̻ڰ� ����
//		Button btn1=new Button("�� �˾ƺ���");
//		dia.add(btn1);
		java.awt.FileDialog dia=new FileDialog(this,"��â",FileDialog.LOAD);//Ž����â ��
		dia.setSize(200, 100);
		dia.setLocation(310, 450);
		dia.setVisible(true);
		System.out.println(dia.getDirectory());//������ �� ������ ���
		System.out.println(dia.getFile());//������ �� ������ �̸�
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}