package day10;

public class Ex04{

	static String msg2;//초기화 안하면 default 값은 "null" 빈칸이 아니라 null이라는 문자
	
	public static void main(String[] args){
		String msg1;
//		msg1="문자열";
//		String msg3="";
//		String msg4=new String();//원칙적으로는 이렇게 써야 맞는데
//		char [] ch={'문','자','열'};
////		String msg5=new String(ch);
////		System.out.println("msg5="+msg5);//문자열 출력
//		String msg6=new String("문자열");
//		System.out.println("msg6="+msg6);//문자열 출력
//		String msg7="문자열";
//		String msg8="문자"+"열";//class 영역에 저장됨
//		String msg9="문자";//class 영역으로 저장됨
//		String msg10=msg8+"열";//non-static 변수인 msg8과 연산하는 순간 heap 영역에 저장됨. 이런 식으로 가장 많이 제어하게 될 것. 문자열을 누적해 나가는 것. 
//		System.out.println("msg10="+msg10);//문자열 출력
////		System.out.println(msg5==msg6);//false. 새로운 객체를 생성하는 msg5, msg6은 보기엔 msg1, msg7과 같아 보이지만 새롭게 객체를 생성하며, 그 주소를 메모리에 저장된 주소가 달라 false가 됨
////		System.out.println(msg5==msg7);//false
//		System.out.println(msg6==msg7);//false  
//		System.out.println(msg6.equals(msg7));//true. 주소값이 아니라 결과 문자를 비교
//		System.out.println(msg6.indexOf("자"));//문자열 중 해당문자열의 시작 위치 찾음. 1 출력(0부터 세서 1번째 글자라는 뜻)  
//
//		String a="Hello Java";
//		System.out.println(a.replaceAll("Java","C"));//Hello C 출력. 문자열 바꾸기. 
//		// a의 값이 대체되는 것은 아님.
//		System.out.println(a.substring(0,4));//Hell 출력됨. 0번째부터 4번째 이전까지의 문자 출력
//		System.out.println(a.toUpperCase());//HELLO JAVA 출력됨. 모두 대문자로
//		System.out.println(a.toLowerCase());//hello java 출력됨. 모두 소문자로
//
//		System.out.println(msg1==msg7);//true. 클래스 영역의 문자열 영역에 미리 문자들이 저장되어 있음. 새롭게 객체를 생성하는 게 아니라 원래 있는 "문자열"의 주소를 읽어옴. 
//		System.out.println(msg8==msg7);//true. 참 잘 만든 String class다. 한글자씩 읽어오나, 묶어서 읽어오나 같은 자리에 있는 세 문자를 읽어오는 것이므로
//		System.out.println(msg10==msg7);//false
//		//결론. 그냥 글 쓰듯이 글만 써서 더하면 가장 메모리 부담 없이 쓸 수 있다.
//		byte[] by={65,66,67,68};
//		String msg11=new String(by);//by라는 배열을 통으로 받아서 msg11에 입력해줘라. 배열의 일부 값만 넣어줄 수는 없다.
//		System.out.println(msg11);//ABCD 출력
//		byte[] by2=new byte[128];
//		for(int i=0; i<by2.length; i++){
//			by2[i]=(byte)i;
//		}
//		String msg12=new String(by2);
////		System.out.println(msg12);
    }//main end
}
