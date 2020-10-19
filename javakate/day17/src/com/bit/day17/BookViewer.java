package com.bit.day17;

import java.util.ArrayList;
import java.util.Scanner;

public class BookViewer {
	
	BookVO b=new BookVO();
//	ArrayList<BookVO> listOut=new ArrayList<BookVO>();
//	ArrayList<BookVO> listIn=new ArrayList<BookVO>();
	
	//값 입력받는 method
	public BookVO setInfo(Scanner scanner){
		System.out.println("도서정보입력하기");
		System.out.print("제목:");
		scanner.nextLine();
		b.setTitle(scanner.nextLine());
		System.out.print("저자:");
		b.setAuthor(scanner.nextLine());
		System.out.print("대여가격:");
		b.setRentCost(scanner.nextInt());
		return b;
	}
}