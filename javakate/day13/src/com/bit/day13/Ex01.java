package com.bit.day13;

public class Ex01 {

	public static void main(String[] args) {
		// String ���� class��
		String msg1 = new String("JavaFramework");

		StringBuffer sb1 = new StringBuffer("JavaFramework");// String �Է��� �� �ִ�. ������ �翬 ����
		// StringBuffer sb2="";//�̷��� �� ���� ����. ��? ������ ���� String�̹Ƿ� type �ȸ����Ƿ�

		StringBuilder sb2 = new StringBuilder(sb1);// String �Է��� �� �ִ�. ������ �翬 ����
		StringBuffer sb4 = new StringBuffer(10);// int �Է°���. �׷��� ��°��� ����. ��???

		System.out.println(sb2.length());//13���
		System.out.println(sb4.length());//0���
		//CRUD Create, Read, Update, Delete ���ڿ��� �߿��� 4���� ���. ����, �б�, ����, ���� �캸��
		StringBuffer sb5=new StringBuffer("Java");
		StringBuffer sb6=new StringBuffer("WebFramework");
//		StringBuffer sb7=sb5+sb6;//Stringó���� ���ϱ� �ȵ�.
		String msg2="sb7="+sb6;//sb7=Web ���. ���ڿ��� ���ϴ� ���� ���ڿ��� ��
//		StringBuffer sb7=sb5.concat(sb6);//�̰͵� �ȵ�.
		StringBuffer sb7=sb5.append(sb6);//JavaWebFramework ���
		System.out.println(sb5);//JavaWebFramework ���. 
		System.out.println(sb6);//WebFramework ���
		System.out.println(sb7);//JavaWebFramework ���
		//sb5�� sb6�� ���� ���� sb5���� sb6�� ������ ������ ������Ʈ��. �� ���� sb5���� ������. 
		//��. sb5=sb5.append(sb6); �μ� �׷��� �պκ� �����ϰ� sb5.append(sb6); �̷��Ը� ����. 
		//���ڿ���ŭ �� �Ⱦ��� ��. �޸� �δ� ŭ. ���ڿ��� ���� ���� �ٲٰų� �� ���� �ִ� �� ������. 
		//��ü�� �� ���Ƿ� �޸� ���� ��
		sb5.delete(4,7);//Java ���. �����ϴ� ��.
		System.out.println(sb5);//Java ���.
		sb5.insert(4, "DB");//4�� ��ġ�� ���ڿ� �����϶�. �߰� ���� ����
		System.out.println(sb5);//JavaDBFramework ���.
		sb5.replace(4,6,"DataBase");
		System.out.println(sb5);//JavaDataBaseFramework ���.
		//���� �̷��� ���ư���? ���ڿ��� �迭�� ���̰� �������� ���� �����ؼ� ���ڿ��� �����ϴ� ��. 
		//ũ�� �� �����ִ� �迭�� ���� �������� �� �ִ� ���̶� �ϳ��� �޸𸮴� ū ��. 
	}
}
