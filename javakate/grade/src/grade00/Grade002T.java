package grade00;

//2020-05-11 day04 Ex24

public class Grade002T {
	public static void main(String[] args){

		java.util.Scanner sc
		=new java.util.Scanner(System.in);

		int kor;
		int eng;
		int math;
		System.out.print("����>");
		kor=sc.nextInt();
		System.out.print("����>");
		eng=sc.nextInt();
		System.out.print("����>");
		math=sc.nextInt();

		String msg="";
		msg+="�������� ���α׷�(ver 0.0.2)";//msg+= ����msg�� �����ִ� ����. �� ���� print ���ִ� ���
		msg+="\n____________________________";
		msg+="\n���� "+kor;
		msg+="\n���� "+eng;
		msg+="\n���� "+math;
		msg+="\n____________________________";
		int sum=kor+eng+math;
		msg+="\n�հ� "+sum;
		msg+="\n____________________________";
		double avg=sum*100/3/100.0;
		msg+="\n��� "+avg;
		msg+="\n____________________________";

		char grade='F'; //70
		int temp=sum/3/10;//���ڸ��� ���ϱ�
		switch(temp){
			case 10: 
			case 9: grade-=1;//90������ ��� �Ʒ� 4�� ��� �����ϹǷ� 5�� �� (F(70)>A(65) 5����)
			case 8: grade-=1;
			case 7: grade-=1;
			case 6: grade-=2;//60������ ��� �� ��� �н��ϰ� F(70)-2�� �ϸ� D
			default:
		}
		msg+="\n���� "+grade+"����";
		System.out.println(msg);
		
		sc.close();
	}
}
