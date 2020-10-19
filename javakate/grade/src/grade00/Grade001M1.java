package grade00;

//2020-05-08 day03 Ex16

public class Grade001M1 {

	public static void main(String[] args){

	/* 다음을 출력하시오. 평균 A.90~100 B.80~90미만 C.70~80미만 D.60~70미만 F.60미만

	성적관리 프로그램(Ver 0.0.1)
	-----------------------------
	국어 90
	영어 80
	수학 70
	-----------------------------
	합계 00000
	-----------------------------
	평균 00.00
	-----------------------------
	학점 B학점
	*/

		int a=60;//국어성적
		int b=50;//영어성적
		int c=40;//수학성적
		double d=(a+b+c)/3;//평균
	
		System.out.println("성적관리 프로그램(ver 0.0.1)");
		System.out.println("-----------------------------");
		System.out.println("국어 "+a);
		System.out.println("영어 "+b);
		System.out.println("수학 "+c);
		System.out.println("-----------------------------");
		System.out.println("합계 "+(a+b+c));
		System.out.println("-----------------------------");
		System.out.println("평균 "+d);
		System.out.println("-----------------------------");

		if(d<60){
			System.out.println("학점 F학점");
		}else if(d<70){
			System.out.println("학점 D학점");
		}else if(d<80){
			System.out.println("학점 C학점");
		}else if(d<90){
			System.out.println("학점 B학점");
		}else{ 
			System.out.println("학점 A학점");
		}
	}
}
