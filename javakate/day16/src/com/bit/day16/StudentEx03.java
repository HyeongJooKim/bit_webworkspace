package com.bit.day16;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx03 {

	public static void main(String[] args) {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("----------------------------------------");
			System.out.println("������������α׷�");
			System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.���� >>");
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice==1){
				//�Է��� ���� ��ä �����ؼ� ����Ʈ�� �߰��ϸ� ������ �ҷ��� �� �ִ�
				StudentVO s=new StudentVO(); 
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
				for(StudentVO s : list){//��¿����� s��� �ӽ� �̸� ����� �� ��.
					System.out.println(s.getName()+"\t"+s.getKorean()+"\t"+s.getEnglish()+"\t"+s.getMath());
				}
//				for(int i=0; i<list.size(); i++){
//					StudentVO s=list.get(i);
//					System.out.println(s.getName()+"\t"+s.getKorean()+"\t"+s.getEnglish()+"\t"+s.getMath());
//				}
				
			}else if(choice==3){
				//����
			}else if(choice==4){
				//����
			}else if(choice==5){
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
		}
		sc.close();
	}//main end
}//class end

//�й� ���� �Է��ϴ� �� �߰��غ���
//����, ������ ���غ���