package rockScissorsPaper;

//2020-05-12 day05 Ex33

public class RSP001M1 {

	public static void main(String[] args){

	int win=0;
	int lose=0;
	int same=0;
	int input=1;
	int pc=0;
	int i=0;

	while(input!=0){

		java.util.Scanner sc
		=new java.util.Scanner(System.in);

		System.out.print("1. 가위 2.바위 3.보 0.종료>>");
		input=sc.nextInt();//내가 낼 값 입력 받기
		if(input>3){System.out.println("규칙:1,2,3 중 하나의 값만 입력하세요");}
		pc=(int)(Math.random()*10%3+1);//임의 정수 만들기

		if(input!=0){
			System.out.print("당신 :");
			switch(input){
				case 1: System.out.print("가위"); break;
				case 2: System.out.print("바위"); break;
				case 3: System.out.print("보"); break;
			}
			System.out.print("  컴퓨터 :");
			switch(pc){
				case 1: System.out.println("가위"); break;
				case 2: System.out.println("바위"); break;
				case 3: System.out.println("보"); break;
			}
		}

		if(input==1){
			switch(pc){
				case 1:	
				System.out.println("비겼습니다"); same++; break;
				case 2: System.out.println("컴퓨터가 이겼습니다"); lose++; break;
				case 3: System.out.println("당신이 이겼습니다"); win++; break;
			}//switch end
		}//if end

		if(input==2){
			switch(pc){
				case 2:	System.out.println("비겼습니다"); same++; break;
				case 3: System.out.println("컴퓨터가 이겼습니다"); lose++; break;
				case 1: System.out.println("당신이 이겼습니다"); win++; break;
			}//switch end
		}//if end

		if(input==3){
			switch(pc){
				case 3:	System.out.println("비겼습니다"); same++; break;
				case 1: System.out.println("컴퓨터가 이겼습니다"); lose++;break;
				case 2: System.out.println("당신이 이겼습니다"); win++; break;
			}//switch end
		}//if end
	i++;
	}//while end

	if(input==0){
		System.out.println("전적: "+win+"승 "+same+"무 "+lose+"패");
	}//if end


	}//main end
}//class end

