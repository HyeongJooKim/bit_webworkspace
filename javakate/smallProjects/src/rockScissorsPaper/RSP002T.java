package rockScissorsPaper;

//2020-05-12 day05 Ex34
//������ 2�� �ڵ�
//random�� ���ϴ� ������ ���ϱ�. 3�� ���ϸ� 0<=~<3�Ǵ� ��
//Msg���ؼ� �׾ư���. Print�� �� ����
//���� ���, �̱�� ��츦 ����, �������� ���� ���ʿ��� �� (validation�� �ʿ���)

public class RSP002T {

	public static void main(String[] args){
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("\n��������������(ver 0.0.2)");
		System.out.println("-----------------------------------\n\n");
		int input=0;
		int com=0;
		boolean boo=true;
		int win=0;
		int lose=0;
		int same=0;

		while(boo){
		System.out.print("1. ���� 2.���� 3.�� 0.����>>>");
		input=sc.nextInt()-1;//0,1,2�� �� ����
		String msg="���:";

		if(input==0){
			msg+="����";
		}else if(input==1){
			msg+="����";
		}else if(input==2){
			msg+="��";
		}

		msg+=", ��ǻ��: ";
		com=(int)(Math.random()*3);//0<=~<1���� 0<=~<3���� ����, �̷��� ���� ����...
		if(com==0){
			msg+="����";
		}else if(com==1){
			msg+="����";
		}else if(com==2){
			msg+="��";
		}

		if(input==-1){
			boo=false;
		}else{
			System.out.println(msg);

			if(input==com){
				System.out.println("�����ϴ�\n");
				same++;
			}else if((input==1&&com==2)||(input==1&&com==0)||(input==2&&com==1)){
				System.out.println("����� �̰���ϴ�\n");
				win++;
			}else{//���ų� ����� �̱��� ������ �������� ���� ���� �ʿ� ����
				System.out.println("��ǻ�Ͱ� �̰���ϴ�\n");
				lose++;
			}
		}
	}//while end	
	System.out.println("����: "+(win+same+lose)+"���� �� "+win+"�� "+same+"�� "+lose+"��");
	}//main end
}//class end
