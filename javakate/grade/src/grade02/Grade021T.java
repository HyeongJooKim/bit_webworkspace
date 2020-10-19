package grade02;

//2020-05-29 day18 Ex03

import java.util.Arrays;
import java.util.Scanner;

//Q2.�����������α׷�(�迭, �����Ҵ�ǰ�,
//������ �̸� �Է� ���ϰ� ������ �ԷµǴ´�� �þ��, �迭 ���� ����)

class Student {
	int num, kor, eng, math;
}

public class Grade021T {
	// ������ �ڵ�. �� �ܼ��ϰ�
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------------");
		System.out.println("�л������������α׷�(Ver 0.2.1)");
		System.out.println("-------------------------------");

		Student[] data = new Student[0];// �ʱⰪ�� ���� 0
		String input = null;

		while (true) {
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>>");
			input = sc.nextLine();
			if (input.equals("0")) {
				break;
			} else if (input.equals("1")) {
				// ���� ����
				System.out.println("-------------------------------");
				System.out.println("�й�\t|����\t|����\t|����");
				System.out.println("-------------------------------");
				for (int i = 0; i < data.length; i++) {
					Student stu = data[i];
					System.out.print(stu.num);
					System.out.print("\t");
					System.out.print(stu.kor);
					System.out.print("\t");
					System.out.print(stu.eng);
					System.out.print("\t");
					System.out.println(stu.math);
					System.out.println("-------------------------------");
				}
			} else if (input.equals("2")) {
				// �Է� ����
				Student stu = new Student();
				System.out.println("�й�>> ");
				stu.num = Integer.parseInt(sc.nextLine());
				System.out.println("����>> ");
				stu.kor = Integer.parseInt(sc.nextLine());
				System.out.println("����>> ");
				stu.eng = Integer.parseInt(sc.nextLine());
				System.out.println("����>> ");
				stu.math = Integer.parseInt(sc.nextLine());

				// ���� ���� �־���� �� temp��
				// �迭�� ���� ���� �پ��� ���
				// 1. �ڵ����
				// Student[] temp=new Student[data.length+1];//���� �ϳ� �ø� �迭 ����
				// �����ؼ� �����.
				// for(int i=0; i<data.length; i++){
				// temp[i]=data[i];
				// }
				// data=temp;//ũ�� �ϳ� �ø� �� �迭�� data�� �������ָ� data ũ�⵵ �ϳ� �þ.
				// data[data.length-1]=stu;//�ϳ� ����� �迭�� ������ �ڸ��� �Է�. �̷��� ���� ����
				// ������� ��
				// 2.
				// Student[] temp=new Student[data.length+1];//���� �ϳ� �ø� �迭 ����
				// �����ؼ� �����.
				// System.arraycopy(data, 0, temp, 0, data.length);
				// data=temp;//ũ�� �ϳ� �ø� �� �迭�� data�� �������ָ� data ũ�⵵ �ϳ� �þ.
				// data[data.length-1]=stu;//�ϳ� ����� �迭�� ������ �ڸ��� �Է�. �̷��� ���� ����
				// ������� ��
				// //3.
				data = Arrays.copyOf(data, data.length + 1);
				// �迭�� ũ�⸦ �÷��� �����ϸ� �� ������ �� �迭�� ����� ���� ���� �ڸ��� default ���� �־���
				data[data.length - 1] = stu;

			} else if (input.equals("3")) {
				// ���� ����
				Student stu = new Student();
				System.out.println("�й�>> ");
				stu.num = Integer.parseInt(sc.nextLine());
				System.out.println("����>> ");
				stu.kor = Integer.parseInt(sc.nextLine());
				System.out.println("����>> ");
				stu.eng = Integer.parseInt(sc.nextLine());
				System.out.println("����>> ");
				stu.math = Integer.parseInt(sc.nextLine());

				int i = -1;// data[i]���� ���� ���� for ������ ���� ��.
				for (i = 0; i < data.length; i++) {
					Student target = data[i];
					if (stu.num == target.num) {
						break;
					}
				}
				if (i < data.length) {
					data[i] = stu;
				} else {
					System.out.println("������ �й��� �����ϴ�");
				}

			} else if (input.equals("4")) {
				// ���� ����
				Student stu = new Student();
				System.out.println("�й�>> ");
				int num = Integer.parseInt(sc.nextLine());
				int idx = -1;// data[i]���� ���� ���� for ������ ���� ��.
				for (int i = 0; i < data.length; i++) {
					if (data[i].num == num) {
						idx = i;
					}
				}
				if (idx > -1) {
					Student[] temp = new Student[data.length - 1];// �迭 ���� �ϳ�
																	// ���̰�
					// �պκ� ���� ��� 1
					// for(int i=0; i<idx; i++){
					// temp[i]=data[i];
					// }
					// �պκ� ���� ��� 2
					System.arraycopy(data, 0, temp, 0, idx);

					// �޺κ� ����
					// for(int i=idx+1; i<data.length; i++){
					// temp[i-1]=data[i];
					// �޺κ� ����
					// for(int i=idx; i<temp.length; i++){
					// temp[i]=data[i+1];//�޺κ� ����
					// }
					// �޺κ� ���� ��� 2
					System.arraycopy(data, idx + 1, temp, idx, temp.length
							- idx);

					data = temp;// ���� ����� ������???
				}
			}
		}// while end
		sc.close();
	}// main end
}// class end