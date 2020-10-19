package com.bit.day24;

//버퍼처리 해보자

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {

		String path="data.bin";
		File file=new File(path);
		FileInputStream fis=null;
		byte[] buf=new byte[128];
		//[1]이면 한번에 1byte 읽는 것. 길에 하면 한번에 많이 읽어옴. 한번만 작업을 하면 되니, 성능 좋아짐. 
		if(file.exists()){
			try {
				fis=new FileInputStream(file);
				
				while(true){
					int su=fis.read(buf);
					if(su==-1){break;}
					System.out.println(new String(buf));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				if(fis!=null){try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}}
			}
		}
	}
}
