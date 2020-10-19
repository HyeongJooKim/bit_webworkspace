package com.bit.day14;

public class Ex10 {
	//���ϴ� �������� �ϱ� ���� java.text.DateFormat class. �߻� Ŭ����
	
	public static void main(String[] args) {

		java.util.Date now=new java.util.Date();
		System.out.println(now);// Mon May 25 14:54:04 KST 2020
		
		java.text.DateFormat df=java.text.DateFormat.getDateInstance();
		String msg=df.format(now);
		System.out.println(msg);// 2020. 5. 25

		df=java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);
		msg=df.format(now);
		System.out.println(msg);// 2020. 5. 25
		
		df=java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG);
		msg=df.format(now);
		System.out.println(msg);// 2020�� 5�� 25�� (��)
				
		df=java.text.DateFormat.getDateInstance(java.text.DateFormat.FULL);
		msg=df.format(now);
		System.out.println(msg);// 2020�� 5�� 25�� ������
		
		df=java.text.DateFormat.getDateInstance(java.text.DateFormat.FULL);
		msg=df.format(now);
		System.out.println(msg);// 2020�� 5�� 25�� ������
	
		System.out.println("---------------------------");
		
		java.text.SimpleDateFormat sdf=null;
		sdf=new java.text.SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
		msg=sdf.format(now);
		System.out.println(msg);// 2020.05.25 ���� at 15:05:34 KST
		
		sdf=new java.text.SimpleDateFormat("yy-MM-dd E HH:mm"); 
		///E, EE, EEE: ��, EEEE: ������ ����� ���� �������� �ý��� �� �ٲ�� �Ѵٰ�...
		msg=sdf.format(now);
		System.out.println(msg);// 20-05-25 ������ 15:07
	}
}
