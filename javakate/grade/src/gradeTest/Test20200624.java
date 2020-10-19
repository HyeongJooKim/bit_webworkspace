package gradeTest;

import java.util.ArrayList;
import java.util.Scanner;

/*학생성적관리프로그램(ver1.0.0)
 * 1.Student class 를 작성하여 학번, 이름, 국어, 영어, 수학을 담으시오.
 * 2.자료구조를 활용하여 동적으로 작동되도록 하시오.
 * 3.콘솔 입출력하도록 작성하시오.
 * ex 	1.전체(총점., 평군 안나와도 됨) 2.상세 3.입력 4.수정(점수만) 5.삭제 0.종료>2
 * 		학번>1
 * 		학번:1 이름:홍길동
 * 		국어:90	영어:100	수학:100
 * 		총점:000
 * 		평균:00.00
 * 
 * 5:30pm까지
 * bit01class@gmail.com로 코드 보냄
 * 제출양식:
 * 	제목:프로그래밍언어활용(김형주)
 * 	첨부:실행스크린샷(5장)
 * 		소스 코드(java 파일)
 *  
 */

class Student{
	int num;
	String name;
	int kor;
	int eng;
	int math;
	
	int tot(){
		return kor+eng+math;
	}
	
	double avg(){
		return tot()*100/3/100.0;
	}
	
}//Student

public class Test20200624 {
	
	public static void main(String[] args) {

		ArrayList<Student> data=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		System.out.print(""
				+ "==========================================\r\n"
				+ "      학생성적관리프로그램(ver1.0.0)\r\n"
				+ "==========================================\r\n");
		String menu="1.전체 2.상세 3.입력 4.수정 5.삭제 0.종료>";
		String input=null;
		
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0")){//종료
				System.out.println("이용해 주셔서 감사합니다.");
				break;
			}else if(input.equals("1")){//전체보기
				if(data.size()>0){
					System.out.print("\r\n"
							+ "=====================================\r\n"
							+ "          1. 전체 성적 보기\r\n"
							+ "-------------------------------------\r\n"
							+ "학번\t이름\t국어\t영어\t수학\r\n"
							+ "=====================================\r\n");
					for(int i=0; i<data.size(); i++){
						Student stu=data.get(i);
						System.out.println(stu.num+"\t"+stu.name+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.math);
					}
					System.out.println("=====================================\r\n");
				}else{
					System.out.println("\r\n입력된 성적이 없습니다. 성적을 먼저 입력해 주세요.\r\n");
				}
			}else if(input.equals("2")){//상세보기
				System.out.print("상세보기할 학번을 입력해 주세요>");
				int num=Integer.parseInt(sc.nextLine());
				for(int i=0; i<data.size(); i++){
					Student stu=data.get(i);
					if(stu.num==num){
						System.out.print("\r\n"
								+ "========================================\r\n"
								+ "          2. 상세 성적 보기\r\n"
								+ "========================================\r\n");
						System.out.println("학번:"+stu.num+"\t\t이름:"+stu.name);
						System.out.println("국어:"+stu.kor+"\t\t영어:"+stu.eng+"\t\t수학:"+stu.math);
						System.out.println("총점:"+stu.tot());
						System.out.println("평균:"+stu.avg());
						break;
					}
				}
				System.out.println("========================================\r\n");
			}else if(input.equals("3")){//입력
				Student stu=new Student();
				System.out.print("학번>");
				stu.num=Integer.parseInt(sc.nextLine());
				System.out.print("이름>");
				stu.name=sc.nextLine();
				System.out.print("국어>");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print("영어>");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print("수학>");
				stu.math=Integer.parseInt(sc.nextLine());
				data.add(stu);
			}else if(input.equals("4")){//수정
				System.out.print("수정할 학번을 입력해 주세요>");
				int num=Integer.parseInt(sc.nextLine());
				for(int i=0; i<data.size(); i++){
					Student stu=data.get(i);
					if(stu.num==num){
						System.out.println("학번:"+stu.num+" 이름:"+stu.name+"의 수정할 성적을 입력해주세요");
						System.out.print("국어:"+stu.kor+">");
						stu.kor=Integer.parseInt(sc.nextLine());
						System.out.print("영어:"+stu.eng+">");
						stu.eng=Integer.parseInt(sc.nextLine());
						System.out.print("수학:"+stu.math+">");
						stu.math=Integer.parseInt(sc.nextLine());
						data.set(i, stu);
						break;
					}
				}
			}else if(input.equals("5")){//삭제
				System.out.print("삭제할 학번을 입력해 주세요>");
				int num=Integer.parseInt(sc.nextLine());
				for(int i=0; i<data.size(); i++){
					Student stu=data.get(i);
					if(stu.num==num){
						data.remove(i);
						System.out.println(num+"번 학생의 자료가 삭제되었습니다.");
						break;
					}
				}
			}//if~else
		}//while
		sc.close();
	}//main
}//class