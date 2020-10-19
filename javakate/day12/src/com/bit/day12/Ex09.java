package com.bit.day12;

public class Ex09 {

	public static void main(String[] args) {
		//String class
		String msg1="Java";
		String msg2="Web";
		String msg3=msg1.concat(msg2);//JavaWeb 출력 +와 같은 역할.
		String msg4="JavaWebSpring";
		String msg5=msg4.substring(4);//WebSpring 출력. (4)번째 자리 이후의 문자를 출력		
		String msg6=msg4.substring(4,7);//Web 출력. 첫수 자리 이후, 두번째 수 직전까지의 문자를 출력
		String msg7=msg4.substring(0,4);//Java 출력. 첫수 자리 이후, 두번째 수 직전까지의 문자를 출력
		String msg8=msg4.substring(4,13);//WebSpring 출력. 첫수 자리 이후, 두번째 수 직전까지의 문자를 출력		
		String msg9=msg4.substring(4,msg4.length());//WebSpring 출력. 첫수 자리 이후, 끝까지의 문자를 출력
		String msg10=msg4.replace("Web", "DB");//JavaDBSpring 출력. 찾아 바꾸기. 여러개면 모두 바꿈
		String msg11=msg4.replace("Web","");//JavaSpring 출력. ""로 바꾸니 삭제나 마찬가지.
		String msg12=msg4.replace('a', 'v');//해당 문자 찾아 모두 바꿈
		
		char ch=msg4.charAt(0);//J 출력
		int idx=msg4.indexOf('W');//W의 위치인 4 출력, 문자 또는 문자열 찾기 가능
		idx=msg4.indexOf("Web");//Web의 시작 위치인 4 출력
		idx=msg4.indexOf('a');//여러 a 중 첫 a의 위치인 1 출력
		idx=msg4.indexOf('a',2);//여러 a 중 2위치 이후의 첫 a의 위치인 3 출력
	
		String msg13=msg4.substring(0, msg4.indexOf("Web"));//Java 출력. Web 직전까지 잘라라.
		String msg14=msg4.substring(msg4.indexOf("Web")+"Web".length());//Spring 출력. Web 직후를 잘라라
		String msg15=msg13+"DB"+msg14;//replace는 최근에 생김. 예전엔 replace 대신 이렇게 활용했었음. 모두가 아닌 일부만 바꾸고 싶을 때 유용하겠지
	}//main end
}//class end
