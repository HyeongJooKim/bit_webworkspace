package com.bit.day25;

//�ֿܼ� ���� ���ڿ����� ���Ͽ� �����ϱ�

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		String path="data1.txt";
		File file=new File(path);
		FileWriter fw=new FileWriter(file);
		while(true){
			String msg=sc.nextLine();//������ �о���� ������ ������ ������ �ݿ��� �ȵ�
//			String msg=sc.next();//���Ⱑ �о���� ������ ���Ⱑ ������ �ݿ��� �ȵ�
			if(msg.equals("/exit")) break;
			fw.write(msg);
			fw.write("\r\n");//�о���̴� �������� ����
//			fw.write(" ");//�о���̴� �������� ��ĭ
		}
		if(fw!=null){fw.close();}
		sc.close();
	}
}