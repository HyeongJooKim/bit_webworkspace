package rockScissorsPaper;

//���� �ٽ�. �ݺ� �ִ��� ���̵���

public class RSP001M4 {
 
	public static void main(String[] args) {
		
		System.out.println("---------------------------");
		System.out.println("���������� ���� (ver 0.0.1)");
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
			System.out.print("1.���� 2.���� 3.�� 0.����>>");
			
			input=sc.nextInt();//����� ����
			if(input==0){
				break;
			}else{
				System.out.print("���:");
				if(input==1){
					System.out.print("���� ");
				}else if(input==2){
					System.out.print("���� ");
				}else if(input==3){
					System.out.print("�� ");
				}
				pc=(int)(Math.random()*3)+1;//1,2,3 ���� ���� �̱�
				System.out.print("�ĺ���:");
				if(pc==0){
					break;
				}else if(pc==1){
					System.out.println("����");
				}else if(pc==2){
					System.out.println("����");
				}else if(pc==3){
					System.out.println("��");
				}			
				
				if(input==pc){
					System.out.print("��");
					save++;
				}else if(input==1&&pc==2||input==2&&pc==3||input==3&&pc==1){
						System.out.print("��ǻ�Ͱ� ��");
						lose++;					
				}else{
						System.out.print("����� ��");
						win++;
				}
			}
			System.out.println("����ϴ�");
		}//while end
		System.out.println(cnt+"��"+win+"��"+save+"��"+lose+"��");
		sc.close();
	}//main end
}//class end
