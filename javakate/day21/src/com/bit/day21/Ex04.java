package com.bit.day21;

import java.io.File;

//파일 지우기

public class Ex04 {
	
	public static void main(String[] args) {
		
		String path=".\\test02.txt";
		File file=new File(path);
		
		if(file.delete()){
			System.out.println("파일을 삭제합니다");
		}else{
			System.out.println("파일이 존재하지 않습니다");
		}
	}
}
