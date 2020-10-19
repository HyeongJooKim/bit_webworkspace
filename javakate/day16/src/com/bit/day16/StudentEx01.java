package com.bit.day16;

public class StudentEx01 {

	public static void main(String[] args) {

		StudentVO[] arr1 = new StudentVO[0];
		StudentVO s=new StudentVO();
		s.setName("김");
		s.setKorean(50);
		s.setEnglish(60);
		s.setMath(70);
		System.out.println(arr1.length);//아직은 0
		arr1=StudentArrayUtil.add(arr1, s);
		//parameter에 있는 이름은 설명일 뿐, 실재하지 않음.
		//거기 넣은 값이 아래에서 계산에 대입된다는 것을 보여주는 것 뿐. 즉 arr이라는 배열은 없음
		System.out.println(arr1.length);//하나 늘어서 1

		System.out.println("s의 index번호는 "+StudentArrayUtil.indexOf(arr1, s));//s의 index번호는 0
		
		StudentVO s2=new StudentVO();
		s2.setName("이");
		s2.setKorean(50);
		s2.setEnglish(60);
		s2.setMath(70);
		
		System.out.println("s2의 index번호는 "+StudentArrayUtil.indexOf(arr1, s2));//s2의 index번호는 -1

		StudentVO s3=new StudentVO();
		s3.setName("삼");
		s3.setKorean(50);
		s3.setEnglish(60);
		s3.setMath(70);
		
		StudentVO s4=new StudentVO();
		s4.setName("사");
		s4.setKorean(50);
		s4.setEnglish(60);
		s4.setMath(70);
		
		StudentVO s5=new StudentVO();
		s5.setName("오");
		s5.setKorean(50);
		s5.setEnglish(60);
		s5.setMath(70);

		arr1=StudentArrayUtil.add(arr1, s2);
		arr1=StudentArrayUtil.add(arr1, s3);
		arr1=StudentArrayUtil.add(arr1, s4);
		arr1=StudentArrayUtil.add(arr1, s5);

		System.out.println("현재 배열크기는: "+arr1.length);//현재 배열크기는: 5

		arr1=StudentArrayUtil.remove(arr1, s3);
		
		System.out.println("현재 배열크기는: "+arr1.length);//현재 배열크기는: 4
		
		StudentVO s6=new StudentVO();
		s6.setName("오");
		s6.setKorean(50);
		s6.setEnglish(60);
		s6.setMath(70);
		arr1=StudentArrayUtil.remove(arr1, s6);//add하지 않은 값을 지우면 안지워지고 그냥 그대로 
		System.out.println("현재 배열크기는: "+arr1.length);//현재 배열크기는: 4
	}
}
