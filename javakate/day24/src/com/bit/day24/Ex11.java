package com.bit.day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//크기를 모르는 문자열 파일을 복사한다면?

public class Ex11 {

	public static void main(String[] args) {

		String path="data.bin";//여기서 읽어서
		String path2="data2.bin";//여기에 써보자
		File src=new File(path);
		File target=new File(path2);
		
		FileReader fr=null;
		FileWriter fw=null;
		char[] cbuf=new char[5];//홀수로 줘도 오류 안나고 문자열 처리 잘 됨
		
		try {
			fr=new FileReader(src);
			fw=new FileWriter(target);
			
			while(true){
//				int su=fr.read();
				int su=fr.read(cbuf,0,cbuf.length);
				if(su==-1){break;}
//				fw.write(su);
				fw.write(cbuf,0,su);
			}
			fw.flush();
			System.out.println("복사완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fr!=null){fr.close();}
				if(fw!=null){fw.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
