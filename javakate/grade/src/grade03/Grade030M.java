package grade03;
//2020-06-01 day19
import java.util.ArrayList;
import java.util.Scanner;

//�����������α׷�
//�ڷᱸ��Ȱ��(ArrayList)
//�޴�: 1.���� 2.�Է� 3.���� 4.���� 0.����>>>
//�й� �̸� ���� ���� ���� �հ� ���

class Student{
	int id;
	String name;
	int kor;
	int eng;
	int math;
	
	public boolean equals(Student s){//�й� ���ؼ� ������ true �˷��ִ� �޼ҵ�
		if(s instanceof Student){
			Student stu=(Student)s;
			if(stu.id==id){
				return true;
			}else{
			}
		}
		return false;
	}
}//Student class end




public class Grade030M {//���ڵ�

	public static void main(String[] args) {

		ArrayList<Student> list=new ArrayList<Student>();
		Student s=new Student();
		//�л� �Ѹ�� �ϳ��� s ��ü�� ������ �迭�� �ؾ�,
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("-------------------------------");
		System.out.println("�л������������α׷�(Ver 0.3.0)");
		System.out.println("-------------------------------");
		
		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>>");
			int input=sc.nextInt();
			if(input==0){
				break;
			}else if(input==1){
				//����
				System.out.println("-----------------------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|�հ�\t|���");
				System.out.println("-----------------------------------------------------");
				for(int i=0; i<list.size();i++){
					s=list.get(i);
					System.out.print(s.id);
					System.out.print("\t");
					System.out.print(s.name);
					System.out.print("\t");
					System.out.print(s.kor);
					System.out.print("\t");
					System.out.print(s.eng);
					System.out.print("\t");
					System.out.print(s.math);
					System.out.print("\t");
					System.out.print(s.kor+s.eng+s.math);
					System.out.print("\t");
					double avg=(s.kor+s.eng+s.math)*100/3/100.0;
					System.out.println(avg);	
				}
			}else if(input==2){
				//�Է�
				s=new Student();
				System.out.print("�й�>>");
				s.id=sc.nextInt();
				//�Է¹��� �й��� ���� �Ͱ� ��ġ�� �� �˻�����.
//				for(int i=0; i<list.size(); i++){
//					if(s.id==list.)
//				}
				sc.nextLine();
				System.out.print("�̸�>>");
				s.name=sc.nextLine();
				System.out.print("����>>");
				s.kor=sc.nextInt();
				System.out.print("����>>");
				s.eng=sc.nextInt();
				System.out.print("����>>");
				s.math=sc.nextInt();
				list.add(s);
			}else if(input==3){
				//����
				Student temp=new Student();
				System.out.print("�й�>>");
				temp.id=sc.nextInt();
				sc.nextLine();
				System.out.print("�̸�>>");
				temp.name=sc.nextLine();
				System.out.print("����>>");
				temp.kor=sc.nextInt();
				System.out.print("����>>");
				temp.eng=sc.nextInt();
				System.out.print("����>>");
				temp.math=sc.nextInt();
				for(int i=0; i<list.size(); i++){
					Student stu=list.get(i);
					if(stu.id==temp.id){
						list.set(i, temp);
					}else{
						System.out.print("������ �й��� �ٽ� Ȯ���� �ּ���");
					}
				}
			}else if(input==4){
				//����
			}
		}//while end

		
		
		
		sc.close();
		
	}//main end
}//class end
