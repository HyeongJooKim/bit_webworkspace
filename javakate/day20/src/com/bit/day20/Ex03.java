package com.bit.day20;

//Set: ������ ���� ����. ���� ����. ��, �ߺ��� �Ұ�.
//ListŸ���� index ��ȣ�� �� ���� ������ �ߺ����� �����߾�����.
//HashSet

public class Ex03 {

	public static void main(String[] args) {
		java.util.HashSet set01= new java.util.HashSet();
		set01.add("��");
		set01.add("��");
		set01.add("��");
		set01.add("��");
		set01.add("��");//�Է� ������ �ȳ��� ���� 4���� ������ �޾Ƶ���. �Է¾ȵ� ��
		
		System.out.println(set01.size());//4
		
		java.util.Iterator ite=set01.iterator();//Vector�� Enumeration �� ����
		//Iterator�� ��ȸ��. �� �� �а� ���� �ٽ� ������ �ʴ´�. 
		//�׷��� while, for �Ѵٴ� �ȵǴ� ��. �ٽ� �о������ Iterator�� �ٽ� ������ ��.
		//�̰� Enumeration�� ����.
//		System.out.println(ite.next());//���� ������ ������� ����
//		System.out.println(ite.next());//���� �Ѿ�� java.util.NoSuchElementException
		
		System.out.println("----------------------");
		
		for(int i=0; i<set01.size(); i++){
			System.out.println(ite.next());			
		}
		
		System.out.println("----------------------");
		java.util.Iterator ite2=set01.iterator();//�ٽ� ����� �о���
		while(ite2.hasNext()){//for�� ������ Ȯ�� ������ while��� ���� �� ����
			System.out.println(ite2.next());			
		}
	}

}
