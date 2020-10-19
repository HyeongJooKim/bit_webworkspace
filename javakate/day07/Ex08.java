package day07;

class Ex08{

	public static void main(String[] args){
		System.out.println("main start");
		for(int i=0; i<10; i++){
			if(i%2!=0){continue;}
			System.out.println("짝수"+i);
		}
		System.out.println("main end");
	}//main end
}//class end