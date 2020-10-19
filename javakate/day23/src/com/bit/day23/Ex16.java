package com.bit.day23;

//창닫기 하려면 따로 이렇게 Lec16 클래스 만들어 상속받아두고 내부클래스로 끌어가면 된다.
//이 귀찮은 걸 미리 해놓은 것이 WindowAdapter. 이런 기특한 아이들은 대부분 Adapter로 끝남.
//메소드 한두개인 interface는 없으나 넘으면 ~Listener에 해당하는 ~Adapter 대부분 존재함.

import java.awt.Button;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//class Lec16 implements WindowListener{
//	public void windowOpened(WindowEvent e) {}
//	public void windowClosing(WindowEvent e) {}
//	public void windowClosed(WindowEvent e) {}
//	public void windowIconified(WindowEvent e) {}
//	public void windowDeiconified(WindowEvent e) {}
//	public void windowActivated(WindowEvent e) {}
//	public void windowDeactivated(WindowEvent e) {}
//}

public class Ex16 extends Frame {
	
	public Ex16(){
//		addWindowListener(new Lec16(){
//			@Override
//			public void windowClosing(WindowEvent e) {
//				dispose();
//			}
//		});
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		setLocation(100, 200);
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex16();
	}
}