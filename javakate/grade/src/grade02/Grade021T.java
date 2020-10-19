package grade02;

//2020-05-29 day18 Ex03

import java.util.Arrays;
import java.util.Scanner;

//Q2.성적관리프로그램(배열, 동적할당되게,
//사이즈 미리 입력 안하고 데이터 입력되는대로 늘어나게, 배열 복사 응용)

class Student {
	int num, kor, eng, math;
}

public class Grade021T {
	// 선생님 코딩. 좀 단순하게
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------------");
		System.out.println("학생성적관리프로그램(Ver 0.2.1)");
		System.out.println("-------------------------------");

		Student[] data = new Student[0];// 초기값은 길이 0
		String input = null;

		while (true) {
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>>");
			input = sc.nextLine();
			if (input.equals("0")) {
				break;
			} else if (input.equals("1")) {
				// 보기 수행
				System.out.println("-------------------------------");
				System.out.println("학번\t|국어\t|영어\t|수학");
				System.out.println("-------------------------------");
				for (int i = 0; i < data.length; i++) {
					Student stu = data[i];
					System.out.print(stu.num);
					System.out.print("\t");
					System.out.print(stu.kor);
					System.out.print("\t");
					System.out.print(stu.eng);
					System.out.print("\t");
					System.out.println(stu.math);
					System.out.println("-------------------------------");
				}
			} else if (input.equals("2")) {
				// 입력 수행
				Student stu = new Student();
				System.out.println("학번>> ");
				stu.num = Integer.parseInt(sc.nextLine());
				System.out.println("국어>> ");
				stu.kor = Integer.parseInt(sc.nextLine());
				System.out.println("영어>> ");
				stu.eng = Integer.parseInt(sc.nextLine());
				System.out.println("수학>> ");
				stu.math = Integer.parseInt(sc.nextLine());

				// 기존 값을 넣어줘야 함 temp에
				// 배열의 깊은 복사 다양한 방법
				// 1. 코딩방법
				// Student[] temp=new Student[data.length+1];//길이 하나 늘린 배열 새로
				// 생성해서 덮어씌움.
				// for(int i=0; i<data.length; i++){
				// temp[i]=data[i];
				// }
				// data=temp;//크기 하나 늘린 새 배열을 data에 대입해주면 data 크기도 하나 늘어남.
				// data[data.length-1]=stu;//하나 길어진 배열의 마지막 자리에 입력. 이러면 그전 값은
				// 사라지는 것
				// 2.
				// Student[] temp=new Student[data.length+1];//길이 하나 늘린 배열 새로
				// 생성해서 덮어씌움.
				// System.arraycopy(data, 0, temp, 0, data.length);
				// data=temp;//크기 하나 늘린 새 배열을 data에 대입해주면 data 크기도 하나 늘어남.
				// data[data.length-1]=stu;//하나 길어진 배열의 마지막 자리에 입력. 이러면 그전 값은
				// 사라지는 것
				// //3.
				data = Arrays.copyOf(data, data.length + 1);
				// 배열의 크기를 늘려서 복사하면 새 길이의 새 배열을 만들고 새로 생긴 자리엔 default 값을 넣어줌
				data[data.length - 1] = stu;

			} else if (input.equals("3")) {
				// 수정 수행
				Student stu = new Student();
				System.out.println("학번>> ");
				stu.num = Integer.parseInt(sc.nextLine());
				System.out.println("국어>> ");
				stu.kor = Integer.parseInt(sc.nextLine());
				System.out.println("영어>> ");
				stu.eng = Integer.parseInt(sc.nextLine());
				System.out.println("수학>> ");
				stu.math = Integer.parseInt(sc.nextLine());

				int i = -1;// data[i]에서 쓰기 위해 for 밖으로 꺼낸 것.
				for (i = 0; i < data.length; i++) {
					Student target = data[i];
					if (stu.num == target.num) {
						break;
					}
				}
				if (i < data.length) {
					data[i] = stu;
				} else {
					System.out.println("수정할 학번이 없습니다");
				}

			} else if (input.equals("4")) {
				// 삭제 수행
				Student stu = new Student();
				System.out.println("학번>> ");
				int num = Integer.parseInt(sc.nextLine());
				int idx = -1;// data[i]에서 쓰기 위해 for 밖으로 꺼낸 것.
				for (int i = 0; i < data.length; i++) {
					if (data[i].num == num) {
						idx = i;
					}
				}
				if (idx > -1) {
					Student[] temp = new Student[data.length - 1];// 배열 길이 하나
																	// 줄이고
					// 앞부분 복사 방법 1
					// for(int i=0; i<idx; i++){
					// temp[i]=data[i];
					// }
					// 앞부분 복사 방법 2
					System.arraycopy(data, 0, temp, 0, idx);

					// 뒷부분 복사
					// for(int i=idx+1; i<data.length; i++){
					// temp[i-1]=data[i];
					// 뒷부분 복사
					// for(int i=idx; i<temp.length; i++){
					// temp[i]=data[i+1];//뒷부분 복사
					// }
					// 뒷부분 복사 방법 2
					System.arraycopy(data, idx + 1, temp, idx, temp.length
							- idx);

					data = temp;// 얕은 복사는 뭐였지???
				}
			}
		}// while end
		sc.close();
	}// main end
}// class end