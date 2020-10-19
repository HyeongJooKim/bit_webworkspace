package rockScissorsPaper;

//복습 다시. 반복 최대한 줄이도록

public class RSP001M4 {
 
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
		
		while(true){
			cnt++;
			System.out.print("1.가위 2.바위 3.보 0.종료>>");
			
			input=sc.nextInt();//사용자 선택
			if(input==0){
				break;
			}else{
				System.out.print("당신:");
				if(input==1){
					System.out.print("가위 ");
				}else if(input==2){
					System.out.print("바위 ");
				}else if(input==3){
					System.out.print("보 ");
				}
				pc=(int)(Math.random()*3)+1;//1,2,3 랜덤 정수 뽑기
				System.out.print("컴뷰터:");
				if(pc==0){
					break;
				}else if(pc==1){
					System.out.println("가위");
				}else if(pc==2){
					System.out.println("바위");
				}else if(pc==3){
					System.out.println("보");
				}			
				
				if(input==pc){
					System.out.print("비");
					save++;
				}else if(input==1&&pc==2||input==2&&pc==3||input==3&&pc==1){
						System.out.print("컴퓨터가 이");
						lose++;					
				}else{
						System.out.print("당신이 이");
						win++;
				}
			}
			System.out.println("겼습니다");
		}//while end
		System.out.println(cnt+"판"+win+"승"+save+"무"+lose+"패");
		sc.close();
	}//main end
}//class end
