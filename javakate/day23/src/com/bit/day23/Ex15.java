package com.bit.day23;

import java.awt.Button;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex15 extends Frame implements ActionListener {
//������ �߻��ϴ� ��ο� ���� �� ����. ��ư ��
	
	public Ex15(){
		Panel p=new Panel();
		TextField tf=new TextField(20);
		tf.addActionListener(this);
		p.add(tf);
		
		Button btn=new Button();
		btn.addActionListener(this);
		p.add(btn);
		
		List list=new List();
		list.addActionListener(new ActionListener(){
			//�͸�Ŭ���� �Ἥ ���� ���� Action�� ������ �� �ִ�.
			public void actionPerformed(ActionEvent e) {
				System.out.println("list�� �̺�Ʈ");				
			}
		});//�����ϰ� ���� �ľ� Action�߻��ϳ�
		list.addItem("item1");
		list.addItem("item2");
		list.addItem("item3");
		p.add(list);
		
		add(p);
		setLocation(100, 200);
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex15();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�̺�Ʈ�߻�");///�Է��� ���� ������ �߻�
	}
}
