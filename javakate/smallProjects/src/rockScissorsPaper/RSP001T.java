package rockScissorsPaper;

//2020-05-12 day05 Ex33
//������ 1�� �ڵ�
//	If ���� ��� if else if else if ���
//	Random�� ����⸦ while ���
//	Switch ��� if else if ��� (�� �׳� ��)
//	������� �ִ��� �ݺ� ���� String ��� (�� �׳� ��)

public class RSP001T {

	public static void main(String[] args){

	int win=0;
	int lose=0;
	int same=0;
	int input=1;
	int pc=1;

	System.out.println("------------------------------------");
	System.out.println("���������� ����(ver 0.0.1)");
	System.out.println("------------------------------------");

	while(input!=0){

		java.util.Scanner sc=new java.util.Scanner(System.in);

		System.out.print("1. ���� 2.���� 3.�� 0.����>>>");
		input=sc.nextInt();//���� �� �� �Է� �ޱ�
		if(input>3){System.out.println("��Ģ:1,2,3 �� �ϳ��� ���� �Է��ϼ���");}

		pc=(int)(Math.random()*10);
		while(pc>3||pc==0){
			pc=(int)(Math.random()*10);
		}

		if(input==1){
			System.out.print("��� : ���� ");
			switch(pc){
				case 1:	System.out.println("��ǻ�� : ����\n�����ϴ�"); same++; break;
				case 2: System.out.println("��ǻ�� : ����\n��ǻ�Ͱ� �̰���ϴ�"); lose++; break;
				case 3: System.out.println("��ǻ�� : ��\n����� �̰���ϴ�"); win++; break;
			}//switch end

		}else if(input==2){
			System.out.print("��� : ���� ");
			switch(pc){
				case 2:	System.out.println("��ǻ�� : ����\n�����ϴ�"); same++; break;
				case 3: System.out.println("��ǻ�� : ��\n��ǻ�Ͱ� �̰���ϴ�"); lose++; break;
				case 1: System.out.println("��ǻ�� : ����\n����� �̰���ϴ�"); win++; break;
			}//switch end

		}else if(input==3){
			System.out.print("��� : �� ");
			switch(pc){
				case 3:	System.out.println("��ǻ�� : ��\n�����ϴ�"); same++; break;
				case 1: System.out.println("��ǻ�� : ����\n��ǻ�Ͱ� �̰���ϴ�"); lose++;break;
				case 2: System.out.println("��ǻ�� : ����\n����� �̰���ϴ�"); win++; break;
			}//switch end
		}//if end
		sc.close();
	}//while end

	System.out.println("����: "+(win+same+lose)+"���� �� "+win+"�� "+same+"�� "+lose+"��");
	}//main end
}//class end
