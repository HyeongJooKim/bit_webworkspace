package day06;

/*실습: method 써보자

계산기(ver 0.0.1)
-----------------
1번째 숫자>>2
2번째 숫자>>3
1.+2.-3x4.÷>>1
결과>> 2+3=5
1.계속 0.종료>>1

1번째 숫자>>4
2번째 숫자>>2
1.+2.-3x4.÷>>4
결과>> 4÷2=2
1.계속 0.종료>>1

1번째 숫자>>5
2번째 숫자>>2
1.+2.-3x4.÷>>4
결과>> 5÷2=2.5
1.계속 0.종료>>0

*/
/*
class Ex08{
	public static void main(String[] args){

		int a=0;//첫번째 숫자, 입력받기
		int b=0;//두번째 숫자, 입력받기
		int c=0;//연산기호, 입력받기
		int d=1;//계속 종료 입력받기

		System.out.println("\n계산기(ver 0.0.1)");
		System.out.println("-----------------");

		while(d==1){
			java.util.Scanner sc=new java.util.Scanner(System.in);//입력받기 준비
			System.out.print("1번째 숫자>>");
			a=sc.nextInt();
			System.out.print("2번째 숫자>>");
			b=sc.nextInt();
			System.out.print("1.+2.-3x4.÷>>");
			c=sc.nextInt();

			int rs=0;//연산결과
			if(c==1){
				System.out.println("결과>> "+a+"+"+b+"="+(a+b));
			}else if(c==2){
				System.out.println("결과>> "+a+"-"+b+"="+(a-b));
			}else if(c==3){
				System.out.println("결과>> "+a+"x"+b+"="+(a*b));
			}else if(c==4){
				System.out.println("결과>> "+a+"÷"+b+"="+(a*10/b/10.0));
			}
			System.out.print("1.계속 0.종료>>");
			d=sc.nextInt();	
			System.out.println();		

		}//while end

	}//main end

	public static void fPlus(int a, int b){
		int rs=0;
		rs=a+b;
	}//fPlus end


	public static void fMinus(int a, int b){
		int rs=0;
		rs=a-b;
	}//fMinus end

	public static void fTimes(int a, int b){
		int rs=0;
		rs=a*b;
	}//fTimes end

	public static void fDiv(int a, int b){
		int rs=0;
		rs=a/b;
	}//fDiv end

}//class end
*/