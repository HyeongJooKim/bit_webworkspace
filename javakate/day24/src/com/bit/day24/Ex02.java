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
			out.write(161);//���� �� �־�� '��' ���
			//java�� 2����Ʈ ü�� ���ڿ� ���.
			//�ƽ�Ű ���ڿ��� �ִ� �� ����(127����)�� 1����Ʈ�� ����ϴ� ��
			//�̷� ����(1, 2����Ʈ �� �� ����ϴ� ��) ������ ���ڿ�Stream�� �����ϰ� ����.
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
