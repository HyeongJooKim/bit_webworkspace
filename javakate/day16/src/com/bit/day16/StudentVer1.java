package com.bit.day16;

import java.util.Scanner;

//2���� ���

public class StudentVer1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�л��� �̸��� �Է��ϼ���: ");
		String name = scanner.nextLine();
		System.out.print("�л��� ���������� �Է��ϼ���: ");
		int korean = scanner.nextInt();
		System.out.print("�л��� ���������� �Է��ϼ���: ");
		int english = scanner.nextInt();
		System.out.print("�л��� ���������� �Է��ϼ���: ");
		int math = scanner.nextInt();
		int sum = korean + english + math;
		double average = sum / 3.0;
		System.out.printf(
				"�л��̸�: %s\t��������: %d\t ��������: %d\t ��������: %d\t ����: %d\t ���: %.2f",
				name, korean, english, math, sum, average);
		// printf ���: ���� ���� �ѹ��� ���� �� �ִ�.
		// %s �� String����, %d�� int ��������, %f �Ǽ��������� ǥ��
		// print, scanner ��� web���� ������ �� �Ⱦ�. �ֿܼ��̴�...
		scanner.close();

	}

}
