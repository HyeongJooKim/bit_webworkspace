package grade03;

import java.util.ArrayList;
import java.util.Scanner;

public class Grade030T1 {
//�������ڵ� ��� 1. ArrayList �� Ȱ��
//�׳� �ϳ��� �迭�� �����͸� �� ��� �ִ� ����̳�. 1�� �迭
//�Ǳ� �ϳ� ���� �ŷ������� �ʳ�. ���� ������ ����̶� �ϳ�
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
				System.out.println("-----------------------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|�հ�\t|���");
				System.out.println("-----------------------------------------------------");
				for(int i=0; i<data.size();i++){
					int num=(int)data.get(i++);
					String name=(String)data.get(i++);
					int kor=(int)data.get(i++);
					int eng=(int)data.get(i++);
					int math=(int)data.get(i);
					int sum=kor+eng+math;
					double avg=(kor+eng+math)*100/3/100.0;
//					System.out.print(data.get(i++)+"\t");//�̷��Ը� �ص� ����� �ǳ�. ���� ���غ� ���
//					System.out.print(data.get(i++)+"\t");
//					System.out.print(data.get(i++)+"\t");
//					System.out.print(data.get(i++)+"\t");
//					System.out.print(data.get(i)+"\n");
					System.out.println(num+"\t|"+name+"\t|"+kor+"\t|"+eng+"\t|"+math+"\t|"+sum+"\t|"+avg);
				}
			}else if(input.equals("2")){
				System.out.print("�й�>>");
				input=sc.nextLine();
				data.add(Integer.parseInt(input));
				System.out.print("�̸�>>");
				input=sc.nextLine();
				data.add(input);
				System.out.print("����>>");
				input=sc.nextLine();
				data.add(Integer.parseInt(input));
				System.out.print("����>>");
				input=sc.nextLine();
				data.add(Integer.parseInt(input));
				System.out.print("����>>");
				input=sc.nextLine();
				data.add(Integer.parseInt(input));
			}else if(input.equals("3")){
				System.out.print("�й�>>");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				//�й������� ã�ƾ� ��. 0,5,10,,,5������ �ڸ������� �˻�
				int idx=-1;
				for(int i=0; i<data.size();i+=5){
					if(num==(int)data.get(i)){
						idx=i;
						break;}
				}
				if(idx>-1){
					idx++;
					System.out.print("�̸�>>");
					input=sc.nextLine();
					data.set(idx++,input);
					System.out.print("����>>");
					input=sc.nextLine();
					data.set(idx++, Integer.parseInt(input));
					System.out.print("����>>");
					input=sc.nextLine();
					data.set(idx++, Integer.parseInt(input));
					System.out.print("����>>");
					input=sc.nextLine();
					data.set(idx, Integer.parseInt(input));
				}	
			}else if(input.equals("4")){
				System.out.print("�й�>>");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				//�й������� ã�ƾ� ��. 0,5,10,,,5������ �ڸ������� �˻�
				int idx=-1;
				for(int i=0; i<data.size();i+=5){
					if(num==(int)data.get(i)){
						idx=i;
						break;}
				}
				if(idx>-1){
					for(int i=0; i<5; i++){
						data.remove(idx);//�����ϸ� ���� ��ȣ ������Ƿ� ���� �ڸ��� ��� ����� ��
					}				
				}
			}
		}//while end
	}
}
