package com.bit.day22;

import java.io.IOException;
import java.io.InputStream;

public class Ex19 {

	public static void main(String[] args) throws IOException {

		InputStream inn=System.in;//�����ϰ� �ֿܼ� �Է��ϸ� 
		System.out.println(inn.read());//�ش��ϴ� byte �� ����
	}
}
