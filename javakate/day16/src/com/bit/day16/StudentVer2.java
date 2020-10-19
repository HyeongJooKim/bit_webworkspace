package com.bit.day16;

import java.util.Scanner;

//3세대 언어식으로 해보자
//여전히 단일최대원칙은 안지켜짐. 더 개선해보자
public class StudentVer2 {

	//필드를 만들자
	String name;
	int korean;
	int english;
	int math;

	//메소드를 만들자
	public int calculateSum(){
		return korean+english+math;
	}
	
	public double calculateAverage(){
		return calculateSum()/3.0;
	}
	
	public static void main(String[] args) {
	
		StudentVer2 s=new StudentVer2();
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하세요: ");
		s.name = scanner.nextLine();
		System.out.print("학생의 국어점수를 입력하세요: ");
		s.korean = scanner.nextInt();
		System.out.print("학생의 영어점수를 입력하세요: ");
		s.english = scanner.nextInt();
		System.out.print("학생의 수학점수를 입력하세요: ");
		s.math = scanner.nextInt();
		
		s.calculateSum();
		s.calculateAverage();
		
		System.out.printf(
				"학생이름: %s\t국어점수: %d\t 영어점수: %d\t 수학점수: %d\t 총점: %d\t 평균: %.2f",
				s.name, s.korean, s.english, s.math, s.calculateSum(), s.calculateAverage());
		scanner.close();//안써도 되나, 메모리씀.
			
	}

}
