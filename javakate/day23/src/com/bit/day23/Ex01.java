package com.bit.day23;

//java.awt.Toolkit
//�̹��� ���̱�
//Icon, Image

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex01 extends Frame{

	public Ex01() {
		
		Toolkit tool=Toolkit.getDefaultToolkit();
		byte[] data=null;
		
		File file=new File("C:\\Users\\bitcamp\\Pictures\\starD.png");
		FileInputStream fis=null;
		if(file.exists()){
			try {
				data=new byte[(int)file.length()];//.length�� longŸ�����γ���. int�� ��ȯ.
				fis=new FileInputStream(file);
				for(int i=0; i<file.length(); i++){
					data[i]=(byte)fis.read();//.read�� int�� �о��
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				if(fis!=null){try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				}
			}
		}
//		java.awt.Image image=tool.createImage(data);//�̷��� �ϰų�, Icon���ص� ��
		javax.swing.Icon icon=new ImageIcon(data);
		javax.swing.JButton btn01=new JButton(icon);
		add(btn01);
		
		setSize(500,300);
//		Dimension dim=tool.getScreenSize();
//		System.out.println(dim.width);
//		System.out.println(dim.height);
//		setLocation(dim.width/2-getWidth()/2, dim.height/2-getHeight()/2);
		setLocation(100, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}