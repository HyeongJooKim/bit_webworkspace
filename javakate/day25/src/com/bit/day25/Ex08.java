package com.bit.day25;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//�߰��� ����ɸ��� ��Ʈ���� �Ұ�
//�ڷ��� ���������ִ� ��Ʈ����

public class Ex08 {

	public static void main(String[] args) throws IOException {

//		DataStream
		String path="data2.bin";
		File file=new File(path);
		if(!file.exists())file.createNewFile();
		FileInputStream fis=null;
		BufferedInputStream bis=null;//���ɰ�����
		DataInputStream dis=null;
		fis=new FileInputStream(file);
		bis=new BufferedInputStream(fis);//���ɰ�����
		dis=new DataInputStream(bis);
		
		int su=dis.read();
		byte su1=dis.readByte();//2
		short su2=dis.readShort();//3
		int su3=dis.readInt();//4
		long su4=dis.readLong();//5
		float su5=dis.readFloat();//6
		double su6=dis.readDouble();//7
		char c=dis.readChar();//8
		boolean boo=dis.readBoolean();//9
		String msg=dis.readUTF();//10

		System.out.println(su);
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(su4);
		System.out.println(su5);
		System.out.println(su6);
		System.out.println(c);
		System.out.println(boo);
		System.out.println(msg);
				
		if(dis!=null)dis.close();
		if(bis!=null)bis.close();
		if(fis!=null)fis.close();
		
	}

}
