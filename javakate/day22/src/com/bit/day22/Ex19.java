package com.bit.day22;

import java.io.IOException;
import java.io.InputStream;

public class Ex19 {

	public static void main(String[] args) throws IOException {

		InputStream inn=System.in;//실행하고 콘솔에 입력하면 
		System.out.println(inn.read());//해당하는 byte 값 나옴
	}
}
