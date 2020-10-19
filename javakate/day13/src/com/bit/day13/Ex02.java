package com.bit.day13;

public class Ex02 {

	public static void main(String[] args) {
		// StringBuffer는 Buffer의 크기로 용량 제어하는 것
		StringBuffer sb1=new StringBuffer();
		System.out.println("buffer size="+sb1.capacity());//buffer size=16 출력
		StringBuffer sb2=new StringBuffer(5);//변수값에 문자열이 아닌 int를 입력하면 초기 buffer 크기 제한하여 성능 올릴 수 있음.
		System.out.println(sb2);// buffer size=5 출력
		
		System.out.println("buffer size=" + sb2.capacity());// buffer size=5 출력
		for (int i = 0; i<9; i++) {
			sb2.append(i);
			System.out.println(sb2 + ":" + sb2.capacity());
			//원래 세팅한 사이즈보다 많은 양이 들어오면 
			//필요한 양의 2배의 배열을 자동생성(깊은복사)하도록 되어 있음. 
		}
		for (int i = 0; i<6; i++) {
			sb2.delete(sb2.length()-1,sb2.length());
			System.out.println(sb2 + ":" + sb2.capacity());
			//한번 늘어난 Buffer 의 용량은 줄어들지 않음 
		}
		sb2.trimToSize();//안쓰는 용량을 없애줌.
		System.out.println(sb2 + ":" + sb2.capacity());
		
	}
}
