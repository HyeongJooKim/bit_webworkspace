package com.bit.day12;

public class Ex02 {

	public static void main(String[] args) {
	//����ó��
		String msg="1234��";
//		for(int i=0; i<msg.length(); i++){
//			if(Character.isDigit(msg.charAt(i))){
//			}else{
//				System.out.println("���ڰ� �����ϴ�");
//				return;
//			}
//		}
		try{//try{} �ȿ� �ִ� ������ �õ��غ��� catch() �ȿ� �ִ� ������ �ִ� ��� ���� ����.
		System.out.println("�����ٿ��� �����߻� ����");
		Integer su=new Integer(msg);//���ٿ��� �����߻��ϹǷ� ���ٺ��ʹ� ���� ���� �� 
		System.out.println("������ �����׿�");
		System.out.println("su="+su);
		}catch(NumberFormatException a){//�������� ��츸 �����ϰ�, ������ ������ �������
			System.out.println("������ ��Ƴ½��ϴ�");			
		}
		System.out.println("�����߾���");

	}

}
