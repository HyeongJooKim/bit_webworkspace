package com.bit.day16;

import java.util.Scanner;

//day17. StudentViewer 전체 다 다시 개비
//Ex에서 반복되는 출력부분 여기로 옮기자 
public class StudentViewer {

	//정보 입력받는 method
	public StudentVO setInformation(Scanner scanner){
		StudentVO s=new StudentVO(); 
		System.out.print("이름: ");
		s.setName(scanner.nextLine());
		System.out.print("국어: ");
		s.setKorean(scanner.nextInt());
		System.out.print("영어: ");
		s.setEnglish(scanner.nextInt());
		System.out.print("수학: ");
		s.setMath(scanner.nextInt());
		return s;
	}
	
	//정보 출력하는 method
	
	
	
	
	
}//class end		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		StudentVO s = new StudentVO();
//		System.out.print("학생의 이름을 입력하세요: ");
//		s.setName(scanner.nextLine());
//		System.out.print("학생의 국어점수를 입력하세요: ");
////		s.korean = scanner.nextInt();
//		s.setKorean(scanner.nextInt());
//		System.out.print("학생의 영어점수를 입력하세요: ");
//		s.setEnglish(scanner.nextInt());
//		System.out.print("학생의 수학점수를 입력하세요: ");
//		s.setMath(scanner.nextInt());
////		scanner.nextLine();
//		//nextInt(); 다음의 nextLine(); 스캐너 버그 없애려면 이걸 한 줄 더 넣어주면 됨.
//			//Scanner: nextLine 다음에 nextInt 쓰면 문제 없이 이어 쓸 수 있지만,
//			//nextInt 다음에 nextLine 쓰면 오류발생하더라.
//			//왜? nextInt()에서 15+enter를 치면 정수인지를 확인하여 정수인 15를 값에 넣고
//			//enter 를 buffer memory에 가지고 있음.
//			//여기서 nextLine이 들어오면 enter를 입력값으로 인식해서 종료됨
//			//nextInt 다음에 nextDouble이 오면 double 값이 올 때까지 기다림.
//			//nextLine에서만 이런 일 발생
//			//nextInt 다음에 nextLine 필요하면 nextLine 한 번 더 쓰면 실행됨
//			//Scanner 버그를 해결하기 위해 nextLine을 단독실행시켜줄 떄
//			//Eclipse의 자동완성 기능은 결과값이 없구나, 자동완성을 알파벳순으로 추천해야지 때문에
//			//Scanner.hasNextLine();이 적힘. 하지만 이건 버퍼메모리의 값을 가져오지 않고
//			//단순히 다음이 있나 없나만 알려주므로 버그를 해결 못함.
//			//반드시 scanner.nextLine();을 골라 선택해야 함.
//		
//		StudentController sc=new StudentController();
////		sc.calculateSum(s);
////		sc.calculateAverage(s);
//		
//		System.out.printf(
//				"학생이름: %s\t국어점수: %d\t 영어점수: %d\t 수학점수: %d\t 총점: %d\t 평균: %.2f",
//				s.getName(), s.getKorean(), s.getEnglish(), s.getMath(), sc.calculateSum(s), sc.calculateAverage(s));
//		scanner.close();//안써도 되나, 메모리씀.

//이렇게 데이터를 담는 틀(모델). UI(뷰), 모델을 컨트롤하는 컨트롤러로 분리해서
//프로그램을 만드는 패턴을 MVC 패턴이라고 함 (Model View Controller Pattern)
