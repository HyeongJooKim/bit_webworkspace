package com.bit.day13;
// System class

public class Ex07 {
	static Ex07 ex=new Ex07();
	
	public void func01(){}

	public static void main(String[] args) {
		long begin=System.currentTimeMillis();
		long beginNano=System.nanoTime();

		System.out.println();//System: class명, out: 변수명, println은 method명
//		변수로 in, out, err 가지고 있음
		
		Ex07 me=new Ex07();
		Ex07.ex.func01();//동일한 구조로 만들어 봄
		
//		System class
//		생성자 없음. 모두 static method
		
//		System.exit(1);//즉시 JVM을 종료시킴. 강제종료라서 안전하지 않음. ()아무 숫자나 넣어도 같음.
		
		int[] origin={1,3,5,7,9};
		int[] dest=new int[5];
		
		//깊은 복사하려면 이렇게 했었지.
//		for(int i=0; i<5; i++){
//			dest[i]=origin[i];
//		}
		//더 쉽게 배열의 깊은복사하기
		System.arraycopy(origin, 0, dest, 0, 5);//배열복사방법 중 성능이 좋다. 즉, 빠르다.
		//origin이라는 배열의 0번부터 복사해서 dest의 0번부터 5개를 입력하라.
		
		for(int i=0; i<5; i++){
			System.out.println(dest[i]);
		}
		
//		String msg="";
//		for(int i=0; i<100000; i++){
//		msg+=i;
//		}
//				
		System.out.println(System.currentTimeMillis());
		//천분의1초로 반환. midnight, January 1, 1970 UTC.부터 지금까지.
		//전산에 기준으로 70년 많음. 90년도 좀 있다.
		//뭐에 쓰나? 현 운영체제의 시간을 반환
		long end=System.currentTimeMillis();
		long endNano=System.nanoTime();
		System.out.println("main 수행시간="+(end-begin)/1000+"s");
		//시스템 성능테스트할 때 사용해보자.
		System.out.println("main 수행시간="+(endNano-beginNano)+"ns");
		
	}
}
