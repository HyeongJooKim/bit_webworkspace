package com.bit.day21;

import java.io.File;
import java.io.IOException;

//�ڵ�����Ǹ� ���� ��� �ְ�. �ӽ����� �ߴٰ� �ڿ��ڰ� �����ϸ� �ӽ������� �ڵ� �����ǰ�
//�ߺ��ȵǵ���

public class Ex06 {

	public static void main(String[] args) {
		String prefix="AABBCCDDEEFFGG";
		String suffix=".txt";
		try {
			File file=File.createTempFile(prefix, suffix);
			System.out.println(file.getCanonicalPath());
			//C:\Users\bitcamp\AppData\Local\Temp\AABBCCDDEEFFGG1366592554958719111.txt
			//���� ���� �̸� �ڿ� ������ ���� 1366592554958719111 �� �ڵ����� ����
			//�� �����ϸ� �� �ٸ� ���ڰ� �ڵ����� ����.
			//\AppData\Local\Temp\ �� ���� ������
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
