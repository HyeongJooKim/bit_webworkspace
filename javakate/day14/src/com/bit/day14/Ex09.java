package com.bit.day14;

import java.util.Date;

public class Ex09 {

	public static void main(String[] args) {

		java.util.Date now=new java.util.Date();//�����Ǵ� ����. �� ���ķ� ����ϸ� ������Ʈ �ȵ�
//		for(int i=0; i<999999; i++){
//			System.out.println(now); // �ƹ��� ���� ������ ���� �� ����.
//			// �ð� �帣�� ��� �ð� �ٲٷ��� for�ȿ��� �� ��ü�� ��� ���� ��.
//			// java�� �ð��� ����Ȯ�� ��. �ִ� 6��/1�� ���� ����. ��� ���� �� �ð� ����Ȯ�ϴ�.
//		}
		System.out.println(now);// Mon May 25 14:22:43 KST 2020
//		System.out.print(now.getYear()+"��");//120��
		System.out.print(1900+now.getYear()+"��");//2020�� // 1900���ؾ� ��
		System.out.print(1+now.getMonth()+"��");//5�� // 1���ؾ� ��
		System.out.print(now.getDate()+"��");//25��
		System.out.print(now.getDay()+"����");//0(��)~6(��)
		
		System.out.print(now.getHours()+"��");//14��
		System.out.print(now.getMinutes()+"��");//24��
		System.out.println(now.getSeconds()+"��");//50��

		String msg="";
		for(int i=0; i<9999; i++){
			msg+=i;
		}
		
		java.util.Date now2=new java.util.Date();//�����Ǵ� ����. �� ���ķ� ����ϸ� ������Ʈ �ȵ�
		System.out.println(now2);// Mon May 25 14:22:43 KST 2020

		System.out.print(1900+now2.getYear()+"��");//2020�� // 1900���ؾ� ��
		System.out.print(1+now2.getMonth()+"��");//5�� // 1���ؾ� ��
		System.out.print(now2.getDate()+"��");//25��
		System.out.print(now2.getHours()+"��");//14��
		System.out.print(now2.getMinutes()+"��");//24��
		System.out.println(now2.getSeconds()+"��");//50��
		System.out.println("---------------------------------");
		System.out.println(now.before(now2));//true		
		System.out.println(now.after(now2));//false		
		System.out.println(now2.before(now));//false		
		System.out.println(now2.after(now));//true

		java.util.Date now3=now;
		System.out.println(now.compareTo(now));//0 ����
		System.out.println(now.compareTo(now2));//-1 now
		System.out.println(now2.compareTo(now));//1
		System.out.println(now3.compareTo(now));//0
		
		String msg2="2002/05/24 12:00:00";
		System.out.println(Date.parse(msg2));//1022209200000 // ���ڸ� �ý��۽ð����� ����
		System.out.println(System.currentTimeMillis());//1590385366468
		System.out.println(now.getTime());
		System.out.println(now2.getTime()-now.getTime());//140 // 1000���� 1�� ����
		
		long t=System.currentTimeMillis();
		java.util.Date now4=new java.util.Date(t);
		System.out.println(now4);//Mon May 25 14:46:38 KST 2020
		
		java.util.GregorianCalendar gc=new java.util.GregorianCalendar();
		long t2=gc.getTimeInMillis();
		
		java.util.Date now5=new java.util.Date(t2);
		java.util.Calendar cal=java.util.Calendar.getInstance();
		long t3=cal.getTimeInMillis();
		java.util.Date now6=new java.util.Date(t3);
		System.out.println(now6);//Mon May 25 14:46:38 KST 2020
	}
}
