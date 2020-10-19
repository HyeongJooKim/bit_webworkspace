package com.bit.day15;
//Q1.주민번호확인(한글지원, 한글로 영일이삼 그렇게 입력가능하게)
//주민번호>>000000-0000000
//Q2.성적관리프로그램(배열, 동적할당되게,
//사이즈 미리 입력 안하고 데이터 입력되는대로 늘어나게, 배열 복사 응용)

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] data=new String[3][];
		String[] stu={"1","김","3"};
		data[0]=stu;
		
		String[] stu1={"2","김","3"};
		data[1]=stu1;
		
		String[] stu2={"1","김","3"};
		data[2]=stu;
		
		for(int i=0; i<data.length; i++){
			for(int j=0; j<3; j++){
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		
		}
	}

}
