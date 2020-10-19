package com.bit.day17;

import java.util.List;
//프로그램기능
//1.대여
//2.반납
//3.각종정보출력
//	1.대여중인 책 출력
//	2.대여가능한 책 출력
//  3.천체 책 목록 출력
public class BookController {

	List<BookVO> list;
	public BookController(List<BookVO> list){
		this.list=list;
	}
		
	//id 생성하고 list에 추가 (입력은 viewer에서 따로 하자
	public void add(BookVO b){
		if(list.size()==0){
			b.id=0;
		}else{
			int id=list.get(list.size()-1).getId() + 1;
			b.setId(id);
		}
		list.add(b);
	}

	//대출 발생
	public BookVO rentOut(BookVO b){
		BookVO result=null;
		if(list.indexOf(b)!=-1){//이런 책이 있으면
			int index=list.indexOf(b);
			result=list.get(index);
			result.setRented(true);
		}
		return result;
	}

	//반납
	public BookVO rentIn(BookVO b){
		BookVO result=null;
		if(list.indexOf(b)!=-1){//이런 책이 있으면
			int index=list.indexOf(b);
			result=list.get(index);
			result.setRented(false);
		}
		return result;
	}
	
	//대출나간 목록 보여주기. 목록 만들기는 Controller에서
	public void listRentOut(){
		BookVO b=new BookVO();
		for(int i=0; i<list.size(); i++){
			b=list.get(i);
			if(b.isRented()){
				System.out.println(b);
			}
		}
	}

	//대출가능 목록
	public void listRentIn(){
		BookVO b=new BookVO();
		for(int i=0; i<list.size(); i++){
			b=list.get(i);
			if(!b.isRented()){
				System.out.println(b);
			}
		}
	}
	
	public void listAll(){
		BookVO b=new BookVO();
		for(int i=0; i<list.size(); i++){
			b=list.get(i);
			System.out.println(b);
		}
	}
	
	
}
