package day08;

public class Ex02{

	public static int su1=123;
	/*static변수: main밖에 있는 독립적인 변수
	그러나 이걸 선언;초기화;두 줄로 나누면 안됨. 왜? 다른 곳에서 참조할 때 선언 줄로 먼저안 가고 초기화 줄을 바로 호출하므로 오류남.
	그러나 차라리 초기화를 안하는 것은 ok, 그럼 기본값인 0으로 받는다.
	*/
	static String msg;//기본값은 null
	//static String msg="null"; 초기화 안하면 이렇게 쓴것이나 마친가지

	public static void main(String[] arg) {

		Ex02 me=new Ex02();
		me.func02();
		System.out.println(msg);//null 값을 표시하는것같지만 "null"이라는 문자열을 인쇄함

	}

	public static void func01(){
		System.out.println("D008.Ex02.func01(static): "+su1);
	}

	public void func02(){
		System.out.println("D008.Ex02.func02(non-static): "+su1);
	}


}