package com.bit.day15;
//Q1.주민번호확인(한글도 지원, 한글로 영일이삼 그렇게 입력가능하게)
//주민번호>>000000-0000000
//>>당신은 00세 남자입니다
//>>입력패턴을 다시 확인하세요(000000-00000000)
public class Id05 {//내코딩

	public static void main(String[] args) {

		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		char[] id=null;
		boolean pass=false;//초기값은 false로 주고 test 합격하면 true로 바꿔주기 
		boolean test=false;//수들의 test 결과 초기값은 false로 주고 test 합격하면 true로 바꿔주기 
		int age=0;
		String gen="";
		//합격이면 다 pass하고 마지막에 부적을 몰아서 처리하자
		do{
			System.out.print("주민번호(000000-0000000)>>");
			input=sc.nextLine();
			id=input.toCharArray();// 하나의 주민번호를 받을 수 있는 배열. 새번호 받으면 새로 리셋해야
			if(id.length==14&&id[6]=='-'){//입력 길이와, 6자리가 -맞으면 통과 
				//나머지 자리들이 숫자인지도 확인, 숫자면 통과 둘 다 맞으면 통과해서 test=true로 바꿔줌.
				for(int i=0; i<id.length; i++){
					if(i==6){continue;}
					if(id[i]>='0'&&id[i]<='9'){
						test=true; continue; //숫자인 경우 여기로 와서 합격
					}else{
						switch(id[i]){//숫자 아닌 경우 여기로 와서 한글값을 숫자로 대입하고 test=true
							case '일': id[i]='1'; test=true; break;
							case '이': id[i]='2'; test=true; break;
							case '삼': id[i]='3'; test=true; break;
							case '사': id[i]='4'; test=true; break;
							case '오': id[i]='5'; test=true; break;
							case '육': case '륙': id[i]='6'; test=true; break;
							case '칠': id[i]='7'; test=true; break;
							case '팔': id[i]='8'; test=true; break;
							case '구': id[i]='9'; test=true; break;
							case '영': case '공': id[i]='0'; break;
							default: test=false;//case에 없는 입력값이 들어오면 fail
						}//switch end
					}//else end
				}//for end
			}//if end
			if(test){//test=true인 경우만 계산하고 결과 출력
				if(id[7]=='1'||id[7]=='2'){
					age=2020-Integer.parseInt("19"+id[0]+id[1]);
				}else if(id[7]=='3'||id[7]=='4'){
					age=2020-Integer.parseInt("20"+id[0]+id[1]);
				}
				if(id[7]=='1'||id[7]=='3'){
					gen="남";
				}else if(id[7]=='2'||id[7]=='4'){
					gen="여";
				}
				System.out.println(">>당신은 "+age+"세 "+gen+"자입니다");
				pass=true;
			}else{//불합격이면 오류메시지 나오고 처음으로 돌아가기
				System.out.println(">>입력패턴을 다시 확인하세요(000000-00000000)");
			}
		}while(!pass);//pass=fail;이면 돌아가라. !pass=true일 떄
		sc.close();
	}//main end
}//class end