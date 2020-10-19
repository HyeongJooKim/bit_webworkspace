package rockScissorsPaper;

//복습하며 다시 쳐본 코딩

public class RSP001M3 {

	public static void main(String[] args) {
	
		System.out.println("---------------------------");
		System.out.println("가위바위보 게임 (ver 0.0.1)");
		System.out.println("---------------------------");
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int input=1;
		int pc=0;
		int win=0;
		int lose=0;
		int save=0;
		int cnt=0;
		
		while(input!=0){//사용자가 0.종료 하지 않으면
			System.out.print("1.가위 2.바위 3.보 0.종료>>");
			input=sc.nextInt();//사용자 인풋
			if(input==0){break;}
			pc=(int)(Math.random()*3)+1;//1,2,3 랜덤 정수 뽑기
			cnt++;
			if(input==pc){//비긴 경우
				switch(input){
				case 1: System.out.print("당신: 가위 컴퓨터: 가위"); break;
				case 2: System.out.print("당신: 바위 컴퓨터: 바위"); break;
				case 3: System.out.print("당신: 보 컴퓨터: 보"); break;
				}
				System.out.println("비겼습니다");
				save++;
			}else if(input==1){//나 가위
				if(pc==2){//컴 바위 
					System.out.print("당신: 가위 컴퓨터: 바위");
					System.out.println("컴퓨터가 이겼습니다");
					lose++;
				}else{//컴 3보
					System.out.print("당신: 가위 컴퓨터: 보");
					System.out.println("당신이 이겼습니다");
					win++;
				}
			}else if(input==2){//나 바위
				if(pc==3){//컴 보 
					System.out.print("당신: 바위 컴퓨터: 보");
					System.out.println("컴퓨터가 이겼습니다");
					lose++;
				}else{//컴 1가위
					System.out.print("당신: 바위 컴퓨터: 가위");
					System.out.println("당신이 이겼습니다");
					win++;
				}
			}else if(input==3){//나 보
				if(pc==1){//컴 가위 
					System.out.print("당신: 보 컴퓨터: 가위");
					System.out.println("컴퓨터가 이겼습니다");
					lose++;
				}else{//컴 2바위
					System.out.print("당신: 보 컴퓨터: 바위");
					System.out.println("당신이 이겼습니다");
					win++;
				}
			}else{
				System.out.println("사용방법을 확인해주세요");
			}
		}//while end
		
		System.out.println("총"+cnt+"판중 "+win+"승"+save+"무"+lose+"패");
		
	}//main end
}//class end