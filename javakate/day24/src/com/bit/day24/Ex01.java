package com.bit.day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

//IO �ϼ�
//InputStream

public class Ex01 {

	public static void main(String[] args) {

		InputStream inn=System.in;
		//���⼭ InputStream�� class��, in�� method��, 
//		try {
//			System.out.println(inn.read());
//			//������ 1���ڸ� �� ���� ������ �ѱ��� �ѹ��� ������ 1 byte�� �о �� ������ ��.
//			//��+���� �Ϸ��� 4�� �о�� ��. \r\n����
//			//0~255������ ���ڷ� �о����.
//			System.out.println(inn.read());
//			System.out.println(inn.read());
//			System.out.println(inn.read());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
				
//		byte[] by={(byte)176,(byte)161};
//		System.out.println(new String(by));//�̷��� 2 bytes�� �о�� '��' ����

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
