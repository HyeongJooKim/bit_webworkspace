package grade01;

//2020-05-25 day14 Ex12

//�л������������α׷�(Ver0.1.1)
//���4.�����̿�

class Student{
	int num;
	String name;
	int kor,eng,math;//�̷��� �̾ �ᵵ �ǳ�

	Student(int num){
		this.num=num;
	}
}

public class Grade013T {

	public static void main(String[] args) {

		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Total#>>");
		int max=Integer.parseInt(sc.nextLine());
		Student[] data=new Student[max];
		int cnt=0;
		while(true){
			System.out.println("1.result 2.input 3.modify 4.delete 0.exit>>");
			String input=sc.nextLine();
			if(input.equals("0")){
				break;
			}else if(input.equals("1")){//����
				System.out.println("------------------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|���");
				System.out.println("------------------------------------------------");
				for(int i=0; i<data.length; i++){
					Student stu=data[i];
					if(stu==null){continue;}
					System.out.print(stu.num+"\t|");
					System.out.print(stu.name+"\t|");
					System.out.print(stu.kor+"\t|");
					System.out.print(stu.eng+"\t|");
					System.out.print(stu.math+"\t|");
					System.out.println((stu.kor+stu.eng+stu.math)*100/3/100.0);
				}
			}else if(input.equals("2")&&cnt<max){//�Է�
				Student stu=new Student(++cnt);
				System.out.print("Name>>");
				stu.name=sc.nextLine();
				System.out.print("Kor>>");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print("Eng>>");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print("Math>>");
				stu.math=Integer.parseInt(sc.nextLine());		
				data[cnt-1]=stu;
			}else if(input.equals("3")){//����
				System.out.print("Num>>");
				int num=Integer.parseInt(sc.nextLine());
				Student stu=new Student(num);
				System.out.print("Name>>");
				stu.name=sc.nextLine();
				System.out.print("Kor>>");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print("Eng>>");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print("Math>>");
				stu.math=Integer.parseInt(sc.nextLine());		
				data[num-1]=stu;
			}else if(input.equals("4")){//����
				System.out.print("Num>>");
				int num=Integer.parseInt(sc.nextLine());
				data[num-1]=null;
			}
		}//while end
		sc.close();
	}//main end
}//class end