package grade03;

import java.util.ArrayList;
import java.util.Scanner;

public class Grade030T3 {
//�������ڵ� ��� 3. ��ü, ArrayList Ȱ��
	//���� ���� ������ ���

	private static class Student{//������ ���Ŵ� inner class�� �̵�
		int num;
		String name;
		int kor, eng, math;
		
		int tot(){
			return kor+eng+math;
		}
		
		double avg(){
			return tot()*100/3/100.0;
		}
		
	}//Student end

	public static void main(String[] args) {

		ArrayList<Student> data=new ArrayList<Student>();
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
			}else if(input.equals("1")){//����
				System.out.println("-----------------------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|�հ�\t|���");
				System.out.println("-----------------------------------------------------");
				for(int i=0; i<data.size();i++){
					Student stu=(Student)data.get(i);
					System.out.print(stu.num);
					System.out.print("\t");
					System.out.print(stu.name);
					System.out.print("\t");
					System.out.print(stu.kor);
					System.out.print("\t");
					System.out.print(stu.eng);
					System.out.print("\t");
					System.out.print(stu.math);
					System.out.print("\t");
					System.out.print(stu.tot());
					System.out.print("\t");
					System.out.println(stu.avg());	
				}
			}else if(input.equals("2")){//�Է�
				Student stu=new Student();
				System.out.print("�й�>>");
				input=sc.nextLine();
				stu.num=Integer.parseInt(input);
				System.out.print("�̸�>>");
				stu.name=sc.nextLine();
				System.out.print("����>>");
				stu.kor=sc.nextInt();
				System.out.print("����>>");
				stu.eng=sc.nextInt();
				System.out.print("����>>");
				stu.math=sc.nextInt();
				sc.nextLine();
				data.add(stu);
			}else if(input.equals("3")){//����
				System.out.print("�й�>>");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				for(int i=0; i<data.size(); i++){
					Student stu=(Student)data.get(i);//(Student)�� casting�ϴ� �� �ܼ��� �� ���Ƴ�
					if(stu.num==num){//���� ��ü�� �־��ֹǷ� set���ص� ��
						System.out.print("�̸�("+stu.name+")>>");//���� ���� ������. �ξ� ģ���ϳ�
						stu.name=sc.nextLine();
						System.out.print("����("+stu.kor+")>>");
						stu.kor=sc.nextInt();
						System.out.print("����("+stu.eng+")>>");
						stu.eng=sc.nextInt();
						System.out.print("����("+stu.math+")>>");
						stu.math=sc.nextInt();
						sc.nextLine();
						break;
					}else{
						System.out.print("�й��� �ٽ� Ȯ���� �ּ���");
					}
				}
			}else if(input.equals("4")){//����
				System.out.print("�й�>>");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				for(int i=0; i<data.size(); i++){
					Student stu=(Student)data.get(i);
					if(stu.num==num){
						data.remove(i);
						break;
					}else{
						System.out.println("�й��� �ٽ� Ȯ���� �ּ���");
					}
				}
			}
		}//while end
	}
}