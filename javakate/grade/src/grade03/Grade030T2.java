package grade03;

import java.util.ArrayList;
import java.util.Scanner;

public class Grade030T2 {
//�������ڵ� ��� 2. ArrayList�� �� �л��� �ڷ� �Է�

	public static void main(String[] args) {

		ArrayList data=new ArrayList();
		Scanner sc=new Scanner(System.in);
		String title="�л������������α׷�(Ver 0.3.0)";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����>>";
		String input=null;
		
		System.out.println(title);
		for(int i=0; i<title.length()*2; i++){
			System.out.print("-");
		}
		System.out.println();
		
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0")){
				break;
			}else if(input.equals("1")){
				System.out.println("-------------------------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|�հ�\t|���");
				System.out.println("-------------------------------------------------------");
				for(int i=0; i<data.size();i++){
					Object[] stu=(Object[])data.get(i);
					for(int j=0; j<5; j++){
						System.out.print(stu[j]);
						System.out.print("\t|");
					}
					int sum=(int)stu[2]+(int)stu[3]+(int)stu[4];
					double avg=sum*100/3/100.0;
					System.out.print(sum);
					System.out.print("\t|");
					System.out.print(avg);
					System.out.println();
				}
			}else if(input.equals("2")){
				Object[] stu=new Object[5];
				System.out.print("�й�>>");
				stu[0]=sc.nextInt();
				sc.nextLine();
				System.out.print("�̸�>>");
				stu[1]=sc.nextLine();
				System.out.print("����>>");
				stu[2]=sc.nextInt();
				System.out.print("����>>");
				stu[3]=sc.nextInt();
				System.out.print("����>>");
				stu[4]=sc.nextInt();
				data.add(stu);
				sc.nextLine();
			}else if(input.equals("3")){
				System.out.print("�й�>>");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				int idx=-1;
				for(int i=0; i<data.size();i++){
					Object[] stu=(Object[])data.get(i);
					if(num==(int)stu[0]){
						idx=i;
					}
				}
				if(idx>-1){
					Object[] stu=new Object[]{num,"-",0,0,0};
					System.out.print("�̸�>>");
					stu[1]=sc.nextLine();
					System.out.print("����>>");
					stu[2]=sc.nextInt();
					System.out.print("����>>");
					stu[3]=sc.nextInt();
					System.out.print("����>>");
					stu[4]=sc.nextInt();
					data.set(idx, stu);
					sc.nextLine();
				}else{
					System.out.println("�ش� �й��� �����ϴ�");
				}
			}else if(input.equals("4")){
				System.out.print("�й�>>");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				int idx=-1;
				for(int i=0; i<data.size();i++){
					Object[] stu=(Object[])data.get(i);
					if(num==(int)stu[0]){
						idx=i;
						break;}
				}
				if(idx>-1){
					data.remove(idx);
				}else{
					System.out.println("�ش� �й��� �����ϴ�");
				}
			}
		}//while end
		
		
		
	}

}