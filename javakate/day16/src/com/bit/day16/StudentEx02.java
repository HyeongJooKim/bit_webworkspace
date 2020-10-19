package com.bit.day16;

import java.util.ArrayList;
//TeacherVO ��� Ŭ�������� �迭��ɵ��� �����ϰ� �ʹٸ�?
//�츮�� �� �迭�� ���缭 �޼ҵ带 ������ �ϳ�?
//ArrayList ����

//Collections Framework���� ���� ������ ���� ��ü�� �ѹ��� �ٷ� �� �ְ� �� �ִ� �پ��� Ŭ�������� �ִ�.
//���� ��ǥ���� ���� ArrayList, HashMap? �� ������ ���� ���� ���� �� ��
public class StudentEx02 {

	public static void main(String[] args) {
		ArrayList<StudentVO> list = new ArrayList<>();
		//<Ŭ�����̸�>(); �������� �� ����, ArrayList ��ü�� Ŭ������ü��
		//<> template�̶� �θ�
		//template�̶� �ش� �ݷ��� ��ü�� ���� Ŭ������ �������� �����ϴ� ��.
		//��, template�ȿ��� Ŭ������ �� �� �ִ�
		//��, �⺻�� �ڷ�� ����.
		//��? Collections Framework�� �ּҰ��� �̿��Ͽ� ���� ���� ��ҵ��� ��Ʈ���ϱ� ������ 
		//�ּҰ��� �������� �ʴ� �⺻�� ������ Ÿ�Ե��� ���ø� �ȿ� �� �� ����.
		//�⺻�� ������Ÿ���� Ŭ�������� ���·� �ٲ� wrapper class�� �����Ƿ� �̰� ���� �ȴ�.
		//Collections Framework������ equals(); method�� ���������� ���ο��� Ȱ����
		//���� Collections Framework�� ����ִ� Ŭ������ ����� Ȱ���ϱ� ���ؼ���
		//���� ���� Ŭ������ equals();�� �����ϴ� ���� �ſ� �߿���.
		//��? java.lang.Object�� equals()�� return this==o; �� ���� �ִ�.
		
		//ArrayList�� ��� ũ�Ⱑ �ڵ����� �ٲ�
		//size();�� �� �� ����.
		System.out.println("list�� ����ũ��: "+list.size());//list�� ����ũ��: 0
		
		StudentVO s=new StudentVO();
		s.setName("��");
		s.setKorean(50);
		s.setEnglish(60);
		s.setMath(70);
		
		StudentVO s2=new StudentVO();
		s2.setName("��");
		s2.setKorean(50);
		s2.setEnglish(60);
		s2.setMath(70);
		
		StudentVO s3=new StudentVO();
		s3.setName("��");
		s3.setKorean(50);
		s3.setEnglish(60);
		s3.setMath(70);
		
		StudentVO s4=new StudentVO();
		s4.setName("��");
		s4.setKorean(50);
		s4.setEnglish(60);
		s4.setMath(70);
		
		StudentVO s5=new StudentVO();
		s5.setName("��");
		s5.setKorean(50);
		s5.setEnglish(60);
		s5.setMath(70);

		//ArrayList�� �߰��� ���� add(�߰��� ��)�� �����ϸ� ��
		list.add(s);
		System.out.println("list�� ����ũ��: "+list.size());//list�� ����ũ��: 1
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		System.out.println("list�� ����ũ��: "+list.size());//list�� ����ũ��: 5
		
		//Ư����ȣ�� �����ֱ� �ϸ� �� �ڸ��� ������ ���� ��ĭ�� �и���. add(index, element)
		StudentVO s6=new StudentVO();
		s6.setName("��");
		s6.setKorean(50);
		s6.setEnglish(60);
		s6.setMath(70);
		
		//�ش� ��ġ�� ��ü�� ȣ���� �� get(index)
		System.out.println("index 2�� StudentVO�� getName(): "+list.get(2).getName());
		//index 2�� StudentVO�� getName(): ��
	
		list.add(2, s6);
		System.out.println("index 2�� StudentVO�� getName(): "+list.get(2).getName());
		//index 2�� StudentVO�� getName(): ��
		System.out.println("index 3�� StudentVO�� getName(): "+list.get(3).getName());
		//index 3�� StudentVO�� getName(): �� //�� ĭ �и�
		
		//list���� �ش� ��ü�� ��ġ�� �˰� ���� �� indexOf(e)�� ȣ��
		System.out.println("s4�� list index: "+list.indexOf(s4));
		//s4�� list index: 4
		//���� �ش� ��ü�� ����Ʈ�� ������ ������ ���� ���� index�� ����
		//���� ���� ���� index �� �˰� ������ 
		System.out.println("s4�� list lastIndex:"+list.lastIndexOf(s4));
		//s4�� list lastIndex:4
		//���� �ߺ� ���� �� �� �ְڳ�
		
		//list�� �ִ��� �������� �ñ��ϸ� contains
		System.out.println("s4�� ������? "+list.contains(s4));//s4�� ������? true

		//indexOf, lastIndexOf, contains ��� �������� �ʴ� ��ü�� �˻��ϸ� ���� -1, -1, false�� ���ϵȴ�
		
		//list���� ������ �� 2���� ����� ������
		//1. �ش� �ε��� ����
		System.out.println("list�� ���� ũ��: "+list.size());//list�� ���� ũ��: 6
		list.remove(0);
		System.out.println("list�� ���� ũ��: "+list.size());//list�� ���� ũ��: 5

		//2. �ش� ��ü�� ���� ��ġ�ϴ� ��� �߿��� ���� �չ�ȣ�� ����
		System.out.println("contains(s6): "+list.contains(s6));//contains(s6): true
		StudentVO s60=new StudentVO();
		s60.setName("��");
		s60.setKorean(50);
		s60.setEnglish(60);
		s60.setMath(70);
		list.remove(s60);//s60�� ���� ���� ����� s6�� ã�� �����. �׷� ���� ������ no change
		System.out.println("contains(s6): "+list.contains(s6));//contains(s6): false
		System.out.println("list�� ���� ũ��: "+list.size());//list�� ���� ũ��: 4
	}
}
