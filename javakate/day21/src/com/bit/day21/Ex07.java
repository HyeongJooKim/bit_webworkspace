package com.bit.day21;

import java.io.File;

//���� ����� �����

public class Ex07 {

	public static void main(String[] args) {
//		String path="test";
//		File file=new File(path);
//		file.mkdir();//���������� ����
//		file.delete();

		//���� ���� ����� �����
		String path="test\\ex";
		File file=new File(path);
		file.mkdirs();//���� ���� ����
//		file.delete();//���� ������ �̷��Դ� ��������. ��? ������� �����ϱ�
		//list�� �޾Ƽ� ���� ���� �����ϰ� ���� ���� ���� �����ؾ� ��.

	}
}