package com.bit.day24;

//버퍼처리 해보자

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		String path="data.bin";
		File file=new File(path);
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String msg="abcdefg\n1234567890\n!@#$%^&*()";
		byte[] arr=msg.getBytes();
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(file);
//			for(int i=0; i<arr.length; i++){
//				fos.write(arr[i]);
				fos.write(arr);
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fos!=null){try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}}
		}
	}
}
