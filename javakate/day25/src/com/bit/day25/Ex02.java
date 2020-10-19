package com.bit.day25;

//Buffered class 적용

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		String path="data1.txt";
		String path2="copy.txt";
		File source=new File(path);
		File target=new File(path2);
		if(!target.exists())target.createNewFile();
//		char[] cbuf=new char[5];//버퍼 달면
		
		FileReader fr=null;
		FileWriter fw=null;

		BufferedReader br=null;
		BufferedWriter bw=null;
		
		fr=new FileReader(source);
		fw=new FileWriter(target);
		
		br=new BufferedReader(fr);
		bw=new BufferedWriter(fw);
		
		while(true){
//			int su=br.read(cbuf,0,cbuf.length);//버퍼에서 읽고 쓰기 su: 버퍼길이
			int su=br.read();//버퍼에서 읽고 쓰기.su: 데이터 값들
			if(su==-1)break;
//			bw.write(cbuf,0,su);
			bw.write(su);
			
			//문서내용 콘솔에도 옮기기
//			String msg=new String(cbuf,0,su);
//			System.out.print(msg);// 개행해보면 버퍼크기인 5글자씩 찍히고 개행되는 걸 확인할 수 있음.  
			System.out.print((char)su);  
		}
		System.out.println("복사완료");
		if(br!=null){br.close();}
		if(bw!=null){bw.close();}
		if(fw!=null){fw.close();}
		if(fr!=null){fr.close();}
	}
}