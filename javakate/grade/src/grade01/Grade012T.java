package grade01;

//2020-05-25 day14 Ex11

public class Grade012T {

	public static void main(String[] args) {
		// �л������������α׷�(Ver0.1.2)
		// ��� 3. String �迭 �̿�
		// �Է�: �й� �̸� ���� ���� ���� (�� String���� �ޱ�)
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String[] data=null;
		System.out.println("Total # to input>>");
		int limit=Integer.parseInt(sc.nextLine());
		data=new String[limit];
		int cnt=0;
		int err=0;
		while(true){
			System.out.println("1.result 2.input 3.modify 4.delete 0.exit>>");
			String input=sc.nextLine();
			if(input.equals("0")){
				break;
			}else if(input.equals("1")){err=0;
				System.out.println("------------------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|���");
				System.out.println("------------------------------------------------");
				for(int i=0; i<data.length; i++){
					if(data[i]==null){continue;}
//					System.out.println(data[i]);
					String msg=data[i];
					String[] stu=msg.split(",");
					int num=Integer.parseInt(stu[0]);
					String name=stu[1];
					int kor=Integer.parseInt(stu[2]);
					int eng=Integer.parseInt(stu[3]);
					int math=Integer.parseInt(stu[4]);
					double avg=(kor+eng+math)*100/3/100.0;//�Է�data�� �ƴϴ� ���߿� �����ϸ� ��
					System.out.println(num+"\t|"+name+"\t|"+kor+"\t|"+eng+"\t|"+math+"\t|"+avg);
				}
			}else if(input.equals("2")){err=0;
				//�Է�
				if(cnt<limit){
					cnt++;//�й�
					System.out.print("Name>>");
					String name=sc.nextLine();
					System.out.print("Korean>>");
					int kor=Integer.parseInt(sc.nextLine());
					System.out.print("English>>");
					int eng=Integer.parseInt(sc.nextLine());
					System.out.print("Math>>");
					int math=Integer.parseInt(sc.nextLine());
					data[cnt-1]=cnt+","+name+","+kor+","+eng+","+math;
				}else{
					System.out.println("�Է��� �л��� �����ϴ�");
				}
			
			}else if(input.equals("3")){err=0;
				//����
				System.out.print("�й�>>");
				int num=Integer.parseInt(sc.nextLine());
				System.out.print("Name>>");
				String name=sc.nextLine();
				System.out.print("Korean>>");
				int kor=Integer.parseInt(sc.nextLine());
				System.out.print("English>>");
				int eng=Integer.parseInt(sc.nextLine());
				System.out.print("Math>>");
				int math=Integer.parseInt(sc.nextLine());
				data[num-1]=num+","+name+","+kor+","+eng+","+math;
				//�迭�̶� ���� �ʿ䰡 ����. �ٽ� �Է��ϸ� ���� ��
			}else if(input.equals("4")){err=0;
				//����
				System.out.print("�й�>>");
				int num=Integer.parseInt(sc.nextLine());
				data[num-1]=null;
			}else{
				err++;
				System.out.println("�޴��� Ȯ���Ͻð� �ٽ� �Է��� �ּ���\n\n");
				if(err>3){
					System.out.println("�̿����� �ٽ� Ȯ���Ͻð� �̿�ٶ��ϴ�\n\n");
					break;}
			}//else end
		}//while end
		System.out.println("�̿��� �ּż� �����մϴ�.");
		sc.close();
	}//main end
}//class end
