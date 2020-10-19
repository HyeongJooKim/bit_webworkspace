package grade03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//2020-06-08
//Map�� �̿��ؼ� �л��������α׷�
//�� TreeMap �������� HashMap �����
//�л� �Ѹ� ������ HashMap stu��
//��ü ����� ArrayList data�� (�ߺ� ����)

public class Grade031T {

	public static void main(String[] args) {

		String title="�л������������α׷�(Ver 0.3.1)";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����>>";
		System.out.println(title);
		System.out.println("------------------------------\n\n");
		Scanner sc=new Scanner(System.in);
		ArrayList<HashMap<String, String>> data=null;//IO�� ����
//		HashMap<Integer, Object[]> data2=null;//����: �й��� Ű�̴� ����, ���� ����; �迭�� �ڷ��� ũ�Ⱑ �۾� �޸� ȿ���� ��� //����: �迭�� ������ �̿��ϴ� ���� �߰��Ǹ� Ȯ�强 �� ����
//		HashMap<Integer, Student> data3=null;//����: �й��� Ű�̴� ����, ���� ����; casting ���ʿ���. casting ���� ����; OOP ���� �츰 �����̴� ���� //����: ������ �ణ ������ �� ������ ���� �̹���.
//		HashMap<Integer, HashMap<String, Object>> data4=null;////����: �й��� Ű�̴� ����, ���� ����; Ȯ�强 �پ. ���� �ڷᱸ���� ������ ������ //����: value�� ���� �� casting �ϳ��ϳ� ����� ��.
//		//TreeMap���� �ٲ��� ��Integer key�� ������ ������.
		data=new ArrayList<>();
		String input=null;
		
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if("0".equals(input)){
				break;
			}else if("1".equals(input)){
				//����
				System.out.println("------------------------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|�հ�\t|���");
				System.out.println("------------------------------------------------------");
				for(int i=0; i<data.size();i++ ){
					HashMap<String,String> stu=data.get(i);
					int num=Integer.parseInt(stu.get("num"));
					String name=stu.get("name");
					int kor=Integer.parseInt(stu.get("kor"));
					int eng=Integer.parseInt(stu.get("eng"));
					int math=Integer.parseInt(stu.get("math"));
					int tot=kor+eng+math;
					double avg=tot*100/3/100.0;
					System.out.print(num+"\t|");
					System.out.print(name+"\t|");
					System.out.print(kor+"\t|");
					System.out.print(eng+"\t|");
					System.out.print(math+"\t|");
					System.out.print(tot+"\t|");
					System.out.println(avg);
				}
				System.out.println("------------------------------------------------------");

			}else if("2".equals(input)){
				//�Է�
				HashMap<String,String> stu=null;
				stu=new HashMap<>();
				System.out.print("�й�>>");
				stu.put("num", sc.nextLine());
				System.out.print("�̸�>>");
				stu.put("name", sc.nextLine());
				System.out.print("����>>");
				stu.put("kor", sc.nextLine());
				System.out.print("����>>");
				stu.put("eng", sc.nextLine());
				System.out.print("����>>");
				stu.put("math", sc.nextLine());
				data.add(stu);
			}else if("3".equals(input)){
				//����
				System.out.print("������ �й�>>");
				input=sc.nextLine();
				for(int i=0;i<data.size(); i++){
					HashMap<String, String> stu=data.get(i);
					if(input.equals(stu.get("num"))){
						stu.put("num", input);//���ʿ����� �ʳ�???
						System.out.print("�̸�>>");
						stu.put("name", sc.nextLine());
						System.out.print("����>>");
						stu.put("kor", sc.nextLine());
						System.out.print("����>>");
						stu.put("eng", sc.nextLine());
						System.out.print("����>>");
						stu.put("math", sc.nextLine());
						break;
					}
				}
			}else if("4".equals(input)){
				//����
				System.out.print("������ �й�>>");
				input=sc.nextLine();
				for(int i=0;i<data.size(); i++){
					HashMap<String, String> stu=data.get(i);
					if(input.equals(stu.get("num"))){
						data.remove(i);
						break;
					}
				}
			}else{
				System.out.println("�Է¿���");
				System.out.println("�ٽ� Ȯ���Ͻð� �Է��� �ּ���");
			}
		}
		sc.close();
	}
}