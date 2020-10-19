package com.bit.day16;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx07 {
	//�������ڵ� DI

	public static void main(String[] args) {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		Scanner scanner=new Scanner(System.in);
		StudentController controller=new StudentController(list);//List list
		StudentViewer viewer=new StudentViewer();
		System.out.println("----------------------------------------");
		System.out.println("������������α׷�");
		System.out.println("----------------------------------------");
		
		while(true){
			System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.���� >>");
			int choice = scanner.nextInt();
			scanner.nextLine();
			if(choice==1){
//				StudentVO s=new StudentVO(); �� �� ��� �Ʒ�ó�� �ٲ��� 
				StudentVO s=viewer.setInformation(scanner);
//				System.out.print("�й�: "); controller���� �ڵ� �ο�
//				s.setId(sc.nextInt());
////				sc.nextLine();
//				System.out.print("�̸�: ");
//				s.setName(scanner.nextLine());
//				System.out.print("����: ");
//				s.setKorean(scanner.nextInt());
//				System.out.print("����: ");
//				s.setEnglish(scanner.nextInt());
//				System.out.print("����: ");
//				s.setMath(scanner.nextInt());
				controller.add(s);//add�ϴ� ����� controller���� ����
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
					s.setId(scanner.nextInt());
					while(controller.findById(s)==null){
						System.out.print("���� �й��Դϴ�. ������ �й��� �ٽ� �Է����ּ���: ");
						s.setId(scanner.nextInt());//�й� �ٽ� �Է¹ޱ�
					}
					scanner.nextLine();//nextLine��������
					
					s=viewer.setInformation(scanner);
					controller.set(s);
//							
//					System.out.print("�̸�: ");
//					s.setName(scanner.nextLine());
//					System.out.print("����: ");
//					s.setKorean(scanner.nextInt());
//					System.out.print("����: ");
//					s.setEnglish(scanner.nextInt());
//					System.out.print("����: ");
//					s.setMath(scanner.nextInt());
	
					//�����ϴ� �ΰ��� ���
					//1. �ش� index�� �����ְ� �������� ����
					//2. ArrayList.set() ���
					//�� ���� ��� index �ʿ��ϴ� ã�Ƴ���
					
//					int index=list.indexOf(s);//controller.set���� index�� ã���Ƿ� ���ʿ�
					controller.set(s);//index �ڸ��� s ���� override ����
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
					s.setId(scanner.nextInt());
					while(controller.findById(s)==null){
						System.out.print("���� �й��Դϴ�. ������ �й��� �ٽ� �Է����ּ���: ");
						s.setId(scanner.nextInt());//�й� �ٽ� �Է¹ޱ�
					}
					scanner.nextLine();//nextLine��������
					controller.remove(s);
				}
			}else if(choice==5){
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
		}
		scanner.close();
	}//main end
}//class end