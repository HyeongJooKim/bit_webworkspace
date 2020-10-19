package com.bit.day17;

import java.util.ArrayList;
import java.util.Scanner;

public class BookEx01 {

	public static void main(String[] args) {
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		BookViewer viewer=new BookViewer();
		BookController controller=new BookController(list);
		Scanner scanner=new Scanner(System.in);
		
		BookVO b=new BookVO();
		b.setTitle("����1");
		b.setAuthor("����1");
		b.setRentCost(1000);
		controller.add(b);

		b = new BookVO();
		b.setTitle("����2");
		b.setAuthor("����2");
		b.setRentCost(2000);
		controller.add(b);

		b = new BookVO();
		b.setTitle("����3");
		b.setAuthor("����3");
		b.setRentCost(3000);
		controller.add(b);		

		System.out.println("----------------------------------------");
		System.out.println("�����������α׷�");
		System.out.println("----------------------------------------");
		while(true){
			System.out.print("1.�뿩 2.�ݳ� 3.��� 4.�������Է� 5.���� >>");
			int choice=scanner.nextInt();
			scanner.nextLine();
			if(choice==1){
				//�뿩����
				controller.listRentIn();
				System.out.print("�뿩�� ������ ��ȣ�� �Է��ϼ���:");
				b=new BookVO();
				int input=scanner.nextInt();
				b.setId(input);
				scanner.nextLine();
				controller.rentOut(b);
				System.out.println(input+"�� ������ �뿩�ϼ̽��ϴ�.");
			}else if(choice==2){
				//�ݳ�����
				controller.listRentOut();
				System.out.print("�ݳ��� ������ ��ȣ�� �Է��ϼ���:");
				b=new BookVO();
				int input=scanner.nextInt();
				b.setId(input);
				scanner.nextLine();
				controller.rentIn(b);
				System.out.println(input+"�� ������ �ݳ��ϼ̽��ϴ�.");
			}else if(choice==3){
				//��½���
				System.out.print("1.�뿩���� å ��� 2.�뿩������ å ��� 3.��ü å��� 4.���ư��� >>");
				int choice2=scanner.nextInt();
				scanner.nextLine();
				if(choice2==1){
					//�뿩���
					controller.listRentOut();
				}else if(choice2==2){
					//�뿩���ɸ��
					controller.listRentIn();
				}else if(choice2==3){
					//��ü���
					controller.listAll();
				}else if(choice2==4){
					continue;		
				}
			}else if(choice==4){
				//�Է½���
				b=viewer.setInfo(scanner);
				controller.add(b);
			}else if(choice==5){
				//����
				System.out.println("�̿��� �ּż� �����մϴ�.");
				break;
			}
		}//while end
	}//main end
}//class end
