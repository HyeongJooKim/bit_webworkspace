package com.bit.day25;

//문자열 문서 복제
//버퍼 달아서 문서내용 콘솔에도 옮기기

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		String path="data1.txt";
		String path2="copy.txt";
		File source=new File(path);
		File target=new File(path2);
		
		if(!target.exists())target.createNewFile();
		char[] cbuf=new char[5];
		
		FileReader fr=null;
		FileWriter fw=null;

		BufferedReader br=null;
		BufferedWriter bw=null;
		
		fr=new FileReader(source);
		fw=new FileWriter(target);
		
		br=new BufferedReader(fr);
		bw=new BufferedWriter(fw);
		
		while(true){
			int su=br.read(cbuf,0,cbuf.length);
			if(su==-1)break;
			bw.write(cbuf,0,su);
			bw.newLine();
			//개행. 아래와 동일 효과. 운영체제와 무관하게 개행해주므로 이걸 쓰는 게 낫다.
//			bw.write("\n");//
			String msg=new String(cbuf,0,su);
			System.out.print(msg);  
		}
		System.out.println("복사완료");
		if(br!=null){br.close();}
		if(bw!=null){bw.close();}
		if(fw!=null){fw.close();}
		if(fr!=null){fr.close();}
	}
}