package com.bit.day14;

abstract class Lec03{//�߻� �޼��� �Ȱ����� ok
	
	Lec03(){
		super();// default�� �Ƚᵵ ����. ���� ����
		System.out.println("�θ�ü����");
	}
	
	void func01(){
		System.out.println("������ �������� �޼����Դϴ�");
	}
	
	abstract void func02();
}

class Lec33 extends Lec03{
	Lec33(){
		super();// default�� �Ƚᵵ ����. ���� ����
		System.out.println("�ڽİ�ü����");
	}

	@Override // override �ʿ��� ��� Ŭ���� �̸��� ���콺�����ϸ� ��õ���� add �ɼ����� ��.
	// ���ʿ��� ��� ������ �����޽��� ���� 
	void func02() {
		System.out.println("�ڽĿ��� func02  ����");
	}
}

public class Ex03 {

	public static void main(String[] args) {
//		Lec03 you=new Lec03();//�߻�class �� ������ ��ü ���� �Ұ���.
// 								Lec03�� ������ ����� ����. �׷��� �ȵ�
		Lec33 you=new Lec33();// �θ�ü����
								// �ڽİ�ü����
		//��ӹ���class�� ���� ����. Lec33�� overriding �������� Lec03 ����
		you.func01();// ������ �������� �޼����Դϴ�
		you.func02();// �ڽĿ��� func02  ����
	}

}
