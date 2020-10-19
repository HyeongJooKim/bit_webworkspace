package grade03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//2020-06-08
//Map을 이용해서 학생성적프로그램
//난 TreeMap 선생님은 HashMap 사용함
//학생 한명 정보를 HashMap stu로
//전체 목록은 ArrayList data로 (중복 가능)

public class Grade031T {

	public static void main(String[] args) {

		String title="학생성적관리프로그램(Ver 0.3.1)";
		String menu="1.보기 2.입력 3.수정 4.삭제 0.종료>>";
		System.out.println(title);
		System.out.println("------------------------------\n\n");
		Scanner sc=new Scanner(System.in);
		ArrayList<HashMap<String, String>> data=null;//IO상 장점
//		HashMap<Integer, Object[]> data2=null;//장점: 학번이 키이니 수정, 삭제 용이; 배열은 자료의 크기가 작아 메모리 효율적 사용 //단점: 배열을 값으로 이용하니 과목 추가되면 확장성 좀 불편
//		HashMap<Integer, Student> data3=null;//장점: 학번이 키이니 수정, 삭제 용이; casting 불필요함. casting 오류 적지; OOP 장점 살린 구조이니 좋지 //단점: 성능이 약간 떨어질 수 있으나 아주 미미함.
//		HashMap<Integer, HashMap<String, Object>> data4=null;////장점: 학번이 키이니 수정, 삭제 용이; 확장성 뛰어남. 동적 자료구조를 값으로 넣으니 //단점: value값 꺼낼 때 casting 하나하나 해줘야 함.
//		//TreeMap으로 바꿨을 때Integer key를 썼으면 용이함.
		data=new ArrayList<>();
		String input=null;
		
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if("0".equals(input)){
				break;
			}else if("1".equals(input)){
				//보기
				System.out.println("------------------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|합계\t|평균");
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
				//입력
				HashMap<String,String> stu=null;
				stu=new HashMap<>();
				System.out.print("학번>>");
				stu.put("num", sc.nextLine());
				System.out.print("이름>>");
				stu.put("name", sc.nextLine());
				System.out.print("국어>>");
				stu.put("kor", sc.nextLine());
				System.out.print("영어>>");
				stu.put("eng", sc.nextLine());
				System.out.print("수학>>");
				stu.put("math", sc.nextLine());
				data.add(stu);
			}else if("3".equals(input)){
				//수정
				System.out.print("수정할 학번>>");
				input=sc.nextLine();
				for(int i=0;i<data.size(); i++){
					HashMap<String, String> stu=data.get(i);
					if(input.equals(stu.get("num"))){
						stu.put("num", input);//불필요하지 않나???
						System.out.print("이름>>");
						stu.put("name", sc.nextLine());
						System.out.print("국어>>");
						stu.put("kor", sc.nextLine());
						System.out.print("영어>>");
						stu.put("eng", sc.nextLine());
						System.out.print("수학>>");
						stu.put("math", sc.nextLine());
						break;
					}
				}
			}else if("4".equals(input)){
				//삭제
				System.out.print("삭제할 학번>>");
				input=sc.nextLine();
				for(int i=0;i<data.size(); i++){
					HashMap<String, String> stu=data.get(i);
					if(input.equals(stu.get("num"))){
						data.remove(i);
						break;
					}
				}
			}else{
				System.out.println("입력오류");
				System.out.println("다시 확인하시고 입력해 주세요");
			}
		}
		sc.close();
	}
}
