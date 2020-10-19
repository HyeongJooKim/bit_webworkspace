package grade03;

import java.util.ArrayList;
import java.util.Scanner;

public class Grade030T3 {
//선생님코딩 방법 3. 객체, ArrayList 활용
	//역시 제일 마음에 드네

	private static class Student{//여서만 쓸거니 inner class로 이동
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
		String title="학생성적관리프로그램(Ver 0.3.0)";
		String menu="1.보기 2.입력 3.수정 4.삭제 0.종료>>";
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
			}else if(input.equals("1")){//보기
				System.out.println("-----------------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|합계\t|평균");
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
			}else if(input.equals("2")){//입력
				Student stu=new Student();
				System.out.print("학번>>");
				input=sc.nextLine();
				stu.num=Integer.parseInt(input);
				System.out.print("이름>>");
				stu.name=sc.nextLine();
				System.out.print("국어>>");
				stu.kor=sc.nextInt();
				System.out.print("영어>>");
				stu.eng=sc.nextInt();
				System.out.print("수학>>");
				stu.math=sc.nextInt();
				sc.nextLine();
				data.add(stu);
			}else if(input.equals("3")){//수정
				System.out.print("학번>>");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				for(int i=0; i<data.size(); i++){
					Student stu=(Student)data.get(i);//(Student)로 casting하는 이 단순한 걸 놓쳤네
					if(stu.num==num){//기존 객체에 넣어주므로 set안해도 됨
						System.out.print("이름("+stu.name+")>>");//기존 정보 보여줌. 훨씬 친절하네
						stu.name=sc.nextLine();
						System.out.print("국어("+stu.kor+")>>");
						stu.kor=sc.nextInt();
						System.out.print("영어("+stu.eng+")>>");
						stu.eng=sc.nextInt();
						System.out.print("수학("+stu.math+")>>");
						stu.math=sc.nextInt();
						sc.nextLine();
						break;
					}else{
						System.out.print("학번을 다시 확인해 주세요");
					}
				}
			}else if(input.equals("4")){//삭제
				System.out.print("학번>>");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				for(int i=0; i<data.size(); i++){
					Student stu=(Student)data.get(i);
					if(stu.num==num){
						data.remove(i);
						break;
					}else{
						System.out.println("학번을 다시 확인해 주세요");
					}
				}
			}
		}//while end
	}
}