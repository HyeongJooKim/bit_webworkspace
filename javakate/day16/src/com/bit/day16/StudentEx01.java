package com.bit.day16;

public class StudentEx01 {

	public static void main(String[] args) {

		StudentVO[] arr1 = new StudentVO[0];
		StudentVO s=new StudentVO();
		s.setName("��");
		s.setKorean(50);
		s.setEnglish(60);
		s.setMath(70);
		System.out.println(arr1.length);//������ 0
		arr1=StudentArrayUtil.add(arr1, s);
		//parameter�� �ִ� �̸��� ������ ��, �������� ����.
		//�ű� ���� ���� �Ʒ����� ��꿡 ���Եȴٴ� ���� �����ִ� �� ��. �� arr�̶�� �迭�� ����
		System.out.println(arr1.length);//�ϳ� �þ 1

		System.out.println("s�� index��ȣ�� "+StudentArrayUtil.indexOf(arr1, s));//s�� index��ȣ�� 0
		
		StudentVO s2=new StudentVO();
		s2.setName("��");
		s2.setKorean(50);
		s2.setEnglish(60);
		s2.setMath(70);
		
		System.out.println("s2�� index��ȣ�� "+StudentArrayUtil.indexOf(arr1, s2));//s2�� index��ȣ�� -1

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

		arr1=StudentArrayUtil.add(arr1, s2);
		arr1=StudentArrayUtil.add(arr1, s3);
		arr1=StudentArrayUtil.add(arr1, s4);
		arr1=StudentArrayUtil.add(arr1, s5);

		System.out.println("���� �迭ũ���: "+arr1.length);//���� �迭ũ���: 5

		arr1=StudentArrayUtil.remove(arr1, s3);
		
		System.out.println("���� �迭ũ���: "+arr1.length);//���� �迭ũ���: 4
		
		StudentVO s6=new StudentVO();
		s6.setName("��");
		s6.setKorean(50);
		s6.setEnglish(60);
		s6.setMath(70);
		arr1=StudentArrayUtil.remove(arr1, s6);//add���� ���� ���� ����� ���������� �׳� �״�� 
		System.out.println("���� �迭ũ���: "+arr1.length);//���� �迭ũ���: 4
	}
}
