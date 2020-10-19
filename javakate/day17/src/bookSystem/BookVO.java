package bookSystem;
//도서관리프로그램
//도서정보:
//1.id
//2.제목
//3.저자
//4.대여가격
//5.현재상태(대여중  or no)--> 이게 없는 방법으로도 충분히 가능.
//							이렇게 말고, list 두개(대여중,대여가능) 돌리면 됨.
//프로그램기능
//1.대여
//2.반납
//3.각종정보출력
//	1.대여중인 책 출력
//	2.대여가능한 책 출력
//  3.천체 책 목록 출력
//4.생성자를 통해 책 정보 입력하기

public class BookVO {

	//필요한 필드들
	private int id;
	private String title;
	private String author;
	private int price;
//	private boolean rented=false;//대여중 true; 대여가능 false
	
	//필요한 기능들: setter, getter, equals, toString
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getRentCost() {
		return price;
	}
	public void setRentCost(int rentCost) {
		this.price = rentCost;
	}
//	public boolean isRented() {
//		return rented;
//	}
//	public void setRented(boolean rented) {
//		this.rented = rented;
//	}

	@Override
	public String toString() {
		return "id: " + id + "\t제목: " + title + "\t저자: " + author
				+ "\t대여가격: " + price;
	}
	
	public boolean equals(Object o){
		if(o instanceof BookVO){
			BookVO b=(BookVO)o;
			if(id==b.id){
				return true;
			}
		}
		return false;
	}
}
