package com.bit.day12;

public class Ex07 {

	public static void main(String[] args) {
		System.out.println("main start");
		try{
		func01();
		}catch(Exception e){
			System.out.println("ȸ��");
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();//�����ϸ� �Ἥ ��� ������ ������ �� �� �ִ�. 
			//�� ���ٸ� ���� ������ ���忡�� �� �� ����. 
			//�ý��ۿ� ���� ����� ����ϴ� �Ŷ� �ƹ� ������ �����. 
			//�׷��� ��� main end �տ�, ��� �ڿ� ������...
		}
		System.out.println("main end");
	}

	public static void func01() throws NumberFormatException {
		//ȣ���ϴ� ������ try~catch�� �Ѵٸ� ������ �߻��� ������ throws ���� �̸� ���༭ �����߻� ��ġ ������
//		NumberFormatException err=new NumberFormatException();
//		throw err;
//		int a=Integer.parseInt("a");
	}
}
