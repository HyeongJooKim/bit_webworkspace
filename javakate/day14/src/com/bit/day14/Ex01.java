package com.bit.day14;

abstract class Lec01{
	// �߻�Ŭ����
	// �߻� Ŭ������ 0�� �̻� ���� Ŭ����
	// �߻�޼���? �޼����� ���� �ְ� ������ ���� �޼���
		
		public abstract void func01();
		// {} �κ��� ���� �޼��� ;�ʿ��� ������ �ȸ����� ���� ������
		// abstract�̶�� ��Ȯ�ϰ� �˷���� ��. �׷��� Class�� abstract�پ ��		
}

class Lec11 extends Lec01{
	public void func01(){
		System.out.println("��������");// ��ӹ޾� override�Ͽ���.
	}
}

public class Ex01 {

	public static void main(String[] args) {
//		Lec01 lec=new Lec01();// ȣ���� �ȵ�. ��ӹްų� ���� Ŭ������ (������ ��� ��)
//		lec.func01();
		Lec11 lec=new Lec11();// ��ӹ޾Ƽ� ������. ���ǹ�???
		lec.func01();// ������ placeholder ����.
		// ������� ����� ���� �ϴ� �Ѿ �� �ְ�.
		// �������� ����. ��? method�� �߻��̸�, class�� �߻��̾�� ������ �� ���ϱ�,
		// ������ ���� �޼ҵ尡 �ִٴ� ����� ����� �ʰ� tagging ���� �ϴ� ��. 
		
	}// main end
}// class Ex01 end
