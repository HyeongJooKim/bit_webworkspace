package com.bit.day12;

public class Id03 {

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

		//선생님 코딩2. 배열 활용해서

		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);
		String input=null;
		char gender='여';
		int age=0;
		boolean boo=false;
		do{
			System.out.print("주민번호입력: ");
			input=sc.nextLine();
			char[] arr=input.toCharArray();
			
			if(arr.length==14&&arr[6]=='-'){
				boolean temp=true;
				for(int i=0; i<arr.length; i++){
					if(i==6){continue;}
					if(arr[i]<'0'||arr[i]>'9'){temp=false;break;}	
				}
				if(temp){boo=true;
				}
			}
			
			if(boo){
				char[] arr2=new char[2];
				for(int i=0; i<arr2.length; i++){
					arr2[i]=arr[i];
				}
		
				String year1=new String(arr2);//**char배열을 생성자에 넣으면 문자열로 변환
				
				if(arr[7]=='1'||arr[7]=='2'){
					year1=19+year1;
				}else if(arr[7]=='3'||arr[7]=='4'){
					year1=20+year1;
				}
				age+=2020-Integer.parseInt(year1);
				if(arr[7]=='1'||arr[7]=='3'){gender='남';}
		        System.out.print("당신은 "+age+"세 "+gender+"자입니다");
			}else{
				System.out.println(">>입력패턴을 다시 확인하세요(000000-0000000)");
			}
		}while(!boo);
	}
}
