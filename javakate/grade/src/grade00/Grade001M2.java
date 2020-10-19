package grade00;

//2020-05-08 day03 Ex16

public class Grade001M2 {

	public static void main(String[] args){

		int a=78;//국어성적
		int b=77;//영어성적
		int c=99;//수학성적
		int t=a+b+c;//총점
		double d=(a+b+c)/3;//평균
	
		System.out.println("성적관리 프로그램(ver 0.0.1)");
		System.out.println("-----------------------------");
		System.out.println("국어 "+a);
		System.out.println("영어 "+b);
		System.out.println("수학 "+c);
		System.out.println("-----------------------------");
		System.out.println("합계 "+(a+b+c));
		System.out.println("-----------------------------");
		System.out.print("평균 "+t/3);

		if(t%3==0){
			System.out.println(".00");
		}else if(t%3==1){
			System.out.println(".33");
		}else if(t%3==2){
			System.out.println(".67");
		}

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
