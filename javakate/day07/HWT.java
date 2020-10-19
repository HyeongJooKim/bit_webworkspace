package day07;

class HWT{//선생님 코딩 중 나랑 다른 것들만

	public static void main(String[] args){

/*	System.out.println("\nQ1.a----------------");//열과 행 조건만 바꿔주면 확장 쉽다
	for(int i=0; i<4; i++){
		for(int j=0; j<4; j++){
			if(j<=i){System.out.print("★ ");
			}
		}
		System.out.println();
	}//Q1.a end	

	System.out.println("\nQ1.b----------------");//확장성 있는 방법
	int total=0;
	int cnt=2;
	for(int i=0; i<10; i++){
		System.out.print("★ ");
		if(i==total){
			System.out.println();
			total+=cnt++;
		}
	}//Q1.b end	

	System.out.println("\nQ2.a------------------");
	for(int i=0; i<4; i++){
		for(int j=0; j<4; j++){
			if(j<=i){System.out.print(j+1);}
		}
		System.out.println();
	}//Q2.a end

	System.out.println("\nQ2.b(나머지 활용)----");	
	int temp=2;
	for(int i=1; i<5; i++){
		if(i%temp==0){
			System.out.println();
			temp++;
			i=0;//시작을 다시 1로 만들어 주려고
		}else{
			System.out.print(i%temp);
		}
	}//Q2.b end

	System.out.println("\nQ5.a-----------------");
	for(int i=0; i<4; i++){
		for(int j=0; j<4; j++){
			if(i+1-j>0){System.out.print(i+1-j);
			}
		}
		System.out.println();
	}//Q5.a end

	System.out.println("\nQ6.a----------------");
	for(int i=0; i<4; i++){
		for(int j=0; j<4; j++){
			if(j>=i){System.out.print("★ ");
			}
		}
		System.out.println();
	}//Q6.a end

	System.out.println("\nQ7.a--------------");
	for(int i=0; i<4; i++){
		for(int j=0; j<4; j++){
			if(j>=3-i){
				System.out.print("★ ");
			}else{
				System.out.print("   ");
			}
		}
		System.out.println();
	}//Q7.a end

	System.out.println("\nQ7.b--------------");
	for(int i=0; i<4; i++){
		for(int j=0; j<4; j++){
			if(j<3-i){
				System.out.print("   ");
			}else{
				System.out.print("★ ");
			}
		}
		System.out.println();
	}//Q7.b end
*/
	System.out.println("\nQ8.a----------------");
	int i=0;
	int j=0;
	for(i=0; i<4; i++){
		for(j=0; j<7; j++){
			if(j<3-i){
				System.out.print("   ");
			}else if(j<i+4){
				System.out.print("★ ");
			}
		}
		System.out.println();
	}

	for(i=0; i<3; i++){
		for(j=0; j<7; j++){
			if(j<i+1){
				System.out.print("   ");
			}else if(j<6-i){
				System.out.print("★ ");
			}
		}
		System.out.println();
	}//Q8.a end

	}//main end
}//class end