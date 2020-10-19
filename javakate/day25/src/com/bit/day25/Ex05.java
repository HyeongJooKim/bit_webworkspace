package com.bit.day25;

//io에는 바이트스트림과 문자열스트림
//그외 다수 이를 돕는 필터스트림(버퍼드,프린트, 등등)
//잘 닫지 않으면 파일 내용 날아갈 수 있음.
//필터스트림: 데코레이션 패턴에 의해 작성된 코딩 방식으로 제공됨.

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		
		String path="data1.txt";
		File file=new File(path);
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		
		fw=new FileWriter(file);
//		bw=new BufferedWriter(fw);
//		pw=new PrintWriter(bw);
		pw=new PrintWriter(fw);//버퍼 없이 이렇게도 가능
		while(true){
			String msg=sc.nextLine();
			if(msg.isEmpty())break;//엔터 두번 치니 끝남.
//			bw.write(msg);
//			bw.newLine();
			pw.println(msg);//newLine();없이도 개행 잘 됨
		}
		if(pw!=null)pw.close();
		if(bw!=null)bw.close();
		if(fw!=null)fw.close();
		//{}생략한 경우. 생략하면 단 한줄에만 유효함.
		//{}생략하는 경우 개행 없이 바로 옆으로 쓰자. 가독성 떨어지지 않게.
		sc.close();
	}
}