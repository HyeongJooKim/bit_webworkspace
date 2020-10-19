package day06;

class Ex06{
	public static void main(String[] args){

		func01(1,2);
		func01("문자열");

	}//main end

	public static int func01(int a, int b){
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
		return c;
	}//func01 end

	public static void func01(String msg){
		System.out.println(msg);
	}//func01 end

}//class end