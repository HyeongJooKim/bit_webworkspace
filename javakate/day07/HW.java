package day07;

class ExD007HW{

	public static void main(String[] args){

	System.out.println("\nQ1------------------");
	for(int i=0; i<4; i++){
		for(int j=0; j<=i; j++){
			System.out.print("★ ");
		}
		System.out.println();
	}//Q1 end	

	System.out.println("\nQ2------------------");
	for(int i=1; i<=4; i++){
		for(int j=1; j<=i; j++){
			System.out.print(j+" ");
		}
		System.out.println();
	}//Q2 end

	System.out.println("\nQ3------------------");
	int a=1;
	for(int i=0; i<4; i++){
		for(int j=0; j<=i; j++){
			System.out.print(a+++" ");
		}
		System.out.println();
	}//Q3 end

	System.out.println("\nQ4------------------");
	char b='A';
	for(int i=0; i<4; i++){
		for(int j=0; j<=i; j++){
			System.out.print((b++)+" ");
		}
		System.out.println();
	}//Q4 end

	System.out.println("\nQ5------------------");
	for(int i=1; i<=4; i++){
		for(int j=i; j>0; j--){
			System.out.print(j+" ");
		}
		System.out.println();
	}//Q5 end

	System.out.println("\nQ6------------------");
	for(int i=4; i>0; i--){
		for(int j=i; j>0; j--){
			System.out.print("★ ");
		}
		System.out.println();
	}//Q6 end

	System.out.println("\nQ7------------------");
	for(int i=1; i<=4; i++){
		for(int j=4-i; j>0; j--){
			System.out.print("   ");
		}
		for(int k=1; k<=i; k++){
			System.out.print("★ ");
		}
		System.out.println();
	}//Q7 end

	System.out.println("\nQ8------------------");
	int i=1;
	while(i<=4){
		for(int j=4-i; j>0; j--){
			System.out.print("   ");
		}
		for(int k=1; k<=2*i-1; k++){
			System.out.print("★ ");
		}
		System.out.println();
		i++;
	}
	i=0;
	while(i<3){
		for(int j=0; j<i+1; j++){
			System.out.print("   ");
		}
		for(int k=1; k<=5-2*i; k++){
			System.out.print("★ ");
		}
		System.out.println();
		i++;
	}//Q8 end
 
	System.out.println("\nQ8(for로 다시)------");
	for(i=1; i<=4; i++){
		for(int j=4-i; j>0; j--){
			System.out.print("   ");
		}
		for(int k=1; k<=2*i-1; k++){
			System.out.print("★ ");
		}
		System.out.println();
	}
	for(i=0; i<3; i++){
		for(int j=0; j<i+1; j++){
			System.out.print("   ");
		}
		for(int k=1; k<=5-2*i; k++){
			System.out.print("★ ");
		}
		System.out.println();
	}//Q8 end

	}//main end
}//class end