package com.bit.day18;

import java.text.DateFormat;
//Q1.주민번호확인(한글도 지원, 한글로 영일이삼 그렇게 입력가능하게)
	//방법1.입력값을 숫자로 미리 변환
		//조건문으로 10개의 한글문자를 0~9로 변환. 쉬운데 귀찮다.
		//다른 방법: 연속성을 부여. 이방법으로 해보자.
	//방법2.Exception이 나면 그때 변환==>
//주민번호>>000000-0000000
//>>당신은 00세 남자입니다
//>>입력패턴을 다시 확인하세요(000000-00000000)

public class Ex02 {//선생님코딩-validation을 Exception처리 방법으로 처리 (해외 방식. 우리나라에서는 싫어하는 방식)

	public static void main(String[] args) {
		//선언 부분 앞으로 빼자
		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);
		String msg=null;
		char[] origin={'0','1','2','3','4','5','6','7','8','9'};
		char[] target={'영','일','이','삼','사','오','육','칠','팔','구'};
		int age=1;
		char gender='#';
		
		//validation용 반복 수행
		while(true){
			System.out.print("주민번호(000000-0000000)>>");
			msg=sc.nextLine();
//			//자리수 확인
//			if(msg.length()!=14){
//				System.out.println(">>입력패턴을 다시 확인하세요(000000-00000000)");
//				continue;
//			}
//			if(msg.charAt(6)!='-'){//위에 붙일 수도 있지만, 만약 입력이 6번보다 짧으면 Exception 발행할 것. 이 방식도 이따 해보자
//				System.out.println(">>입력패턴을 다시 확인하세요(000000-00000000)");
//				continue;
//			}
//			
//			boolean boo=false;
//			for(int i=0; i<msg.length();i++){
//				if(i==6){continue;}
//				char temp=msg.charAt(i);
//				if(!Character.isDigit(temp)){
//					System.out.println(">>입력패턴을 다시 확인하세요(000000-00000000)");
//					boo=true;
//					break;
//				}
//			}
//			if(boo){continue;}//오뷰발생시 boo=true 즉 while로 다시 돌아가라.

			int year=0;
			try{
			year=Integer.parseInt(msg.substring(0,2));//연도yy 뽑기. 계산이 안되면 오류발생. try~catch로 해경
			}catch(NumberFormatException e){//한글입력시 나오는 오류 발생시 오류해결
				String temp=msg.substring(0,2);
				char[] temp2=new char[2];
				for(int i=0; i<temp.length(); i++){
					char ch=temp.charAt(i);
					for(int j=0; j<target.length; j++){
						if(target[j]==ch){
							temp2[i]=origin[j];
						}
					}
				}
				try{
				year=Integer.parseInt(new String(temp2));//한글 아닌 문자 입력시 또 오류 발생. 다시 try~catch 이중으로
				}catch(NumberFormatException ex){//변수 이름 달라야 함
					System.out.println(">>입력패턴을 다시 확인하세요(000000-00000000)");
					continue;
				}
			}
			java.util.Date now = new java.util.Date();//동적으로 현재 연도yy 뽑기 
			DateFormat now2 = java.text.DateFormat.getInstance();//#이거 좀 공부하자
			String result = now2.format(now);
			int nowYear=Integer.parseInt(result.substring(0,2));
			gender=msg.charAt(7);
			if(gender=='1'||gender=='2'||gender=='일'||gender=='이'){
				age=(2000+nowYear)-(1900+year)+1;			
			}else{
				age=(2000+nowYear)-(2000+year)+1;		
			}
			if(gender=='1'||gender=='3'||gender=='일'||gender=='삼'){
				gender='남';//#String을 다시 지정 안하고 그냥 써도 좋네			
			}else if(gender=='2'||gender=='4'||gender=='이'||gender=='사'){
				gender='여';			
			}
			break;
		}
		System.out.println(">>당신은 "+age+"세 "+gender+"자입니다");
		sc.close();
	}//main end
}//class end