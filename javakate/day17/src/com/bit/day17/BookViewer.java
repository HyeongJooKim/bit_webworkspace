package com.bit.day17;

import java.util.ArrayList;
import java.util.Scanner;

public class BookViewer {
	
	BookVO b=new BookVO();
//	ArrayList<BookVO> listOut=new ArrayList<BookVO>();
//	ArrayList<BookVO> listIn=new ArrayList<BookVO>();
	
	//�� �Է¹޴� method
	public BookVO setInfo(Scanner scanner){
		System.out.println("���������Է��ϱ�");
		System.out.print("����:");
		scanner.nextLine();
		b.setTitle(scanner.nextLine());
		System.out.print("����:");
		b.setAuthor(scanner.nextLine());
		System.out.print("�뿩����:");
		b.setRentCost(scanner.nextInt());
		return b;
	}
}