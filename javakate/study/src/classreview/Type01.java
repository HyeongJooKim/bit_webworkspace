package classreview;

public class Type01 {
	public static void main(String[] args) {
		System.out.println("A"+1+2);// A12
		System.out.println(1+2+"A");// 3A
		System.out.println('A'+1);// 66
		System.out.println('A'-1);// 64
//		System.out.println("A"-1);// 에러남.
		
		int a=1;
		double b=a;
		System.out.println(a);// 1
		System.out.println(b);// 1.0 // 대입만으로도 double type으로 autocasting됨
		System.out.println((int)3.14);// 3 //int로 형변환
		
		System.out.println(100/3);// 33 // 정수/정수=정수답
		System.out.println(100/3.0);// 33.333333333333336 // 정수/실수=실수답
		System.out.println(100*100/3/100.0);// 33.33 // 소숫점2자리 만들기
		
		char c='A';
		System.out.println(c);// A
		c=65;
		System.out.println(c);// A // 정수인 65를 char로 autocasting함
		
		System.out.println("문자열");// 문자열
		System.out.println('문'+'자'+'열');// 149692 // char은 연산하면 정수로 자동형변환
		System.out.println((int)'문');// 47928
		System.out.println((int)'자');// 51088
		System.out.println((int)'열');// 50676
		//진수 표현
		System.out.println(10);// 10
		System.out.println(010);// 8 // 8진수 표현은 앞에 0 붙임
		System.out.println(0x10);// 16 // 16진수 표현은 앞에 0x 붙임
		
		a=100;
		System.out.println(a++);// 100 // 출력 후 더함
		System.out.println(a);// 101
		a=100;
		System.out.println(++a);// 101 // 더하고 출력
		System.out.println(a);// 101
		a--;
		System.out.println(a);// 100
		
		byte by=127;
//		by=by+1;// 오류남. 정수를 byte에 대입할 수 없다는 오류
		by++;
		System.out.println(by);// -128 // byte 최대값인 127 다음 비트인 -128로 비트계산
		by--;
		System.out.println(by+1);// 128 // byte 인 127을 정수로 자동형변환해버림
		
		
		
		
		
		
		
		
		
		
	}
}
