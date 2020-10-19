package com.bit.day13;

public class Ex01 {

	public static void main(String[] args) {
		// String 관련 class들
		String msg1 = new String("JavaFramework");

		StringBuffer sb1 = new StringBuffer("JavaFramework");// String 입력할 수 있다. 변수도 당연 가능
		// StringBuffer sb2="";//이렇게 쓸 수는 없다. 왜? 대입한 값은 String이므로 type 안맞으므로

		StringBuilder sb2 = new StringBuilder(sb1);// String 입력할 수 있다. 변수도 당연 가능
		StringBuffer sb4 = new StringBuffer(10);// int 입력가능. 그러나 출력값은 없네. 왜???

		System.out.println(sb2.length());//13출력
		System.out.println(sb4.length());//0출력
		//CRUD Create, Read, Update, Delete 문자열의 중요한 4가지 기능. 삽입, 읽기, 업뎃, 삭제 헤보자
		StringBuffer sb5=new StringBuffer("Java");
		StringBuffer sb6=new StringBuffer("WebFramework");
//		StringBuffer sb7=sb5+sb6;//String처럼은 더하기 안됨.
		String msg2="sb7="+sb6;//sb7=Web 출력. 문자열과 더하는 순간 문자열이 됨
//		StringBuffer sb7=sb5.concat(sb6);//이것도 안됨.
		StringBuffer sb7=sb5.append(sb6);//JavaWebFramework 출력
		System.out.println(sb5);//JavaWebFramework 출력. 
		System.out.println(sb6);//WebFramework 출력
		System.out.println(sb7);//JavaWebFramework 출력
		//sb5에 sb6을 붙인 순간 sb5값이 sb6이 더해진 값으로 업데이트됨. 그 이전 sb5값은 없어짐. 
		//즉. sb5=sb5.append(sb6); 인셈 그래서 앞부분 생략하고 sb5.append(sb6); 이렇게만 쓴다. 
		//문자열만큼 잘 안쓰는 편. 메모리 부담 큼. 문자열의 값을 많이 바꾸거나 할 일이 있는 땐 유용함. 
		//객체를 덜 찍어내므로 메모리 적게 씀
		sb5.delete(4,7);//Java 출력. 삭제하는 것.
		System.out.println(sb5);//Java 출력.
		sb5.insert(4, "DB");//4번 위치에 문자열 삽입하라. 중간 삽입 가능
		System.out.println(sb5);//JavaDBFramework 출력.
		sb5.replace(4,6,"DataBase");
		System.out.println(sb5);//JavaDataBaseFramework 출력.
		//어찌 이렇게 돌아갈까? 문자열은 배열인 셈이고 참조변수 값을 제어해서 문자열을 제어하는 셈. 
		//크기 좀 여유있는 배열을 먼저 만들어놓고 값 넣는 것이라 하나의 메모리는 큰 것. 
	}
}
