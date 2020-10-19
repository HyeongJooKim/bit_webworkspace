package day06;

class Ex09{
	public static void main(String[] args){

	System.out.println("\nQ1.A~Z 출력하세요");
	for(int i='A';i<='Z';i++){
		System.out.print((char)i+" ");
	}

	System.out.println("\n\nQ2.a~z 출력하세요");
	for(int i='a';i<='z';i++){
		System.out.print((char)i+" ");
	}

	System.out.println("\n\nQ3.A(a), B(b),.... Z(z) 출력하세요");
	for(int i='A';i<='Z';i++){
		int dif='a'-'A';
		System.out.print((char)i+"("+(char)(i+dif)+") ");
	}

	System.out.println("\n\nQ4.다음을 출력하세요: ★★★★세줄");
	for(int i=0;i<3;i++){
		for(int j=1;j<=4;j++){
			System.out.print("★");
		}
		System.out.println();		
	}

	System.out.println("\n\nQ5.다음을 출력하세요:  1 2 3 / 4 5 6 / 7 8 9");

	for(int i=0;i<7;i+=3){
		for(int j=1;j<=3;j++){
			System.out.print(i+j);
		}
		System.out.println();
	}

	System.out.println("\n\nQ6.다음을 출력하세요:  1 2 3 / 2 3 4 / 3 4 5");

	for(int i=0;i<3;i++){
		for(int j=1;j<=3;j++){
			System.out.print(i+j);
		}
		System.out.println();
	}

	}//main end
}//class end
