package jump2java;

public class Euler1T {

	int max;
	
	public Euler1T(int max){
		this.max=max;
	}
	
	public int sumOf3And5(){
		int sum=0;
		for(int i=0; i<max; i++){
			if(i%3==0 || i%5==0){
				sum+=i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(new Euler1T(10).sumOf3And5());
		System.out.println(new Euler1T(1000).sumOf3And5());
	}

}
