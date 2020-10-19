package com.bit.day24;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex10 {

	public static void main(String[] args) {
		String path="data.bin";
		File file=new File(path);
		FileReader fr=null;
		char[] cbuf=new char[5];//홀수로 줘도 오류 안나고 문자열 처리 잘 됨
		try {
			fr=new FileReader(file);
			while(true){
				int su=fr.read(cbuf);
				if(su==-1){break;}
				for(int i=0; i<su; i++){
					System.out.print(cbuf[i]);
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally{
			try {
				if(fr!=null){fr.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
