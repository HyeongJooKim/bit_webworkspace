package com.bit.day26;

//�󱸰�����-���� ������ Ÿ�̸� ����

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex13 extends Frame implements ActionListener, Runnable {
	
	JButton[] btns;
	Panel center;
	int score=0;
	Label south2;
	Label south4;
	
	public Ex13(){
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setLayout(new BorderLayout());
		Label north=new Label("�󱸰��� �����ϼ���");
		Font f=new Font(Font.MONOSPACED, Font.BOLD, 40);
		north.setFont(f);
		Panel south=new Panel();
		south.setLayout(new GridLayout());
		Label south1=new Label("����");
		south1.setFont(f);
		south2=new Label(""+score);
		south2.setFont(f);
		Label south3=new Label("�����ð�(��)");
//		south3.setFont(f);
		south4=new Label("60");
//		south4.setFont(f);
		south.add(south1);
		south.add(south2);
		south.add(south3);
		south.add(south4);
		
		
		Panel east=new Panel();
		east.setLayout(new GridLayout(5, 1));
		Button begin=new Button("����");
		begin.setFont(f);
		begin.addActionListener(this);
		Button exit=new Button("����");
		exit.setFont(f);
		exit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		east.add(new Label());
		east.add(begin);
		east.add(new Label());
		east.add(exit);
		east.add(new Label());
		
		
		center=new Panel();
		center.setLayout(new GridLayout(4, 4));
		
		btns=new JButton[16];
		
		Toolkit kit=Toolkit.getDefaultToolkit();
		for(int i=0; i<btns.length; i++){
			Image img=kit.createImage(1+i%4+".png");
			Icon icon=new ImageIcon(img);
			btns[i]=new JButton(icon);
			if(i%4==0){
				btns[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						score++;
						south2.setText(""+score);
					}
				});
			}else{
				btns[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						score-=2;
						south2.setText(""+score);
					}
				});
			}
			btns[i].setEnabled(false);
			center.add(btns[i]);
		}
		
		add(BorderLayout.NORTH, north);
		add(BorderLayout.SOUTH, south);
		add(BorderLayout.EAST, east);
		add(BorderLayout.CENTER, center);
		
		setSize(800, 800);
		setLocation(200, 0);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		south2.setText("0");
		for(int i=0; i<btns.length; i++){
			btns[i].setEnabled(true);
		}
		Thread thr=new Thread(this);
		thr.start();
	}

	private void mix(){
		Random ran=new Random();
		JButton temp=null;
		for(int i=0; i<1000; i++){
			int su=ran.nextInt(15)+1;
			temp=btns[0];
			btns[0]=btns[su];
			btns[su]=temp;
		}
		for(int i=0; i<btns.length; i++){
			center.add(btns[i]);
		}
		revalidate();//ȭ�鰻��. ���ص� �ٲ�� �ϴµ� ȭ�鿡�� �Ⱥ��̴� ��
	}

	private void play(){
		double sec=60;
		for(int i=0; i<120; i++){
			mix();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sec-=0.5;
			south4.setText(""+sec);
		}
		for(int i=0; i<btns.length; i++){
			btns[i].setEnabled(false);
		}
		
	}
	
	public void run() {
		play();
	}

	public static void main(String[] args) {
		new Ex13();
		
	}
}