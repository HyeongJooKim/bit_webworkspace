package com.bit.day26;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		String msg="���ڿ� �޽����� �ۼ��մϴ�\n12345\nABCDEFG";
		
		//jdk 1.8 ���� �߰��� ����.
		//try(���⼭ ����� io stream�� �ȴݾƵ� �ڵ����� .close��)
		//���⼭ ����Ǵ� ������ close�� ������ �͸� ���� (implements Closable�� �͵鸸)
		try(java.io.OutputStream os=new FileOutputStream("test01.txt")){
			os.write(msg.getBytes());
//			os.flush();
			System.out.println("�ۼ��Ϸ�");
		} catch (IOException e) {e.printStackTrace();
		}
	}
}