package grade00;

//2020-05-11 day04 Ex24

public class Grade002T {
	public static void main(String[] args){

		java.util.Scanner sc
		=new java.util.Scanner(System.in);

		int kor;
		int eng;
		int math;
		System.out.print("국어>");
		kor=sc.nextInt();
		System.out.print("영어>");
		eng=sc.nextInt();
		System.out.print("수학>");
		math=sc.nextInt();

		String msg="";
		msg+="성적관리 프로그램(ver 0.0.2)";//msg+= 여러msg를 더해주는 역할. 각 줄을 print 해주는 대신
		msg+="\n____________________________";
		msg+="\n국어 "+kor;
		msg+="\n영어 "+eng;
		msg+="\n수학 "+math;
		msg+="\n____________________________";
		int sum=kor+eng+math;
		msg+="\n합계 "+sum;
		msg+="\n____________________________";
		double avg=sum*100/3/100.0;
		msg+="\n평균 "+avg;
		msg+="\n____________________________";

		char grade='F'; //70
		int temp=sum/3/10;//십자리수 구하기
		switch(temp){
			case 10: 
			case 9: grade-=1;//90점대의 경우 아래 4줄 모두 실행하므로 5를 뺀 (F(70)>A(65) 5차이)
			case 8: grade-=1;
			case 7: grade-=1;
			case 6: grade-=2;//60점대의 경우 위 모두 패스하고 F(70)-2만 하면 D
			default:
		}
		msg+="\n학점 "+grade+"학점";
		System.out.println(msg);
		
		sc.close();
	}
}
