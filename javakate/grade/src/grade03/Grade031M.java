package grade03;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

//Map�� �̿��ؼ� �л��������α׷�
	//K: �й�
	//V: ������ ������ Student ��ü��
class Student2{//������ ���Ŵ� inner class�� �̵�
	
	Student2(){}
	
	String num;
	String name;
	String kor, eng, math;
	int tot(){
		return Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);
	}
	double avg(){
		return tot()*100/3/100.0;
	}
}//Student end

public class Grade031M {
		
	public static void main(String[] args) {
		
		Map<String,Student2> map=new TreeMap<String,Student2>();
		Scanner sc=new Scanner(System.in);
		String title="�л������������α׷�(Ver 0.3.1)";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����>>";
		
		String input=null;
		System.out.println(title);
		System.out.println("------------------------------");
		
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0")){
				break;
			}else if(input.equals("1")){
				//����
				System.out.println("-----------------------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|�հ�\t|���");
				System.out.println("-----------------------------------------------------");
				
				Set<String> keys=map.keySet();
				Iterator<String> ite=keys.iterator();
				while(ite.hasNext()){
					String key=ite.next();
					Student2 stu=(Student2)map.get(key);
					System.out.print(key+"\t|");
					System.out.print(stu.name+"\t|");
					System.out.print(stu.kor+"\t|");
					System.out.print(stu.eng+"\t|");
					System.out.print(stu.math+"\t|");
					System.out.print(stu.tot()+"\t|");
					System.out.println(stu.avg());
				}
			}else if(input.equals("2")){
				//�Է�
				Student2 stu=new Student2();
				System.out.print("�й�>>");
				stu.num=sc.nextLine();
				System.out.print("�̸�>>");
				stu.name=sc.nextLine();
				System.out.print("����>>");
				stu.kor=sc.nextLine();
				System.out.print("����>>");
				stu.eng=sc.nextLine();
				System.out.print("����>>");
				stu.math=sc.nextLine();
				map.put(stu.num, stu);
			}else if(input.equals("3")){
				//����
				System.out.print("�й�>>");
				String id=sc.nextLine();
				Set<String> keys=map.keySet();
//				Iterator<String> ite=keys.iterator();
				Student2 stu=(Student2)map.get(id);
				System.out.print("�̸�>>");
				stu.name=sc.nextLine();
				System.out.print("����>>");
				stu.kor=sc.nextLine();
				System.out.print("����>>");
				stu.eng=sc.nextLine();
				System.out.print("����>>");
				stu.math=sc.nextLine();
				map.put(id, stu);
			}else if(input.equals("4")){
				//����
				System.out.print("�й�>>");
				String id=sc.nextLine();
//				Set<String> keys=map.keySet();
//				Iterator<String> ite=keys.iterator();
				map.remove(id);
			}
		}	
		sc.close();
	}
}