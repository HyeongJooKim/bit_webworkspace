package com.bit.day26;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		String msg="문자열 메시지를 작성합니다\n12345\nABCDEFG";
		
		//jdk 1.8 이후 추가된 문법.
		//try(여기서 선언된 io stream은 안닫아도 자동으로 .close됨)
		//여기서 선언되는 변수는 close가 가능한 것만 가능 (implements Closable인 것들만)
		try(java.io.OutputStream os=new FileOutputStream("test01.txt")){
			os.write(msg.getBytes());
//			os.flush();
			System.out.println("작성완료");
		} catch (IOException e) {e.printStackTrace();
		}
	}
}