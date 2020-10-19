package day06;

class Ex09T{
	public static void main(String[] args){

	System.out.println("\nQ1.A~Z 출력하세요");
	for(int i=0;i<='Z'-'A';i++){
		char tmp=(char)('A'+i);
		System.out.print(tmp+" ");
	}

	System.out.println("\n\nQ2.a~z 출력하세요");
	for(int i=0;i<='z'-'a';i++){
		char tmp=(char)('a'+i);
		System.out.print(tmp+" ");
	}

	System.out.println("\n\nQ3.A(a), B(b),.... Z(z) 출력하세요");
	for(int i=0;i<='Z'-'A';i++){
		char tmp=(char)('A'+i);
		char tmp2=(char)('a'+i);
		System.out.print(tmp+"("+tmp2+") ");
	}

	System.out.println("\n\nQ4.다음을 출력하세요: ★★★★세줄");
	for(int i=0;i<16;i++){
		if(i%5!=0){
			System.out.print("★");
		}else{
			System.out.println();		
		}
	}

	System.out.println("\n\nQ5.다음을 출력하세요:  1 2 3 / 4 5 6 / 7 8 9");
	for(int i=1;i<10;i++){
		System.out.print(i);
		if(i%3==0){
			System.out.println();
		}
	}

	System.out.println("\n\nQ5.다음을 출력하세요:  1 2 3 / 4 5 6 / 7 8 9 - 다른방법");
	int su=1;
	for(int i=1;i<13;i++){
		if(i%4!=0){//4번째 문자자리를 \n으로 처리하는 방법
			System.out.print(su++);
		}else{
			System.out.println();
		}
	}

	System.out.println("\n\nQ5.다음을 출력하세요:  1 2 3 / 4 5 6 / 7 8 9 - 또 다른방법");
	for(int i=1;i<10;i++){
		System.out.println(i+++" "+i+++" "+i);
	}

	System.out.println("\n\nQ5.다음을 출력하세요:  1 2 3 / 4 5 6 / 7 8 9 - 또또 다른방법");
	int a=1;
	for(int i=0;i<3;i++){
		System.out.println(a+++" "+a+++" "+a++);
	}

	System.out.println("\n\nQ6.다음을 출력하세요:  1 2 3 / 2 3 4 / 3 4 5");
	int limit=3;
	for(int i=1;i<6; i++){
		System.out.print(i);
		if(limit==i){
			System.out.println();
			limit++;
			i-=2;
			if(limit==6){break;}
		}
	}

	}//main end
}//class end
