package com.bit.day21;//내코딩

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;

//cmd의 dir. exe 구현해보기

//C:\javakate\day21 디렉터리
//
//2020-06-03  오전 09:44    <DIR>          .
//2020-06-03  오전 09:44    <DIR>          ..
//2020-06-03  오전 09:39               301 .classpath
//2020-06-03  오전 09:39               381 .project
//2020-06-03  오전 09:39    <DIR>          .settings
//2020-06-03  오전 09:40    <DIR>          bin
//2020-06-03  오전 09:40    <DIR>          src
//2020-06-03  오전 09:44                 0 test01
//
//C:\javakate\day21 디렉터리
//
//              3개 파일                 682 바이트

public class Ex02M {

	public static void main(String[] args) throws IOException {

		String path="C:\\javakate\\day21";
		java.io.File file=new java.io.File(path);
		String pathP=file.getParent()+"";
		java.io.File fileP=new java.io.File(pathP);
		System.out.println(file.getCanonicalPath());
		System.out.println(file.getParent());
		
		java.util.Date now = new java.util.Date();
		DateFormat now2=java.text.DateFormat.getInstance();
		String now3=now2.format(now);
//		System.out.print(now3+"\t");
		
		int by=0;
		int cnt=0;
		
		System.out.print(new java.util.Date(file.lastModified())+"\t");
		if(file.isDirectory()){
			System.out.println("<DIR>\t\t.");
		}else{
			System.out.println("\t\t.");
		}
		
		
		System.out.print(new java.util.Date(fileP.lastModified())+"\t");		
		if(fileP.isDirectory()){
			System.out.println("<DIR>\t\t..");
		}else{
			System.out.println("\t\t..");
		}	
		
		File[] dirs=file.listFiles();
		for(int i=0; i<dirs.length; i++){
			System.out.print(new java.util.Date(file.lastModified())+"\t");
			if(dirs[i].isDirectory()){
				System.out.print("<DIR>\t");
			}else{
				System.out.print("\t");
				cnt++;
			}
			System.out.print(dirs[i].length()+"\t");
			by+=dirs[i].length();
			System.out.println(dirs[i].getName());
		}
		System.out.println("\t\t"+cnt+"개 파일\t\t"+by+"바이트");
	}

}
