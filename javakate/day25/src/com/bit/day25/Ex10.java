package com.bit.day25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

class Student implements Serializable {
	//Serializable 상속해야 ObjectStream에 들어갈 수 있음.
	//통신할 때 반드시 Serializable해야 함.
	int num;
}

public class Ex10 {

	public static void main(String[] args) {
		//ObjectSream
		
		String path="data4.bin";
		File file=new File(path);
		if(!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			
			String msg=new String("오브젝트 작성");
			ArrayList<Integer> arr1=new ArrayList<>();
			arr1.add(1111);
			arr1.add(2222);
			arr1.add(3333);
			arr1.add(4444);
			
			Vector vec=new Vector();
			vec.add(1234);
			vec.add(3.14);
			vec.add(true);
			vec.add('A');
			vec.add("문자열");
			
			int[] arr={1,3,5,7,9};
			
			Vector v=new Vector();
			v.add(arr);
			v.add(vec);
			
			oos.writeObject(msg);
			oos.writeObject(arr1);
			oos.writeObject(vec);
			oos.writeObject(arr);
			oos.writeObject(v);
			oos.writeObject(new Student());
			
			System.out.println("작성완료");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(oos!=null)oos.close();
				if(fos!=null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
}