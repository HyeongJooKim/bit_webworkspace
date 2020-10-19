package grade03;
//2020-06-01 day19
import java.util.ArrayList;
import java.util.Scanner;

//성적관리프로그램
//자료구조활용(ArrayList)
//메뉴: 1.보기 2.입력 3.수정 4.삭제 0.종료>>>
//학번 이름 국어 영어 수학 합계 평균

class Student{
	int id;
	String name;
	int kor;
	int eng;
	int math;
	
	public boolean equals(Student s){//학번 비교해서 있으면 true 알려주는 메소드
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




public class Grade030M {//내코딩

	public static void main(String[] args) {

		ArrayList<Student> list=new ArrayList<Student>();
		Student s=new Student();
		//학생 한명당 하나의 s 객체를 가지는 배열로 해야,
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("-------------------------------");
		System.out.println("학생성적관리프로그램(Ver 0.3.0)");
		System.out.println("-------------------------------");
		
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>>");
			int input=sc.nextInt();
			if(input==0){
				break;
			}else if(input==1){
				//보기
				System.out.println("-----------------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|합계\t|평균");
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
				//입력
				s=new Student();
				System.out.print("학번>>");
				s.id=sc.nextInt();
				//입력받은 학번이 기존 것과 겹치는 지 검사하자.
//				for(int i=0; i<list.size(); i++){
//					if(s.id==list.)
//				}
				sc.nextLine();
				System.out.print("이름>>");
				s.name=sc.nextLine();
				System.out.print("국어>>");
				s.kor=sc.nextInt();
				System.out.print("영어>>");
				s.eng=sc.nextInt();
				System.out.print("수학>>");
				s.math=sc.nextInt();
				list.add(s);
			}else if(input==3){
				//수정
				Student temp=new Student();
				System.out.print("학번>>");
				temp.id=sc.nextInt();
				sc.nextLine();
				System.out.print("이름>>");
				temp.name=sc.nextLine();
				System.out.print("국어>>");
				temp.kor=sc.nextInt();
				System.out.print("영어>>");
				temp.eng=sc.nextInt();
				System.out.print("수학>>");
				temp.math=sc.nextInt();
				for(int i=0; i<list.size(); i++){
					Student stu=list.get(i);
					if(stu.id==temp.id){
						list.set(i, temp);
					}else{
						System.out.print("수정할 학번을 다시 확인해 주세요");
					}
				}
			}else if(input==4){
				//삭제
			}
		}//while end

		
		
		
		sc.close();
		
	}//main end
}//class end
