package grade03;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

//Map을 이용해서 학생성적프로그램
	//K: 학번
	//V: 나머지 값들을 Student 객체로
class Student2{//여서만 쓸거니 inner class로 이동
	
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
		String title="학생성적관리프로그램(Ver 0.3.1)";
		String menu="1.보기 2.입력 3.수정 4.삭제 0.종료>>";
		
		String input=null;
		System.out.println(title);
		System.out.println("------------------------------");
		
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0")){
				break;
			}else if(input.equals("1")){
				//보기
				System.out.println("-----------------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|합계\t|평균");
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
				//입력
				Student2 stu=new Student2();
				System.out.print("학번>>");
				stu.num=sc.nextLine();
				System.out.print("이름>>");
				stu.name=sc.nextLine();
				System.out.print("국어>>");
				stu.kor=sc.nextLine();
				System.out.print("영어>>");
				stu.eng=sc.nextLine();
				System.out.print("수학>>");
				stu.math=sc.nextLine();
				map.put(stu.num, stu);
			}else if(input.equals("3")){
				//수정
				System.out.print("학번>>");
				String id=sc.nextLine();
				Set<String> keys=map.keySet();
//				Iterator<String> ite=keys.iterator();
				Student2 stu=(Student2)map.get(id);
				System.out.print("이름>>");
				stu.name=sc.nextLine();
				System.out.print("국어>>");
				stu.kor=sc.nextLine();
				System.out.print("영어>>");
				stu.eng=sc.nextLine();
				System.out.print("수학>>");
				stu.math=sc.nextLine();
				map.put(id, stu);
			}else if(input.equals("4")){
				//삭제
				System.out.print("학번>>");
				String id=sc.nextLine();
//				Set<String> keys=map.keySet();
//				Iterator<String> ite=keys.iterator();
				map.remove(id);
			}
		}	
		sc.close();
	}
}