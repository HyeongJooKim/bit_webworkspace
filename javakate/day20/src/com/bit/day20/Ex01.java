package com.bit.day20;

//Vector. java �ʱ���� �ִ� �����Ҵ� �ڷᱸ��
//implements List
//Vector�� ���� �� ���� ���� ���� ���̳�, Vector�� ����� ������ ���� ���� ���� ���̴�.
//���� �̾Ƴ� ���� �˾ƾ� ��.

public class Ex01 {

	public static void main(String[] args) {
		java.util.Vector vec01=new java.util.Vector();
		vec01.addElement("��");
		vec01.addElement("��");
		vec01.addElement("��");
		vec01.addElement("��");
		
		for(int i=0; i<vec01.size(); i++){
			System.out.println(vec01.get(i));
		}
		System.out.println("------------------");
		
		System.out.println(vec01.elementAt(0));
		System.out.println(vec01.elementAt(1));
		System.out.println(vec01.elementAt(2));
		System.out.println(vec01.elementAt(3));
		
		System.out.println("------------------");
		
		vec01.insertElementAt("3��°", 2);//�����ֱ�
		vec01.removeElementAt(3);//index ��ȣ�� ����
		vec01.removeElement("��");//������ ����
		
		System.out.println(vec01.elementAt(0));
		System.out.println(vec01.elementAt(1));
		System.out.println(vec01.elementAt(2));
		
		System.out.println("------------------");
		
		vec01.add("��");
		vec01.add("��");
		
		java.util.Enumeration em=vec01.elements();//��ȣ�� ���� �о���.
		//���� ���� �ٲ㵵 ���� ���� �ȹٲ�(�翬�ѵ�) �б�����Ǵ� ��.
		//�ڷ�� ��ȣ�ϰ� �б�� ������ �� �ִ�.
//		System.out.println(em.nextElement());//���� �� ������ java.util.NoSuchElementException
//		System.out.println(em.hasMoreElements());//���� ���� ������ true
		
		while(em.hasMoreElements()){//���� ��� �����ϰ�
			System.out.println(em.nextElement());
		}
		vec01.lastIndexOf("�ټ���°");
	}
}
