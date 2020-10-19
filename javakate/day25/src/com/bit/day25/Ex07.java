package com.bit.day25;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//추가로 도움될만한 스트림들 소개
//자료형 유지시켜주는 스트림들

public class Ex07 {

	public static void main(String[] args) throws IOException {

//		DataStream
		String path="data2.bin";
		File file=new File(path);
		if(!file.exists())file.createNewFile();
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;//성능개선용
		DataOutputStream dos=null;
		fos=new FileOutputStream(file);
		bos=new BufferedOutputStream(fos);//읽을 때는 안써도 읽어짐.
		dos=new DataOutputStream(bos);
		
		dos.write(97);//1
		dos.writeByte(127);//2
		dos.writeShort(128);//3
		dos.writeInt(65);//4
		dos.writeLong(97L);//5
		dos.writeFloat(3.14F);//6
		dos.writeDouble(3.14);//7
		dos.writeChar('A');//8
		dos.writeBoolean(true);//9
		dos.writeUTF("문자열");//10
		
		if(dos!=null)dos.close();
		if(bos!=null)bos.close();
		if(fos!=null)fos.close();
		
	}

}
