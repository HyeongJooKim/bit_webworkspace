package com.bit.day16;

import java.util.Scanner;

//2세대 방식

public class StudentVer1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하세요: ");
		String name = scanner.nextLine();
		System.out.print("학생의 국어점수를 입력하세요: ");
		int korean = scanner.nextInt();
		System.out.print("학생의 영어점수를 입력하세요: ");
		int english = scanner.nextInt();
		System.out.print("학생의 수학점수를 입력하세요: ");
		int math = scanner.nextInt();
		int sum = korean + english + math;
		double average = sum / 3.0;
		System.out.printf(
				"학생이름: %s\t국어점수: %d\t 영어점수: %d\t 수학점수: %d\t 총점: %d\t 평균: %.2f",
				name, korean, english, math, sum, average);
		// printf 기능: 여러 변수 한번에 뽑을 수 있다.
		// %s 는 String변수, %d는 int 정수변수, %f 실수변수임을 표시
		// print, scanner 기능 web가면 어차피 다 안씀. 콘솔용이니...
		scanner.close();

	}

}
