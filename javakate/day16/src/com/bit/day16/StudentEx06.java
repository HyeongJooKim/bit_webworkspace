package com.bit.day16;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx06 {
	//선생님코딩

	public static void main(String[] args) {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		Scanner sc=new Scanner(System.in);
		StudentController controller=new StudentController();
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
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("------------------------------------------------------");
				for(StudentVO s : list){
					System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getKorean()+"\t"+s.getEnglish()+"\t"+s.getMath()+"\t"+controller.calculateSum(s)+"\t"+controller.calculateAverage(s));
//					System.out.println(s);//일단 목록 다 보고
				}
				System.out.println("------------------------------------------------------");
				
			}else if(choice==3){
				//수정
				if(list.size()==0){
					System.out.println("수정할 값이 없습니다. 입력 후 진행해주세요.");
				}else{
					for(StudentVO s : list){
						System.out.println(s);//일단 목록 다 보고
					}
					System.out.print("수정할 학번을 입력해주세요: ");
					StudentVO s=new StudentVO(); 
					s.setId(sc.nextInt());
					while(controller.findById(list, s)==null){
						System.out.print("없는 학번입니다. 수정할 학번을 다시 입력해주세요: ");
						s.setId(sc.nextInt());//학번 다시 입력받기
					}
					sc.nextLine();//nextLine오류방지
					System.out.print("이름: ");
					s.setName(sc.nextLine());
					System.out.print("국어: ");
					s.setKorean(sc.nextInt());
					System.out.print("영어: ");
					s.setEnglish(sc.nextInt());
					System.out.print("수학: ");
					s.setMath(sc.nextInt());
	
					//수정하는 두가지 방법
					//1. 해당 index에 끼워넣고 원래것을 삭제
					//2. ArrayList.set() 사용
					//두 가지 모두 index 필요하니 찾아놓자
					int index=list.indexOf(s);
					list.set(index,s);//index 자리에 s 값을 override 해줌
				}
			}else if(choice==4){
				//삭제
				if(list.size()==0){
					System.out.println("수정할 값이 없습니다. 입력 후 진행해주세요.");
				}else{
					for(StudentVO s : list){
						System.out.println(s);//일단 목록 다 보고
					}
					System.out.print("삭제할 학번을 입력해주세요: ");
					StudentVO s=new StudentVO(); 
					s.setId(sc.nextInt());
					while(controller.findById(list, s)==null){
						System.out.print("없는 학번입니다. 수정할 학번을 다시 입력해주세요: ");
						s.setId(sc.nextInt());//학번 다시 입력받기
					}
					sc.nextLine();//nextLine오류방지
					list.remove(s);
				}
			}else if(choice==5){
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}
		sc.close();
	}//main end
}//class end