package rockScissorsPaper;

//2020-05-12 day05 Ex33
//���ϴ� ��ŭ ���� �����ϰ� 0 ������ ����, 1,2,3 �̿��� ���� �������� ������


public class RSP001M2 {

	public static void main(String[] args){

	int win=0;
	int lose=0;
	int same=0;
	int input=1;
	int pc=0;
	int i=0;

	System.out.println("���������� ����(ver 0.0.1)");
	System.out.println("------------------------------------");
	System.out.println("1(����) 2(����) 3(��)�� �����ϼ���");
	System.out.println("------------------------------------");

	while(input!=0){

		java.util.Scanner sc
		=new java.util.Scanner(System.in);

		System.out.print("1. ���� 2.���� 3.�� 0.����>>");
		input=sc.nextInt();//���� �� �� �Է� �ޱ�
		if(input>3){System.out.println("��Ģ:1,2,3 �� �ϳ��� ���� �Է��ϼ���");}
		pc=(int)(Math.random()*10%3+1);//���� ���� �����

		if(input==1){
			System.out.print("��� : ���� ");
			switch(pc){
				case 1:	System.out.println("��ǻ�� : ����\n�����ϴ�"); same++; break;
				case 2: System.out.println("��ǻ�� : ����\n��ǻ�Ͱ� �̰���ϴ�"); lose++; break;
				case 3: System.out.println("��ǻ�� : ��\n����� �̰���ϴ�"); win++; break;
			}//switch end
		}//if end

		if(input==2){
			System.out.print("��� : ���� ");
			switch(pc){
				case 2:	System.out.println("��ǻ�� : ����\n�����ϴ�"); same++; break;
				case 3: System.out.println("��ǻ�� : ��\n��ǻ�Ͱ� �̰���ϴ�"); lose++; break;
				case 1: System.out.println("��ǻ�� : ����\n����� �̰���ϴ�"); win++; break;
			}//switch end
		}//if end

		if(input==3){
			System.out.print("��� : �� ");
			switch(pc){
				case 3:	System.out.println("��ǻ�� : ��\n�����ϴ�"); same++; break;
				case 1: System.out.println("��ǻ�� : ����\n��ǻ�Ͱ� �̰���ϴ�"); lose++;break;
				case 2: System.out.println("��ǻ�� : ����\n����� �̰���ϴ�"); win++; break;
			}//switch end
		}//if end
	i++;
	}//while end

	if(input==0){
		System.out.println("����: "+win+"�� "+same+"�� "+lose+"��");
	}//if end


	}//main end
}//class end

