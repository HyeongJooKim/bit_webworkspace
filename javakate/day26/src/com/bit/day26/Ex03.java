package com.bit.day26;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

//Scanner 다시 보자

public class Ex03 {

	public static void main(String[] args) {
		
		InputStream is=null;
		
		try {
			File file=new File("text01.txt");
//			is=new FileInputStream(file);
//			Scanner sc=new Scanner(System.in);//콘솔입력 받음
//			Scanner sc=new Scanner(is);//Stream 입력받음
			Scanner sc=new Scanner("출력\n출력");//직접입력받음
			
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
//			System.out.println(sc.nextLine());
//		} catch (FileNotFoundException e) {e.printStackTrace();
		} finally{
			try {
				if(is!=null)is.close();
			} catch (IOException e) {e.printStackTrace();
			}
		}
	}
}
