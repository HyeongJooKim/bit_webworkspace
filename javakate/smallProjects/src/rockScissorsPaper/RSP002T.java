package rockScissorsPaper;

//2020-05-12 day05 Ex34
//선생님 2차 코딩
//random에 원하는 범위를 곱하기. 3을 곱하면 0<=~<3되는 것
//Msg더해서 쌓아가기. Print는 한 번에
//같은 경우, 이기는 경우를 빼니, 나머지는 조건 불필요한 거 (validation은 필요함)

public class RSP002T {

	public static void main(String[] args){
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("\n가위바위보게임(ver 0.0.2)");
		System.out.println("-----------------------------------\n\n");
		int input=0;
		int com=0;
		boolean boo=true;
		int win=0;
		int lose=0;
		int same=0;

		while(boo){
		System.out.print("1. 가위 2.바위 3.보 0.종료>>>");
		input=sc.nextInt()-1;//0,1,2로 값 통일
		String msg="당신:";

		if(input==0){
			msg+="가위";
		}else if(input==1){
			msg+="바위";
		}else if(input==2){
			msg+="보";
		}

		msg+=", 컴퓨터: ";
		com=(int)(Math.random()*3);//0<=~<1값을 0<=~<3으로 변경, 이렇게 쉬울 수가...
		if(com==0){
			msg+="가위";
		}else if(com==1){
			msg+="바위";
		}else if(com==2){
			msg+="보";
		}

		if(input==-1){
			boo=false;
		}else{
			System.out.println(msg);

			if(input==com){
				System.out.println("비겼습니다\n");
				same++;
			}else if((input==1&&com==2)||(input==1&&com==0)||(input==2&&com==1)){
				System.out.println("당신이 이겼습니다\n");
				win++;
			}else{//비기거나 당신이 이기지 않으면 나머지는 조건 써줄 필요 없지
				System.out.println("컴퓨터가 이겼습니다\n");
				lose++;
			}
		}
	}//while end	
	System.out.println("전적: "+(win+same+lose)+"게임 중 "+win+"승 "+same+"무 "+lose+"패");
	}//main end
}//class end
