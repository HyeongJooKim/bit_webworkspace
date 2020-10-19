package gradeTest;

import java.util.ArrayList;
import java.util.Scanner;

/*�л������������α׷�(ver1.0.0)
 * 1.Student class �� �ۼ��Ͽ� �й�, �̸�, ����, ����, ������ �����ÿ�.
 * 2.�ڷᱸ���� Ȱ���Ͽ� �������� �۵��ǵ��� �Ͻÿ�.
 * 3.�ܼ� ������ϵ��� �ۼ��Ͻÿ�.
 * ex 	1.��ü(����., �� �ȳ��͵� ��) 2.�� 3.�Է� 4.����(������) 5.���� 0.����>2
 * 		�й�>1
 * 		�й�:1 �̸�:ȫ�浿
 * 		����:90	����:100	����:100
 * 		����:000
 * 		���:00.00
 * 
 * 5:30pm����
 * bit01class@gmail.com�� �ڵ� ����
 * ������:
 * 	����:���α׷��־��Ȱ��(������)
 * 	÷��:���ེũ����(5��)
 * 		�ҽ� �ڵ�(java ����)
 *  
 */

class Student{
	int num;
	String name;
	int kor;
	int eng;
	int math;
	
	int tot(){
		return kor+eng+math;
	}
	
	double avg(){
		return tot()*100/3/100.0;
	}
	
}//Student

public class Test20200624 {
	
	public static void main(String[] args) {

		ArrayList<Student> data=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		System.out.print(""
				+ "==========================================\r\n"
				+ "      �л������������α׷�(ver1.0.0)\r\n"
				+ "==========================================\r\n");
		String menu="1.��ü 2.�� 3.�Է� 4.���� 5.���� 0.����>";
		String input=null;
		
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0")){//����
				System.out.println("�̿��� �ּż� �����մϴ�.");
				break;
			}else if(input.equals("1")){//��ü����
				if(data.size()>0){
					System.out.print("\r\n"
							+ "=====================================\r\n"
							+ "          1. ��ü ���� ����\r\n"
							+ "-------------------------------------\r\n"
							+ "�й�\t�̸�\t����\t����\t����\r\n"
							+ "=====================================\r\n");
					for(int i=0; i<data.size(); i++){
						Student stu=data.get(i);
						System.out.println(stu.num+"\t"+stu.name+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.math);
					}
					System.out.println("=====================================\r\n");
				}else{
					System.out.println("\r\n�Էµ� ������ �����ϴ�. ������ ���� �Է��� �ּ���.\r\n");
				}
			}else if(input.equals("2")){//�󼼺���
				System.out.print("�󼼺����� �й��� �Է��� �ּ���>");
				int num=Integer.parseInt(sc.nextLine());
				for(int i=0; i<data.size(); i++){
					Student stu=data.get(i);
					if(stu.num==num){
						System.out.print("\r\n"
								+ "========================================\r\n"
								+ "          2. �� ���� ����\r\n"
								+ "========================================\r\n");
						System.out.println("�й�:"+stu.num+"\t\t�̸�:"+stu.name);
						System.out.println("����:"+stu.kor+"\t\t����:"+stu.eng+"\t\t����:"+stu.math);
						System.out.println("����:"+stu.tot());
						System.out.println("���:"+stu.avg());
						break;
					}
				}
				System.out.println("========================================\r\n");
			}else if(input.equals("3")){//�Է�
				Student stu=new Student();
				System.out.print("�й�>");
				stu.num=Integer.parseInt(sc.nextLine());
				System.out.print("�̸�>");
				stu.name=sc.nextLine();
				System.out.print("����>");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print("����>");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print("����>");
				stu.math=Integer.parseInt(sc.nextLine());
				data.add(stu);
			}else if(input.equals("4")){//����
				System.out.print("������ �й��� �Է��� �ּ���>");
				int num=Integer.parseInt(sc.nextLine());
				for(int i=0; i<data.size(); i++){
					Student stu=data.get(i);
					if(stu.num==num){
						System.out.println("�й�:"+stu.num+" �̸�:"+stu.name+"�� ������ ������ �Է����ּ���");
						System.out.print("����:"+stu.kor+">");
						stu.kor=Integer.parseInt(sc.nextLine());
						System.out.print("����:"+stu.eng+">");
						stu.eng=Integer.parseInt(sc.nextLine());
						System.out.print("����:"+stu.math+">");
						stu.math=Integer.parseInt(sc.nextLine());
						data.set(i, stu);
						break;
					}
				}
			}else if(input.equals("5")){//����
				System.out.print("������ �й��� �Է��� �ּ���>");
				int num=Integer.parseInt(sc.nextLine());
				for(int i=0; i<data.size(); i++){
					Student stu=data.get(i);
					if(stu.num==num){
						data.remove(i);
						System.out.println(num+"�� �л��� �ڷᰡ �����Ǿ����ϴ�.");
						break;
					}
				}
			}//if~else
		}//while
		sc.close();
	}//main
}//class