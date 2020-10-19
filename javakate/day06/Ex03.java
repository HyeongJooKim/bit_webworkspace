package day06;

class Ex03{

	public static void func02(){
		int a=2222;
		System.out.println("a="+a);
	}

	public static void func03(int a){
		a=3333;
		func02();
		System.out.println("전달받은 데이터:="+a);
	}


	public static void main(String[] args){
		int a=1111;
		System.out.println("프로그램시작"+a);

		func03(a);

		System.out.println("프로그램종료"+a);

	}//main end
}//class end