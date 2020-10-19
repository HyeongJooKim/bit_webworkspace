package com.bit.day23;

//종속된 창

import java.awt.FileDialog;
import java.awt.Frame;

public class Ex03 extends Frame{

	public Ex03() {
		
//		this.setName("Ex03");//이건 안되네...
		setSize(800,600);
		setLocation(10, 200);
		setVisible(true);
		
//		java.awt.Dialog dia=new Dialog(this, "Dialog창");//젤 윗줄이 이쁘게 나옴
//		Button btn1=new Button("더 알아보기");
//		dia.add(btn1);
		java.awt.FileDialog dia=new FileDialog(this,"새창",FileDialog.LOAD);//탐색기창 뜸
		dia.setSize(200, 100);
		dia.setLocation(310, 450);
		dia.setVisible(true);
		System.out.println(dia.getDirectory());//실행한 그 파일의 경로
		System.out.println(dia.getFile());//실행한 그 파일의 이름
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}