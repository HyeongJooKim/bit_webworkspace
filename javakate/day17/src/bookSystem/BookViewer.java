package bookSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookViewer {
	private BookController bookController;
	private Scanner scanner;
	public BookViewer(){//생성자
		scanner=new Scanner(System.in);
		ArrayList<BookVO> inventory = new ArrayList<>();
		BookVO b=new BookVO();

		b.setId(1);
		b.setTitle("도서1");
		b.setAuthor("저자1");
		b.setRentCost(1000);
		inventory.add(b);
		
		b = new BookVO();
		b.setId(2);
		b.setTitle("도서2");
		b.setAuthor("저자2");
		b.setRentCost(2000);
		inventory.add(b);

		b = new BookVO();
		b.setId(3);
		b.setTitle("도서3");
		b.setAuthor("저자3");
		b.setRentCost(3000);
		inventory.add(b);
		
		b = new BookVO();
		b.setId(4);
		b.setTitle("도서4");
		b.setAuthor("저자4");
		b.setRentCost(4000);
		inventory.add(b);
		
		ArrayList<BookVO> rent = new ArrayList<>();
		bookController=new BookController(inventory, rent);
		showMenu();
	}
	
	private void showMenu(){
		while(true){
			System.out.println("------------------");
			System.out.println("비트도서대여점");
			System.out.println("------------------");
			System.out.println("1.대여 2.반납 3.출력 4.종료");
			System.out.print("> ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			if(choice==1){//대여실행
				rentBook();
			}else if(choice==2){//반납실행
				returnBook();
			}else if(choice==3){//출력실행
				printList();
			}else if(choice==4){//종료
				System.out.println("이용해 주셔서 감사합니다.");
				break;
			}
		}
	}
		
	//대여 가능한 리스트 출력	
	private void rentBook(){
		if(bookController.isInventoryEmpty()){
			System.out.println("대여가능한 책이 없습니다.");
		}else{
			System.out.println("=====대여가능목록=====");
			for(BookVO b : bookController.selectInventory()){
				System.out.println(b);
			}
			System.out.println("======================");
			System.out.println("대여할 도서의 번호를 입력하세요");
			System.out.print("> ");
			int id=scanner.nextInt();
			BookVO b=new BookVO();
			b.setId(id);
			while(!bookController.validateRentBookVO(b)){
				System.out.println("잘못 선택하셨어요. 번호를 다시 입력해주세요");
				System.out.print("> ");
				id=scanner.nextInt();
				b.setId(id);
			}
			bookController.rentBookVO(b);
		}
	}
	
	//반납 가능한 리스트 출력	
	private void returnBook(){
		//반납할게 있는지 확인
		if(bookController.isRentEmpty()){
			System.out.println("반납하실 책이 없습니다.");
		}else{
			System.out.println("=====반납가능목록=====");
			for(BookVO b : bookController.selectRent()){
				System.out.println(b);
			}
			System.out.println("======================");
			System.out.println("반납할 도서의 번호를 입력하세요");
			System.out.print("> ");
			int id=scanner.nextInt();
			BookVO b=new BookVO();
			b.setId(id);
			while(!bookController.validateReturnBookVO(b)){
				System.out.println("잘못 선택하셨어요. 번호를 다시 입력해주세요");
				System.out.print("> ");
				id=scanner.nextInt();
				b.setId(id);
			}
			bookController.returnBookVO(b);
		}
	}

	public void printList(){
		System.out.println("출력할 목록을 선택하세요");
		System.out.println("1.대여가능 2.반납가능 3.전체목록");
		System.out.println("> ");
		int choice=scanner.nextInt();
		List<BookVO> selectedList = null;
		if(choice==1){
			selectedList=bookController.selectInventory();
		}else if(choice==2){
			selectedList=bookController.selectRent();
		}else if(choice==3){
			selectedList=bookController.selectAll();
		}else{
			System.out.println("잘못 선택하셨어요.");
		}
		if(selectedList!=null){
			System.out.println("======================");
			for(BookVO b : selectedList){
				System.out.println(b);
			}
		}
	}	
}