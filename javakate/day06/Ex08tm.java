package day06;
/*
class Ex08tm{

	public static int inputPrint(String msg){//반복되는 입력받기를 메서드로
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print(msg);
		int su=sc.nextInt();
		return su;
	}//inputPrint end		

	public static char func1(int c){
		char result='A';
		if(c==1){
			result='+';
		}else if(c==2){
			result='-';
		}else if(c==3){
			result='x';
		}else if(c==4){
			result='÷';
		}
		return result;
	}//func1 end

	public static int func2(int a, int b, int c){
		int result=0;
		if(c==1){
			result=a+b;
		}else if(c==2){
			result=a-b;
		}else if(c==3){
			result=a*b;
		}else if(c==4){
			result=a/b;//여전히 정수값
		}
		return result;
	}//func2 end

	public static void main(String[] args){

		int a=0;//첫번째 숫자, 입력받기
		int b=0;//두번째 숫자, 입력받기
		int c=0;//연산부호 입력받기
	//	int result=0;

		System.out.println("\n계산기(ver 0.0.1)");
		System.out.println("-----------------");

		do{
			a=inputPrint("1번째 숫자>>");
			b=inputPrint("2번째 숫자>>");
			c=inputPrint("1.+ 2.- 3.x 4.÷ >>");

			resultPrint(a, b, c);

		}while(inputPrint("1.계속 0.종료>>")!=0);//조건 검사를 맨 마지막에 하는 방법
		System.out.print("감사합니다");		
	}//main end

	public static void resultPrint(int a,int b,int c){

		if(c==4&&a%b!=0){
		System.out.println("결과>> "+a+func1(c)+b+"="+(a*1.0)/b);
		}else{System.out.println("결과>> "+a+func1(c)+b+"="+func2(a,b,c));
		}	
	}//resultPrint end
}//class end
*/