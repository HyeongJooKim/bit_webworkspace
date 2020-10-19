package com.bit.day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentEx04 {

	public static void main(String[] args) {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		Scanner sc=new Scanner(System.in);
		System.out.println("----------------------------------------");
		System.out.println("성적입출력프로그램");
		System.out.println("----------------------------------------");
		
		while(true){
			System.out.print("1.입력 2.출력 3.수정 4.삭제 5.종료 >>");
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice==1){
				StudentVO s=new StudentVO(); 
				System.out.print("학번: ");
				s.setId(sc.nextInt());
				sc.nextLine();
				System.out.print("이름: ");
				s.setName(sc.nextLine());
				System.out.print("국어: ");
				s.setKorean(sc.nextInt());
				System.out.print("영어: ");
				s.setEnglish(sc.nextInt());
				System.out.print("수학: ");
				s.setMath(sc.nextInt());
				list.add(s);				
			}else if(choice==2){
				System.out.println("------------------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|합계\t|평균");
				System.out.println("------------------------------------------------------");
//				Collections.sort(list);//어찌 소팅하나?
				for(StudentVO s : list){
					StudentController controller=new StudentController();
					System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getKorean()+"\t"+s.getEnglish()+"\t"+s.getMath()+"\t"+controller.calculateSum(s)+"\t"+controller.calculateAverage(s));
				}
				System.out.println("------------------------------------------------------");
				
			}else if(choice==3){
				//수정
				StudentVO s=new StudentVO(); 
				System.out.print("학번: ");
				s.setId(sc.nextInt());
				sc.nextLine();
				System.out.print("이름: ");
				s.setName(sc.nextLine());
				System.out.print("국어: ");
				s.setKorean(sc.nextInt());
				System.out.print("영어: ");
				s.setEnglish(sc.nextInt());
				System.out.print("수학: ");
				s.setMath(sc.nextInt());
				list.add(s);//새 정보를 먼저 입력. 입력해야 list.get(i)해서 값을 뺄 수 있다.
				
				System.out.println(list.size());
				StudentVO temp=list.get(list.size()-1);//가장 최종입력된 그 번호가 번호겠지
				int index=0;				
				for(int i=0; i<list.size(); i++){
					s=list.get(i);
					if(temp.getId()==s.getId()){
						index=list.indexOf(s);//첫번째 index 찾으면 멈추기
						break;
					}
				}
				list.remove(index);
				
			}else if(choice==4){
				//삭제
				
				System.out.print("학번: ");
				int num=sc.nextInt();
				int index=0;				
				for(int i=0; i<list.size(); i++){
					StudentVO s=list.get(i);
					if(num==s.getId()){
						index=list.indexOf(s);//첫번째 index 찾으면 멈추기
						break;
					}
				}
				list.remove(index);				
				
				sc.nextLine();
			}else if(choice==5){
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}
		sc.close();
	}//main end
}//class end

//학번 수동 입력하는 것 추가해보라
//수정, 삭제도 더해보라

