package com.bit.day22;

//test.txt ���� �о�ͼ� UI�� ����

import java.awt.Frame;
import java.awt.TextArea;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Ex18 extends Frame {
	
	TextArea ta;
	
	public Ex18(){
		
		ta=new TextArea();
		add(ta);		
		setLocation(200,200);
		setSize(800,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		ArrayList<Byte> list=new ArrayList<>();
		Ex18 me=new Ex18();
		File file=new File("test.txt");
		FileInputStream fis=null;
		if(file.exists()){
			try {
				fis=new FileInputStream(file);
				while(true){
					int su;
					su = fis.read();
					if(su==-1){break;}
					list.add((byte)su);//char���� �ϸ� �ѱ��� �ȵ�, byte�ؾ� �ѱ۵�
				}
				Object[] arr1=list.toArray();//toArray�� Object�� ��ȯ��
				byte[] arr2=new byte[arr1.length];
				for(int i=0; i<arr1.length; i++){
					arr2[i]=(byte)arr1[i];
				}
				me.ta.setText(new String(arr2));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
