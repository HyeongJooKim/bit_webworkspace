package day08;

class Ex05{

	static int a=10;

	public static void main(String[] arg) {
		
		int a=1234;

//		Ex05 me1=new Ex05();
//		Ex05 me2=new Ex05();
		System.out.println("me1 a="+Ex05.a);//Ex05 class 에서 지정된 a인 저 위의 10을 출력.사실 Ex05 앞의 bin.도생략된 셈. 생략된 것은 자기 자신이라고 해석하는 셈
		System.out.println("me2 a="+a);//가장 가까운 곳의 1234를 출력
//		me1.a++;
		Ex05.a++;//참조변수 생성 안하고 이렇게 써도 되네
		System.out.println("me1만 하나 더함");
		System.out.println("me1 a="+Ex05.a);
		System.out.println("me2 a="+a);
		a=a+100;
		System.out.println("me1만 하나 더함");
		System.out.println("me1 a="+Ex05.a);
		System.out.println("me2 a="+a);
	}
}