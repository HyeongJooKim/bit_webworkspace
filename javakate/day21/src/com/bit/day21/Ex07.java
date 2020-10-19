package com.bit.day21;

import java.io.File;

//폴더 만들고 지우기

public class Ex07 {

	public static void main(String[] args) {
//		String path="test";
//		File file=new File(path);
//		file.mkdir();//현재폴더에 생성
//		file.delete();

		//다중 폴더 만들고 지우기
		String path="test\\ex";
		File file=new File(path);
		file.mkdirs();//다중 폴더 생성
//		file.delete();//다중 폴더는 이렇게는 안지워짐. 왜? 비어있지 않으니까
		//list로 받아서 하위 먼저 삭제하고 나서 상위 폴더 삭제해야 함.

	}
}