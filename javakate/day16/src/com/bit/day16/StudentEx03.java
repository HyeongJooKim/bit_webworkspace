package com.bit.day16;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx03 {

	public static void main(String[] args) {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("----------------------------------------");
			System.out.println("성적입출력프로그램");
			System.out.print("1.입력 2.출력 3.수정 4.삭제 5.종료 >>");
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice==1){
				//입력할 때만 객채 생성해서 리스트에 추가하면 언제든 불러올 수 있다
				StudentVO s=new StudentVO(); 
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
				for(StudentVO s : list){//출력용으로 s라는 임시 이름 만들어 준 것.
					System.out.println(s.getName()+"\t"+s.getKorean()+"\t"+s.getEnglish()+"\t"+s.getMath());
				}
//				for(int i=0; i<list.size(); i++){
//					StudentVO s=list.get(i);
//					System.out.println(s.getName()+"\t"+s.getKorean()+"\t"+s.getEnglish()+"\t"+s.getMath());
//				}
				
			}else if(choice==3){
				//수정
			}else if(choice==4){
				//삭제
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