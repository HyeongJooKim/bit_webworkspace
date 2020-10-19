package com.bit.day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

//IO 완성
//InputStream

public class Ex01 {

	public static void main(String[] args) {

		InputStream inn=System.in;
		//여기서 InputStream은 class명, in은 method명, 
//		try {
//			System.out.println(inn.read());
//			//영문은 1문자를 다 읽은 거지만 한글은 한번만 읽으면 1 byte만 읽어서 다 안읽은 것.
//			//가+엔터 하려면 4번 읽어야 함. \r\n까지
//			//0~255까지의 숫자로 읽어들임.
//			System.out.println(inn.read());
//			System.out.println(inn.read());
//			System.out.println(inn.read());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
				
//		byte[] by={(byte)176,(byte)161};
//		System.out.println(new String(by));//이렇게 2 bytes를 읽어야 '가' 나옴

		File file=new File("data.bin");
		try {
			Scanner sc=new Scanner(file);
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
