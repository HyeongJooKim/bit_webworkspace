package com.bit.day26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

//Stream을 전달받아서 사용할 때

public class Ex02 {

	public static void main(String[] args) {

		InputStream is=null;//1
		InputStreamReader isr=null;//1
		OutputStreamWriter osw=null;//5
		BufferedReader br=null;//3 추가 4 개선
		BufferedWriter bw=null;//6
		PrintWriter pw=null;//7
		char[] cbuf=new char[5];//2 추가
		try {
			is=new FileInputStream("test01.txt");
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);//3 추가
			osw=new OutputStreamWriter(System.out);//5
			bw=new BufferedWriter(osw);//6
			pw=new PrintWriter(bw);//7
//			int su=-1;
//			while((su=isr.read())!=-1){//1
//			while((su=isr.read(cbuf))!=-1){//2 변경
			String msg=null;//4
//			while((su=br.read(cbuf))!=-1){//3 변경
			while((msg=br.readLine())!=null){//4
//				System.out.print((char)su);//1
//				System.out.print(new String(cbuf,0,su));//2 변경
//				System.out.println(msg);//4 변경
//				osw.write(msg);//5
//				osw.write("\n");//5
//				bw.write(msg);//6
//				bw.newLine();//6
				pw.println(msg);//7
			}
		} catch (FileNotFoundException e) {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();
		} finally{
			try {
				if(pw!=null)pw.close();
				if(bw!=null)bw.close();
				if(osw!=null)osw.close();
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(is!=null)is.close();
			} catch (IOException e) {e.printStackTrace();
			}
		}
	}
}