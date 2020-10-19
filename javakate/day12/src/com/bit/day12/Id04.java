package com.bit.day12;

public class Id04 {

	public static void main(String[] args) {
		//선생님 코딩3. validation 부분만 더 개선
		
		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);
		String input=null;
		char[] ju1=new char[6];//주민번호 앞 6자리
		char[] ju2=new char[7];//주민번호 앞 7자리
		System.out.print("주민번호입력: ");
		input=sc.nextLine();
		try{//배열 길이와 다른 길이 입력된 오류 잡기
			//validation
	
			for(int i=0; i<ju1.length; i++){
				ju1[i]=(char)('0'+Integer.parseInt(""+input.charAt(i)));
			}
			if(input.charAt(6)!='-'){
				Exception err=new Exception();
				throw err;
			}
			for(int i=0; i<ju2.length; i++){
				ju2[i]=(char)('0'+Integer.parseInt(""+input.charAt(i+ju1.length+1)));
			}
		}catch(Exception e){
			System.out.println(">>입력패턴을 다시 확인하세요(000000-0000000)");
		}
	}

}
