package grade01;

//2020-05-22 day13 Ex11

public class Grade011T {

	public static void main(String[] args) {
		// �������ڵ� ��� 2 �迭

		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);

		String title="�л������������α׷�(ver 0.1.1)";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����>>";
		System.out.println("���ο�");
		int su=sc.nextInt();
		
		int[][] data=null;
		data=new int[su][];//�뷫 ���� �˳���
		
		System.out.println(title);
		System.out.println("------------------------------");
		int input=0;
		int idx=0;
		int cnt=0;//�й�
		while(true){
			System.out.println(menu);
			input=sc.nextInt();
			if(input==0){break;}
			if(input==2&&su>cnt){
				int[] stu=new int[4];
				data[idx++]=stu;
				cnt++;
				stu[0]=cnt;
				System.out.print("����>");
				stu[1]=sc.nextInt();
				System.out.print("����>");
				stu[2]=sc.nextInt();
				System.out.print("����>");
				stu[3]=sc.nextInt();
			}				
			if(input==1){
				System.out.println("�й�\t|����\t|����\t|����\t|�հ�\t|���");
				System.out.println("---------------------------------------------");
				for(int i=0; i<data.length; i++){
					int[] stu=data[i];
					if(stu==null){continue;}
					System.out.print(stu[0]+"\t|");
					System.out.print(stu[1]+"\t|");
					System.out.print(stu[2]+"\t|");
					System.out.print(stu[3]+"\t|");
					System.out.print(stu[1]+stu[2]+stu[3]+"\t|");
					System.out.println((stu[1]+stu[2]+stu[3])*100/3/100.0);
				}
			}
			if(input==4){
				int tmp=-1;
				System.out.print("�й�>");
				int num=sc.nextInt();
				for(int i=0; i<data.length; i++){
					int[] stu=data[i];
					if(stu==null){continue;}
					if(stu[0]==num){tmp=i;}
				}
				if(tmp!=-1){data[tmp]=null;}
			}
			if(input==3){
				int tmp=-1;
				int[] stu=new int[4];
				System.out.print("�й�>");
				int num=sc.nextInt();
				for(int i=0; i<data.length; i++){
					int[] stu2=data[i];
					if(stu2==null){continue;}
					if(stu2[0]==num){tmp=i;}
				}
				if(tmp!=-1){data[tmp]=stu;}
				stu[0]=num;
				System.out.print("����>");
				stu[1]=sc.nextInt();
				System.out.print("����>");
				stu[2]=sc.nextInt();
				System.out.print("����>");
				stu[3]=sc.nextInt();
			}				
		}//while end
		System.out.println("�����մϴ�");
		sc.close();
	}//main end
}//class end
