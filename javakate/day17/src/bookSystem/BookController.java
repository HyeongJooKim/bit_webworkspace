package bookSystem;

import java.util.ArrayList;
import java.util.List;
//프로그램기능
//1.대여
//2.반납
//3.각종정보출력
//	1.대여중인 책 출력
//	2.대여가능한 책 출력
//  3.천체 책 목록 출력
public class BookController {

	private List<BookVO> inventoryList;//재고목록
	private List<BookVO> rentList;//대여나간 목록
	
	public BookController(List<BookVO> inventoryList, List<BookVO> rentList){
		this.inventoryList=inventoryList;
		this.rentList=rentList;
	}

	//리스트에서 해당하는 Id의 다른 요소들을 가져오는 메소드
	public BookVO retrieveBookVO(List<BookVO> list, BookVO b){
		int index=list.indexOf(b);
		return list.get(index);
	}
	
	//뷰어가 대여되는 책을 보내주면 인벤토리에 렌트로 이동시킨믄 메소드
	public void rentBookVO(BookVO b){
		rentList.add(retrieveBookVO(inventoryList, b));
		inventoryList.remove(b);
	}

	//뷰어가 반납되는 책을 보내주면 렌트에서 인벤토리로 이동시키는 메소드
	public void returnBookVO(BookVO b){
		inventoryList.add(retrieveBookVO(rentList, b));
		rentList.remove(b);
	}

	//해당 BookVO객체가 대여 가능한지 검증하는 메소드
	//검증은 매우 중요하다
	public boolean validateRentBookVO(BookVO b){
		return inventoryList.contains(b);
	}
	
	//해당객체가 반납가능한지 검증하는 메소드
	public boolean validateReturnBookVO(BookVO b){
		return rentList.contains(b);
	}

	//두 list를 하나로 합쳐서 리턴하는 메소드
	public List<BookVO> selectAll(){
		List<BookVO> list = new ArrayList<BookVO>();
		list.addAll(inventoryList);
		list.addAll(rentList);
		
		return list;
	}
	
	public List<BookVO> selectInventory(){
		return inventoryList;
	}
	
	public List<BookVO> selectRent(){
		return rentList;
	}
	
	//빌린 책이 있는지 확인
	public boolean isRentEmpty(){
		return rentList.size()==0;
	}
	
	//대여할 책이 있는지 확인
	public boolean isInventoryEmpty(){
		return inventoryList.size()==0;
	}
}