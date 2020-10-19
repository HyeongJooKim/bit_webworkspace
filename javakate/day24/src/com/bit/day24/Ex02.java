package com.bit.day24;

import java.io.IOException;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) {
		OutputStream out=System.out;
		try {
			out.write(97);//a
			out.write(98);//b
			out.write(176);//
			out.write(161);//두줄 다 있어야 '가' 출력
			//java는 2바이트 체계 문자열 사용.
			//아스키 문자열에 있는 것 까지(127까지)는 1바이트를 사용하는 셈
			//이런 문제(1, 2바이트 둘 다 사용하는 것) 때문에 문자열Stream을 제공하고 있음.
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(out!=null){out.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
