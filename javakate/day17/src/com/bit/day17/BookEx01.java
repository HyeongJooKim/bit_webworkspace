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
		b.setTitle("도서1");
		b.setAuthor("저자1");
		b.setRentCost(1000);
		controller.add(b);

		b = new BookVO();
		b.setTitle("도서2");
		b.setAuthor("저자2");
		b.setRentCost(2000);
		controller.add(b);

		b = new BookVO();
		b.setTitle("도서3");
		b.setAuthor("저자3");
		b.setRentCost(3000);
		controller.add(b);		

		System.out.println("----------------------------------------");
		System.out.println("도서관리프로그램");
		System.out.println("----------------------------------------");
		while(true){
			System.out.print("1.대여 2.반납 3.출력 4.도서보입력 5.종료 >>");
			int choice=scanner.nextInt();
			scanner.nextLine();
			if(choice==1){
				//대여실행
				controller.listRentIn();
				System.out.print("대여할 도서의 번호를 입력하세요:");
				b=new BookVO();
				int input=scanner.nextInt();
				b.setId(input);
				scanner.nextLine();
				controller.rentOut(b);
				System.out.println(input+"번 도서를 대여하셨습니다.");
			}else if(choice==2){
				//반납실행
				controller.listRentOut();
				System.out.print("반납할 도서의 번호를 입력하세요:");
				b=new BookVO();
				int input=scanner.nextInt();
				b.setId(input);
				scanner.nextLine();
				controller.rentIn(b);
				System.out.println(input+"번 도서를 반납하셨습니다.");
			}else if(choice==3){
				//출력실행
				System.out.print("1.대여중인 책 목록 2.대여가능한 책 목록 3.전체 책목록 4.돌아가기 >>");
				int choice2=scanner.nextInt();
				scanner.nextLine();
				if(choice2==1){
					//대여목록
					controller.listRentOut();
				}else if(choice2==2){
					//대여가능목록
					controller.listRentIn();
				}else if(choice2==3){
					//전체목록
					controller.listAll();
				}else if(choice2==4){
					continue;		
				}
			}else if(choice==4){
				//입력실행
				b=viewer.setInfo(scanner);
				controller.add(b);
			}else if(choice==5){
				//종료
				System.out.println("이용해 주셔서 감사합니다.");
				break;
			}
		}//while end
	}//main end
}//class end
