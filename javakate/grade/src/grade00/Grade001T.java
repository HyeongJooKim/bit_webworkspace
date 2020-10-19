package grade00;

//2020-05-08 day03 Ex16

public class Grade001T {
	public static void main(String[] args){

		int a=100;//국어성적
		int b=100;//영어성적
		int c=100;//수학성적
		int t=a+b+c;//총점
		double d;//평균은 실수 타입으로
		d=t*100/3/100.0;//정수를 실수로 나누면 실수로 강제 형변환됨
	
		System.out.println("성적관리 프로그램(ver 0.0.1)");
		System.out.println("-----------------------------");
		System.out.println("국어 "+a);
		System.out.println("영어 "+b);
		System.out.println("수학 "+c);
		System.out.println("-----------------------------");
		System.out.println("합계 "+t);
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
