package com.bit.day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//사진 파일을 복사해서 다른 곳으로 붙여넣어보자

public class Ex10 {

	public static void main(String[] args) {

		String path1="C:\\Users\\bitcamp\\Pictures\\javacollection.png";
		File source=new File(path1);
		FileInputStream fis=null;
		
		String path2=".\\copy\\copy.png";
		File target=new File(path2);
		FileOutputStream fos=null;
		
		File par=new File(target.getParent());
		par.mkdirs();
		
		try {
			if(target.exists()){target.createNewFile();}
			fis=new FileInputStream(source);
			fos=new FileOutputStream(target);
			
			while(true){
				int su=fis.read();
				if(su==-1){break;}
				fos.write(su);
			}
			System.out.println("파일복사완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fis!=null){fis.close();}
				if(fos!=null){fos.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}