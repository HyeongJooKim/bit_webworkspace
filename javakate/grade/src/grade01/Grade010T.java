package grade01;

public class Grade010T {

//2020-05-22 day13 Ex09
	
	public static void main(String[] args) {
		// �������ڵ� ��� 1 int
		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);

		String title="�л������������α׷�(ver 0.1.0)";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����>>";
		int input=0;//���ڹ��
		String data="�й�\t|����\t|����\t|����\t|�հ�\t|���\n";
		data+="---------------------------------------------\n";
		
		
		System.out.println(title);
		System.out.println("------------------------------");
		int cnt=0;
		while(true){
			System.out.println(menu);
			input=sc.nextInt();
			if(input==0){break;}
			if(input==1){
				System.out.println(data);
			}
			if(input==2){
				cnt++;			
				System.out.print("����>");
				int kor=sc.nextInt();
				System.out.print("����>");
				int eng=sc.nextInt();
				System.out.print("����>");
				int math=sc.nextInt();
				int sum=kor+eng+math;
				double avg=sum/3.0;
				data+=cnt+"\t|"+kor+"\t|"+eng+"\t|"+math+"\t|"+sum+"\t|"+avg+"\n";
			}
			if(input==3){
				System.out.print("�й�>");
				int num=sc.nextInt();
				System.out.print("����>");
				int kor=sc.nextInt();
				System.out.print("����>");
				int eng=sc.nextInt();
				System.out.print("����>");
				int math=sc.nextInt();
				int sum=kor+eng+math;
				double avg=sum/3.0;
				String msgNew=num+"\t|"+kor+"\t|"+eng+"\t|"+math+"\t|"+sum+"\t|"+avg+"\n";
				int idx=data.indexOf("\n"+num);
				int idx2=data.indexOf("\n", idx+1);
				String data1=data.substring(0, idx+1);
				String data2=data.substring(idx2+1);
				data=data1+msgNew+data2;
			}
			if(input==4){
				System.out.print("�й�>");
				int num=sc.nextInt();
				int idx=data.indexOf("\n"+num);
				int idx2=data.indexOf("\n", idx+1);
				String data1=data.substring(0, idx+1);
				String data2=data.substring(idx2+1);
				data=data1+data2;
			}
		}
		System.out.println("�����մϴ�");
		sc.close();
	}

}
