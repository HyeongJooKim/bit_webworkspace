package com.bit.day25;

//콘솔에 적은 문자열들을 파일에 저장하기

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		String path="data1.txt";
		File file=new File(path);
		FileWriter fw=new FileWriter(file);
		while(true){
			String msg=sc.nextLine();//개행이 읽어오는 단위가 개행이 문서에 반영이 안됨
//			String msg=sc.next();//띄어쓰기가 읽어오는 단위라 띄어쓰기가 문서에 반영이 안됨
			if(msg.equals("/exit")) break;
			fw.write(msg);
			fw.write("\r\n");//읽어들이는 단위마다 개행
//			fw.write(" ");//읽어들이는 단위마다 빈칸
		}
		if(fw!=null){fw.close();}
		sc.close();
	}
}