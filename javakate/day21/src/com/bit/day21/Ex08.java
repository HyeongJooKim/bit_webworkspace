package com.bit.day21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//�����͵� �Է��غ���

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
			fos.close();//io �����۾��ϸ� �� �ݾ���� ��

//			String msg="hello";
//			byte[] byt=msg.getBytes();
//			for(int i=0; i<byt.length; i++){
//				fos.write(byt[i]);
//			}
			
			System.out.println("�ۼ��Ϸ�");
		} catch (FileNotFoundException e) {//io�� �� Exception �߻���
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}