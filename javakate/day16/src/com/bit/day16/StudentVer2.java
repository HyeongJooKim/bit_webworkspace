package com.bit.day16;

import java.util.Scanner;

//3���� �������� �غ���
//������ �����ִ��Ģ�� ��������. �� �����غ���
public class StudentVer2 {

	//�ʵ带 ������
	String name;
	int korean;
	int english;
	int math;

	//�޼ҵ带 ������
	public int calculateSum(){
		return korean+english+math;
	}
	
	public double calculateAverage(){
		return calculateSum()/3.0;
	}
	
	public static void main(String[] args) {
	
		StudentVer2 s=new StudentVer2();
		Scanner scanner = new Scanner(System.in);
		System.out.print("�л��� �̸��� �Է��ϼ���: ");
		s.name = scanner.nextLine();
		System.out.print("�л��� ���������� �Է��ϼ���: ");
		s.korean = scanner.nextInt();
		System.out.print("�л��� ���������� �Է��ϼ���: ");
		s.english = scanner.nextInt();
		System.out.print("�л��� ���������� �Է��ϼ���: ");
		s.math = scanner.nextInt();
		
		s.calculateSum();
		s.calculateAverage();
		
		System.out.printf(
				"�л��̸�: %s\t��������: %d\t ��������: %d\t ��������: %d\t ����: %d\t ���: %.2f",
				s.name, s.korean, s.english, s.math, s.calculateSum(), s.calculateAverage());
		scanner.close();//�Ƚᵵ �ǳ�, �޸𸮾�.
			
	}

}
