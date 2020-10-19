package com.bit.day25;

//package grade04; �� �ִ� file�� ����
//project  �ٸ��� ���� �Ұ�.
//������� Ŭ������ �̵��ؿ;� ���ٵǴµ� ���� ������� package �̸����� ���ƾ� ��.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex12 {

	public static void main(String[] args) {

		String path="data5.bin";
		File file=new File(path);
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			int su=-1;
//			while((su=fis.read())!=-1){
//				System.out.print(Integer.toHexString(su)+" ");
//			}
//			
//			Object obj=ois.readObject();//ClassNotFoundException
			grade04.Student obj=(grade04.Student) ois.readObject();//ClassNotFoundException
			System.out.println(obj);
			//���������� �ƴ� �� ������ Ŭ���� ���ܴ�.
			
		} catch (FileNotFoundException e) {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();
		} catch (ClassNotFoundException e) {e.printStackTrace();
		} finally{
			try {
				if(ois!=null)ois.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {e.printStackTrace();
			}
		}
	}
}