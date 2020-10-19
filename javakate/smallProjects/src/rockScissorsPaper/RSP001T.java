package rockScissorsPaper;

//2020-05-12 day05 Ex33
//선생님 1차 코딩
//	If 세번 대신 if else if else if 사용
//	Random수 만들기를 while 사용
//	Switch 대신 if else if 사용 (난 그냥 둠)
//	결과값을 최대한 반복 적게 String 사용 (난 그냥 둠)

public class RSP001T {

	public static void main(String[] args){

	int win=0;
	int lose=0;
	int same=0;
	int input=1;
	int pc=1;

	System.out.println("------------------------------------");
	System.out.println("가위바위보 게임(ver 0.0.1)");
	System.out.println("------------------------------------");

	while(input!=0){

		java.util.Scanner sc=new java.util.Scanner(System.in);

		System.out.print("1. 가위 2.바위 3.보 0.종료>>>");
		input=sc.nextInt();//내가 낼 값 입력 받기
		if(input>3){System.out.println("규칙:1,2,3 중 하나의 값만 입력하세요");}

		pc=(int)(Math.random()*10);
		while(pc>3||pc==0){
			pc=(int)(Math.random()*10);
		}

		if(input==1){
			System.out.print("당신 : 가위 ");
			switch(pc){
				case 1:	System.out.println("컴퓨터 : 가위\n비겼습니다"); same++; break;
				case 2: System.out.println("컴퓨터 : 바위\n컴퓨터가 이겼습니다"); lose++; break;
				case 3: System.out.println("컴퓨터 : 보\n당신이 이겼습니다"); win++; break;
			}//switch end

		}else if(input==2){
			System.out.print("당신 : 바위 ");
			switch(pc){
				case 2:	System.out.println("컴퓨터 : 바위\n비겼습니다"); same++; break;
				case 3: System.out.println("컴퓨터 : 보\n컴퓨터가 이겼습니다"); lose++; break;
				case 1: System.out.println("컴퓨터 : 가위\n당신이 이겼습니다"); win++; break;
			}//switch end

		}else if(input==3){
			System.out.print("당신 : 보 ");
			switch(pc){
				case 3:	System.out.println("컴퓨터 : 보\n비겼습니다"); same++; break;
				case 1: System.out.println("컴퓨터 : 가위\n컴퓨터가 이겼습니다"); lose++;break;
				case 2: System.out.println("컴퓨터 : 바위\n당신이 이겼습니다"); win++; break;
			}//switch end
		}//if end
		sc.close();
	}//while end

	System.out.println("전적: "+(win+same+lose)+"게임 중 "+win+"승 "+same+"무 "+lose+"패");
	}//main end
}//class end
