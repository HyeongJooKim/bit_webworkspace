package com.bit.day25;

//package grade04; 에 있는 file에 접근
//project  다르면 접근 불가.
//만들었던 클래스를 이동해와야 접근되는데 원래 만들었던 package 이름까지 같아야 함.

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
			//문법오류는 아닌 것 같은데 클래스 없단다.
			
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