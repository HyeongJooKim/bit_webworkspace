package grade02;

import java.util.Arrays;

//Q2.�����������α׷�(�迭, �����Ҵ�ǰ�,
//������ �̸� �Է� ���ϰ� ������ �ԷµǴ´�� �þ��, �迭 ���� ����)
public class Grade020M {

	public static void main(String[] args) {

		System.out.println("---------------------------------------------");
		System.out.println("�л������������α׷�(Ver 0.2.0)");
		System.out.println("---------------------------------------------");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		int num=0;//�ڵ��ο� �й�, �Է¹��� ������ �ϳ��� �ö��ϰ� �� ���� �迭�� ���̷� �� �� �ֳ�???
		int arrSize=2;//�迭 ũ�� ���ڶ� �� ũ�� �÷��� ��
		double avg=0;
		String[] stu=new String[5];//�� �迭�� ��� ���� �� �� ����. [0]�й�,[1]�̸�,[2]����,[3]����,[4]���� 5��
		String[][] data=new String[arrSize][];//String[] stu�� ������ ������ �迭, ���� ������ �����Ҵ�
		for(int i=0; i<data.length; i++){//�ʱ�ȭ�� �ݵ�� ����� �ڸ��� �Ҵ���.
			data[i]=stu;
		}
		//Scanner �Է¹��� ������ cnt++��Ű�� cnt�� �迭 ���̿� ������? �� �� ���� ������ �й��� ���� �Ǿ� ������ �׹�ȣ�� �����ϸ�...������ �ȸ³�... �迭�� �����
		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>>");
			input=sc.nextLine();//�Է� �޴� �ڷ� �ϳ��ϳ��� stu �迭�� ������ �־���� ��
			if(input.equals("0")){
				//����
				break;			
			}else if(input.equals("1")){
				//����
				if(num==0){
					System.out.println("�Էµ� ������ �����ϴ�. ������ �Է��ϰ� ����� �ּ���.");
					break;
				}
				System.out.println("---------------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|���");
				System.out.println("---------------------------------------------");
				for(int i=0; i<num; i++){
					if(data[i]==null){continue;}
					for(int j=0; j<stu.length; j++){
						System.out.print(data[i][j]+"\t|");
						int kor=Integer.parseInt(data[i][2]);
						int eng=Integer.parseInt(data[i][3]);
						int math=Integer.parseInt(data[i][4]);
						avg=(kor+eng+math)*100/3/100.0;
					}
					System.out.println(avg);
				}
			}else if(input.equals("2")){
				//�Է�
				if(num==arrSize){//�Է¼��� �迭ũ��� �������� �迭ũ�⸦ 2��� �ø�
					arrSize*=2;
					String[][] temp=new String[arrSize][5];
					temp=Arrays.copyOf(data, temp.length);
					data=temp;					
				}
//				System.out.println(data.length);
				stu=new String[5];				
				num++;//2.�Է��� ����ɶ����� �й� 1������ �ڵ� �ο�. �����ص� num��ġ�� ���� ������ �����ϰ� �ö�
				stu[0]=""+num;//�й����� �Է�. String���� ����ȯ
				System.out.print("�̸�>>");
				stu[1]=sc.nextLine();
				System.out.print("����>>");
				stu[2]=sc.nextLine();
				System.out.print("����>>");
				stu[3]=sc.nextLine();
				System.out.print("����>>");
				stu[4]=sc.nextLine();
				data[num-1]=stu;
				
			}else if(input.equals("3")){
				//����
				stu=new String[5];//�̰� ���ϴ� ������ stu���� �����
				System.out.print("�й�>>");
				stu[0]=sc.nextLine();
				System.out.print("�̸�>>");
				stu[1]=sc.nextLine();
				System.out.print("����>>");
				stu[2]=sc.nextLine();
				System.out.print("����>>");
				stu[3]=sc.nextLine();
				System.out.print("����>>");
				stu[4]=sc.nextLine();
				data[Integer.parseInt(stu[0])-1]=stu;
			}else if(input.equals("4")){
				//����
				System.out.print("�й�>>");
				int temp=Integer.parseInt(sc.nextLine());//"1" �й��� String���� �Էµ�
				data[temp-1]=null;
			}
		}//while end		
		sc.close();
	}//main end

}//class end
