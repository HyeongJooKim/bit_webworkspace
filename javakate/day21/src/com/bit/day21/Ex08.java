package com.bit.day21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//데이터도 입력해보기

public class Ex08 {

	public static void main(String[] args) {
		//ByteStream - output
		File file=new File("ex08.bin");
		java.io.FileOutputStream fos=null;
		
		try {
			fos=new FileOutputStream(file);
			
			fos.write('a');
			fos.write('b');
			fos.write('c');
			fos.close();//io 연결작업하면 꼭 닫아줘야 함

//			String msg="hello";
//			byte[] byt=msg.getBytes();
//			for(int i=0; i<byt.length; i++){
//				fos.write(byt[i]);
//			}
			
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {//io는 꼭 Exception 발생함
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}