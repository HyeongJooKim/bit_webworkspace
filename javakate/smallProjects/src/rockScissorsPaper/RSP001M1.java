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

		System.out.print("1. ���� 2.���� 3.�� 0.����>>");
		input=sc.nextInt();//���� �� �� �Է� �ޱ�
		if(input>3){System.out.println("��Ģ:1,2,3 �� �ϳ��� ���� �Է��ϼ���");}
		pc=(int)(Math.random()*10%3+1);//���� ���� �����

		if(input!=0){
			System.out.print("��� :");
			switch(input){
				case 1: System.out.print("����"); break;
				case 2: System.out.print("����"); break;
				case 3: System.out.print("��"); break;
			}
			System.out.print("  ��ǻ�� :");
			switch(pc){
				case 1: System.out.println("����"); break;
				case 2: System.out.println("����"); break;
				case 3: System.out.println("��"); break;
			}
		}

		if(input==1){
			switch(pc){
				case 1:	
				System.out.println("�����ϴ�"); same++; break;
				case 2: System.out.println("��ǻ�Ͱ� �̰���ϴ�"); lose++; break;
				case 3: System.out.println("����� �̰���ϴ�"); win++; break;
			}//switch end
		}//if end

		if(input==2){
			switch(pc){
				case 2:	System.out.println("�����ϴ�"); same++; break;
				case 3: System.out.println("��ǻ�Ͱ� �̰���ϴ�"); lose++; break;
				case 1: System.out.println("����� �̰���ϴ�"); win++; break;
			}//switch end
		}//if end

		if(input==3){
			switch(pc){
				case 3:	System.out.println("�����ϴ�"); same++; break;
				case 1: System.out.println("��ǻ�Ͱ� �̰���ϴ�"); lose++;break;
				case 2: System.out.println("����� �̰���ϴ�"); win++; break;
			}//switch end
		}//if end
	i++;
	}//while end

	if(input==0){
		System.out.println("����: "+win+"�� "+same+"�� "+lose+"��");
	}//if end


	}//main end
}//class end

