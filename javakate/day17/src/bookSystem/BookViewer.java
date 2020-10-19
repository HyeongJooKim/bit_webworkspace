package bookSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookViewer {
	private BookController bookController;
	private Scanner scanner;
	public BookViewer(){//������
		scanner=new Scanner(System.in);
		ArrayList<BookVO> inventory = new ArrayList<>();
		BookVO b=new BookVO();

		b.setId(1);
		b.setTitle("����1");
		b.setAuthor("����1");
		b.setRentCost(1000);
		inventory.add(b);
		
		b = new BookVO();
		b.setId(2);
		b.setTitle("����2");
		b.setAuthor("����2");
		b.setRentCost(2000);
		inventory.add(b);

		b = new BookVO();
		b.setId(3);
		b.setTitle("����3");
		b.setAuthor("����3");
		b.setRentCost(3000);
		inventory.add(b);
		
		b = new BookVO();
		b.setId(4);
		b.setTitle("����4");
		b.setAuthor("����4");
		b.setRentCost(4000);
		inventory.add(b);
		
		ArrayList<BookVO> rent = new ArrayList<>();
		bookController=new BookController(inventory, rent);
		showMenu();
	}
	
	private void showMenu(){
		while(true){
			System.out.println("------------------");
			System.out.println("��Ʈ�����뿩��");
			System.out.println("------------------");
			System.out.println("1.�뿩 2.�ݳ� 3.��� 4.����");
			System.out.print("> ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			if(choice==1){//�뿩����
				rentBook();
			}else if(choice==2){//�ݳ�����
				returnBook();
			}else if(choice==3){//��½���
				printList();
			}else if(choice==4){//����
				System.out.println("�̿��� �ּż� �����մϴ�.");
				break;
			}
		}
	}
		
	//�뿩 ������ ����Ʈ ���	
	private void rentBook(){
		if(bookController.isInventoryEmpty()){
			System.out.println("�뿩������ å�� �����ϴ�.");
		}else{
			System.out.println("=====�뿩���ɸ��=====");
			for(BookVO b : bookController.selectInventory()){
				System.out.println(b);
			}
			System.out.println("======================");
			System.out.println("�뿩�� ������ ��ȣ�� �Է��ϼ���");
			System.out.print("> ");
			int id=scanner.nextInt();
			BookVO b=new BookVO();
			b.setId(id);
			while(!bookController.validateRentBookVO(b)){
				System.out.println("�߸� �����ϼ̾��. ��ȣ�� �ٽ� �Է����ּ���");
				System.out.print("> ");
				id=scanner.nextInt();
				b.setId(id);
			}
			bookController.rentBookVO(b);
		}
	}
	
	//�ݳ� ������ ����Ʈ ���	
	private void returnBook(){
		//�ݳ��Ұ� �ִ��� Ȯ��
		if(bookController.isRentEmpty()){
			System.out.println("�ݳ��Ͻ� å�� �����ϴ�.");
		}else{
			System.out.println("=====�ݳ����ɸ��=====");
			for(BookVO b : bookController.selectRent()){
				System.out.println(b);
			}
			System.out.println("======================");
			System.out.println("�ݳ��� ������ ��ȣ�� �Է��ϼ���");
			System.out.print("> ");
			int id=scanner.nextInt();
			BookVO b=new BookVO();
			b.setId(id);
			while(!bookController.validateReturnBookVO(b)){
				System.out.println("�߸� �����ϼ̾��. ��ȣ�� �ٽ� �Է����ּ���");
				System.out.print("> ");
				id=scanner.nextInt();
				b.setId(id);
			}
			bookController.returnBookVO(b);
		}
	}

	public void printList(){
		System.out.println("����� ����� �����ϼ���");
		System.out.println("1.�뿩���� 2.�ݳ����� 3.��ü���");
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
			System.out.println("�߸� �����ϼ̾��.");
		}
		if(selectedList!=null){
			System.out.println("======================");
			for(BookVO b : selectedList){
				System.out.println(b);
			}
		}
	}	
}