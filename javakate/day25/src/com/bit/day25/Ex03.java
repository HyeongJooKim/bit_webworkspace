package com.bit.day25;

//문자열 문서 복제
//버퍼 달아서 문서내용 콘솔에도 옮기기

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		String path="data1.txt";
		String path2="copy.txt";
		File source=new File(path);
		File target=new File(path2);
		
		if(!target.exists())target.createNewFile();
		char[] cbuf=new char[5];//버퍼 달면
		FileReader fr=null;
		FileWriter fw=null;

		fr=new FileReader(source);
		fw=new FileWriter(target);
		while(true){
//			int su=fr.read();
			int su=fr.read(cbuf,0,cbuf.length);
			if(su==-1)break;
//			fw.write(su);
			fw.write(cbuf,0,su);
			
			//문서내용 콘솔에도 옮기기
			String msg=new String(cbuf,0,su);
			System.out.print(msg);// 개행해보면 버퍼크기인 5글자씩 찍히고 개행되는 걸 확인할 수 있음.  
		}
		System.out.println("복사완료");
		if(fw!=null){fw.close();}
		if(fr!=null){fr.close();}
	}
}