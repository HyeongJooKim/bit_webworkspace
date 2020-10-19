package com.bit.day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentEx04 {

	public static void main(String[] args) {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		Scanner sc=new Scanner(System.in);
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
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|�հ�\t|���");
				System.out.println("------------------------------------------------------");
//				Collections.sort(list);//���� �����ϳ�?
				for(StudentVO s : list){
					StudentController controller=new StudentController();
					System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getKorean()+"\t"+s.getEnglish()+"\t"+s.getMath()+"\t"+controller.calculateSum(s)+"\t"+controller.calculateAverage(s));
				}
				System.out.println("------------------------------------------------------");
				
			}else if(choice==3){
				//����
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
				list.add(s);//�� ������ ���� �Է�. �Է��ؾ� list.get(i)�ؼ� ���� �� �� �ִ�.
				
				System.out.println(list.size());
				StudentVO temp=list.get(list.size()-1);//���� �����Էµ� �� ��ȣ�� ��ȣ����
				int index=0;				
				for(int i=0; i<list.size(); i++){
					s=list.get(i);
					if(temp.getId()==s.getId()){
						index=list.indexOf(s);//ù��° index ã���� ���߱�
						break;
					}
				}
				list.remove(index);
				
			}else if(choice==4){
				//����
				
				System.out.print("�й�: ");
				int num=sc.nextInt();
				int index=0;				
				for(int i=0; i<list.size(); i++){
					StudentVO s=list.get(i);
					if(num==s.getId()){
						index=list.indexOf(s);//ù��° index ã���� ���߱�
						break;
					}
				}
				list.remove(index);				
				
				sc.nextLine();
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

