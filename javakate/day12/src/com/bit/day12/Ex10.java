package com.bit.day12;

public class Ex10 {

	public static void main(String[] args) {
		// 
		String msg="JavaWebFramework";
		
		int su=msg.indexOf("Web");
		System.out.println(su);//ã�� �ܾ� ������ �ڸ��� ����
		su=msg.indexOf("web");
		System.out.println(su);//ã�� �ܾ� ������ -1 ����. �� ���� -1����????
		
		String msg2=msg.replace('z','Z');//ã�� ���� ��� ������ �ȳ�
		System.out.println(msg2);
		
		char ch=msg.charAt(0);//���� �Է��ϸ� ����
		System.out.println(ch);//J ���
		
		boolean boo1=msg.contains("web");
		System.out.println(boo1);//false ���. �ش繮�� �����ϴ��� �˻�. �ֱٿ� ��������� indexOf �� ���� ����ϰ� �ɰ�
		
		boolean boo2=msg.startsWith("ja");
		System.out.println(boo2);//false ���. �ش繮�ڷ� �����ϴ��� �˻�
		
		boolean boo3=msg.endsWith("work");
		System.out.println(boo3);//true ���. �ش繮�ڷ� �������� �˻�
		
		String st2=msg.toLowerCase();
		System.out.println(st2);//javawebframework ���. ��� �ҹ��ڷ� ����
		
		String st3=msg.toUpperCase();
		System.out.println(st3);//JAVAWEBFRAMEWORK ���. ��� �빮�ڷ� ����
		
		String msg1="";//��� �ִ��� �˻�
		int len=msg1.length();//0������ �� ��. null�̾����� ����
		System.out.println(len);
		boolean boo4=msg1.isEmpty();//true ����. ������� true. ��� ���� ������ false. �� ���̾�� true. null�̾����� ����
		System.out.println(boo4);
		
		String msg3="   Java         ";
		System.out.println(msg3);
		String st4=msg3.trim();//���� �յ��� �� ���� ������
		System.out.println(st4);
		
		
		
		
	}

}
