package grade03;

import java.util.ArrayList;
import java.util.Scanner;

public class Grade030T1 {
//선생님코딩 방법 1. ArrayList 만 활용
//그냥 하나의 배열에 데이터를 죽 계속 넣는 방법이네. 1겹 배열
//되긴 하나 별로 매력적이지 않네. 가장 불편한 방법이라 하네
	public static void main(String[] args) {

		ArrayList data=new ArrayList();
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
			}else if(input.equals("1")){
				System.out.println("-----------------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|합계\t|평균");
				System.out.println("-----------------------------------------------------");
				for(int i=0; i<data.size();i++){
					int num=(int)data.get(i++);
					String name=(String)data.get(i++);
					int kor=(int)data.get(i++);
					int eng=(int)data.get(i++);
					int math=(int)data.get(i);
					int sum=kor+eng+math;
					double avg=(kor+eng+math)*100/3/100.0;
//					System.out.print(data.get(i++)+"\t");//이렇게만 해도 출력은 되네. 생각 못해본 방법
//					System.out.print(data.get(i++)+"\t");
//					System.out.print(data.get(i++)+"\t");
//					System.out.print(data.get(i++)+"\t");
//					System.out.print(data.get(i)+"\n");
					System.out.println(num+"\t|"+name+"\t|"+kor+"\t|"+eng+"\t|"+math+"\t|"+sum+"\t|"+avg);
				}
			}else if(input.equals("2")){
				System.out.print("학번>>");
				input=sc.nextLine();
				data.add(Integer.parseInt(input));
				System.out.print("이름>>");
				input=sc.nextLine();
				data.add(input);
				System.out.print("국어>>");
				input=sc.nextLine();
				data.add(Integer.parseInt(input));
				System.out.print("영어>>");
				input=sc.nextLine();
				data.add(Integer.parseInt(input));
				System.out.print("수학>>");
				input=sc.nextLine();
				data.add(Integer.parseInt(input));
			}else if(input.equals("3")){
				System.out.print("학번>>");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				//학번에서만 찾아야 함. 0,5,10,,,5마다의 자리에서만 검색
				int idx=-1;
				for(int i=0; i<data.size();i+=5){
					if(num==(int)data.get(i)){
						idx=i;
						break;}
				}
				if(idx>-1){
					idx++;
					System.out.print("이름>>");
					input=sc.nextLine();
					data.set(idx++,input);
					System.out.print("국어>>");
					input=sc.nextLine();
					data.set(idx++, Integer.parseInt(input));
					System.out.print("영어>>");
					input=sc.nextLine();
					data.set(idx++, Integer.parseInt(input));
					System.out.print("수학>>");
					input=sc.nextLine();
					data.set(idx, Integer.parseInt(input));
				}	
			}else if(input.equals("4")){
				System.out.print("학번>>");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				//학번에서만 찾아야 함. 0,5,10,,,5마다의 자리에서만 검색
				int idx=-1;
				for(int i=0; i<data.size();i+=5){
					if(num==(int)data.get(i)){
						idx=i;
						break;}
				}
				if(idx>-1){
					for(int i=0; i<5; i++){
						data.remove(idx);//삭제하면 다음 번호 당겨지므로 같은 자리만 계속 지우면 됨
					}				
				}
			}
		}//while end
	}
}
