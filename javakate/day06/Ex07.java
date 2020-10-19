package day06;

class Ex07{
	public static void main(String[] args){
		func01(3.14);
		func01(1234);//나쁜 예. 정수가 실수로 autocasting되어 원하는 정수값이 아닌 실수값이 출력
		func01('A');//나쁜 예. 문자가 실수로 autocasting되어 원하는 정수값이 아닌 실수값이 출력

	}//main end

	public static void func01(double w){

		System.out.println("param :"+w);

	}//func1 end

}//class end