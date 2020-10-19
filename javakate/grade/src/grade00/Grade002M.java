package grade00;

//2020-05-11 day04 Ex21

public class Grade002M {
	public static void main(String[] args){
		int a=94;//국어
		int b=80;//영어
		int c=77;//수학
		int ttl=a+b+c;
		double avg=ttl*100/3/100.0;
		char gr='F';
		
		if(avg>=90){gr='A';}
		if(avg<90&&avg>=80){gr='B';}
		if(avg<80&&avg>=70){gr='C';}
		if(avg<70&&avg>=60){gr='D';}

		System.out.println("성적관리 프로그램(ver 0.0.2)");
		System.out.println("____________________________");
		System.out.println("국어 "+a);		
		System.out.println("영어 "+b);		
		System.out.println("수학 "+c);		
		System.out.println("____________________________");
		System.out.println("합계 "+ttl);		
		System.out.println("____________________________");
		System.out.println("평균 "+avg);		
		System.out.println("____________________________");
		System.out.print("학점 "+gr+"학점");
	}
}
