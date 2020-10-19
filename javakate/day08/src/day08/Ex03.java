package day08;

class Ex03{

	static int a;

	public static void main(String[] arg) {
		a=10;
		func01();
		func02();
	}

	public static void func01(){
		System.out.println("D008.Ex03.func01(static): a="+a);
	}

	public static void func02(){
		int b=a;
		System.out.println("D008.Ex03.func02(static): b="+b);
	}


}