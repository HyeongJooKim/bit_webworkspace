package com.bit.day21;

import java.io.File;
import java.io.IOException;

//파일 만들기

public class Ex03 {
	
	public static void main(String[] args) {
	
		String path=".\\test02.txt";
		File file=new File(path);
		try {
			if(file.createNewFile()){//있는 이름이면 생성 안됨
				System.out.println("파일생성완료");
			}else{
				System.out.println("기존파일이 존재합니다");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
