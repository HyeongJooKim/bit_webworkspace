package com.bit.day22;

//�ð� �����

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex08 {

	public static void main(String[] args) {

		for(int i=0; i<10; i++){
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
			String msg=sdf.format(date);
			System.out.println(msg);
			try {
				Thread.sleep(1000);//1�� ���� �� Runnable ���·� ���ư�.
				//�ݺ� �����ϴ� �ð��������Ƿ� ��Ȯ�ϰ� 1�ʴ� �ƴ�.
				//1�� �� �̻� �� ��. java�� �ð��� ���� ����Ȯ��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
