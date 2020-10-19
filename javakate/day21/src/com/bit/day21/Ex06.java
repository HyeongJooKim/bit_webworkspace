package com.bit.day21;

import java.io.File;
import java.io.IOException;

//자동저장되며 버전 기록 있게. 임시저장 했다가 자용자가 저장하면 임시저장은 자동 삭제되게
//중복안되도록

public class Ex06 {

	public static void main(String[] args) {
		String prefix="AABBCCDDEEFFGG";
		String suffix=".txt";
		try {
			File file=File.createTempFile(prefix, suffix);
			System.out.println(file.getCanonicalPath());
			//C:\Users\bitcamp\AppData\Local\Temp\AABBCCDDEEFFGG1366592554958719111.txt
			//내가 붙인 이름 뒤에 랜덤한 숫자 1366592554958719111 가 자동으로 붙음
			//또 실행하면 또 다른 숫자가 자동으로 붙음.
			//\AppData\Local\Temp\ 는 숨은 폴더임
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
