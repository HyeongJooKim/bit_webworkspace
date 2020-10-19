package com.bit.day12;

public class Id02 {

	public static void main(String[] args) {
        // 주민번호입력: 090206-3124567
        // >>당신은 00세 남자입니다
        // 주민번호입력: 990206-2124567
        // >>당신은 00세 여자입니다
        // 주민번호입력: 9902062124567
        // >>입력패턴을 다시 확인하세요(00000-00000000)
        // 주민번호입력: 99020602124567
        // >>입력패턴을 다시 확인하세요(000000-0000000)
        // 주민번호입력: 990206-212456
        // >>주민번호 자리수를 다시 확인하세요(000000-0000000)

		//선생님 코딩1. 어제까지 배운 내용으로
		
		@SuppressWarnings("resource")
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String msg=null;

		while(true){
			System.out.print("주민번호입력: ");
			msg=sc.nextLine();
			
			//입력 후 계산 전 validation해야 함
			if(msg.length()!=14){
                System.out.println(">>주민번호 자리수를 다시 확인하세요(000000-0000000)");
                continue;//반복문을 빠져나감. 즉, 가장 가까운 while, if로 돌아감.
			}
			
			if(msg.charAt(6)!='-'){
                System.out.println(">>입력패턴을 다시 확인하세요(000000-0000000)");
                continue;
			}
			boolean suCheck=false;
			for(int i=0; i<msg.length(); i++){
				if(i==6){continue;}
				if(!(msg.charAt(i)>='0'&&msg.charAt(i)<='9')){
					suCheck=true;
				}
			}
			if(suCheck){continue;}//정수가 아니면 while로 돌아가라
			
			char year1=msg.charAt(0);//** String에서 몇번째 문자 뽑아내기
			char year2=msg.charAt(1);
			int yy=(year1-'0')*10+(year2-'0')*1;
			//** 문자번호는 모르지만 '0'에 해당하는 번호를 빼서 그 차이만큼을 해당정수로 불러옴 
			int age=0;
					
			char gender=msg.charAt(7);
			
			if(gender=='1'||gender=='2'){
				age=120-yy+1;
			}else if(gender=='3'||gender=='4'){
				age=20-yy+1;
			}	
	        System.out.print("당신은 "+age+"세 ");
	        		
			if(gender=='1'||gender=='3'){
				System.out.print("남자입니다");
			}else if(gender=='2'||gender=='4'){
				System.out.print("여자입니다");
			}
			break;
		}//while end
	}//main end
}//class end
