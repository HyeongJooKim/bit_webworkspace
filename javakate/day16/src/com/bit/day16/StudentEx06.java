package com.bit.day16;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx06 {
	//�������ڵ�

	public static void main(String[] args) {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		Scanner sc=new Scanner(System.in);
		StudentController controller=new StudentController();
		System.out.println("----------------------------------------");
		System.out.println("������������α׷�");
		System.out.println("----------------------------------------");
		
		while(true){
			System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.���� >>");
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice==1){
				StudentVO s=new StudentVO(); 
				System.out.print("�й�: ");
				s.setId(sc.nextInt());
				sc.nextLine();
				System.out.print("�̸�: ");
				s.setName(sc.nextLine());
				System.out.print("����: ");
				s.setKorean(sc.nextInt());
				System.out.print("����: ");
				s.setEnglish(sc.nextInt());
				System.out.print("����: ");
				s.setMath(sc.nextInt());
				list.add(s);				
			}else if(choice==2){
				System.out.println("------------------------------------------------------");
				System.out.println("�й�\t�̸�\t����\t����\t����\t�հ�\t���");
				System.out.println("------------------------------------------------------");
				for(StudentVO s : list){
					System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getKorean()+"\t"+s.getEnglish()+"\t"+s.getMath()+"\t"+controller.calculateSum(s)+"\t"+controller.calculateAverage(s));
//					System.out.println(s);//�ϴ� ��� �� ����
				}
				System.out.println("------------------------------------------------------");
				
			}else if(choice==3){
				//����
				if(list.size()==0){
					System.out.println("������ ���� �����ϴ�. �Է� �� �������ּ���.");
				}else{
					for(StudentVO s : list){
						System.out.println(s);//�ϴ� ��� �� ����
					}
					System.out.print("������ �й��� �Է����ּ���: ");
					StudentVO s=new StudentVO(); 
					s.setId(sc.nextInt());
					while(controller.findById(list, s)==null){
						System.out.print("���� �й��Դϴ�. ������ �й��� �ٽ� �Է����ּ���: ");
						s.setId(sc.nextInt());//�й� �ٽ� �Է¹ޱ�
					}
					sc.nextLine();//nextLine��������
					System.out.print("�̸�: ");
					s.setName(sc.nextLine());
					System.out.print("����: ");
					s.setKorean(sc.nextInt());
					System.out.print("����: ");
					s.setEnglish(sc.nextInt());
					System.out.print("����: ");
					s.setMath(sc.nextInt());
	
					//�����ϴ� �ΰ��� ���
					//1. �ش� index�� �����ְ� �������� ����
					//2. ArrayList.set() ���
					//�� ���� ��� index �ʿ��ϴ� ã�Ƴ���
					int index=list.indexOf(s);
					list.set(index,s);//index �ڸ��� s ���� override ����
				}
			}else if(choice==4){
				//����
				if(list.size()==0){
					System.out.println("������ ���� �����ϴ�. �Է� �� �������ּ���.");
				}else{
					for(StudentVO s : list){
						System.out.println(s);//�ϴ� ��� �� ����
					}
					System.out.print("������ �й��� �Է����ּ���: ");
					StudentVO s=new StudentVO(); 
					s.setId(sc.nextInt());
					while(controller.findById(list, s)==null){
						System.out.print("���� �й��Դϴ�. ������ �й��� �ٽ� �Է����ּ���: ");
						s.setId(sc.nextInt());//�й� �ٽ� �Է¹ޱ�
					}
					sc.nextLine();//nextLine��������
					list.remove(s);
				}
			}else if(choice==5){
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
		}
		sc.close();
	}//main end
}//class end