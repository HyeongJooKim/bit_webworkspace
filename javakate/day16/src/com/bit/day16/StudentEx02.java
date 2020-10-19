package com.bit.day16;

import java.util.ArrayList;
//TeacherVO 라는 클래스에서 배열기능들을 수행하고 싶다면?
//우리가 왜 배열에 맞춰서 메소드를 만들어야 하나?
//ArrayList 등장

//Collections Framework에는 같은 종류의 여러 객체를 한번에 다룰 수 있게 해 주는 다양한 클래스들이 있다.
//가장 대표적인 예가 ArrayList, HashMap? 두 가지를 가장 많이 쓰게 될 것
public class StudentEx02 {

	public static void main(String[] args) {
		ArrayList<StudentVO> list = new ArrayList<>();
		//<클래스이름>(); 생성자인 걸 보니, ArrayList 자체가 클래스객체임
		//<> template이라 부름
		//template이란 해당 콜렉션 객체가 무슨 클래스의 집합인지 지정하는 것.
		//단, template안에는 클래스만 들어갈 수 있다
		//즉, 기본형 자료는 못들어감.
		//왜? Collections Framework는 주소값을 이용하여 집합 내의 요소들을 컨트롤하기 때문에 
		//주소값이 존재하지 않는 기본형 데이터 타입들을 템플릿 안에 들어갈 수 없다.
		//기본형 데이터타입을 클래스로의 형태로 바꾼 wrapper class가 있으므로 이걸 쓰면 된다.
		//Collections Framework에서는 equals(); method를 적극적으로 내부에서 활용함
		//따라서 Collections Framework에 들어있는 클래스를 제대로 활용하기 위해서는
		//내가 만든 클래스에 equals();를 정의하는 것이 매우 중요함.
		//왜? java.lang.Object의 equals()는 return this==o; 만 적혀 있다.
		
		//ArrayList의 경우 크기가 자동으로 바뀜
		//size();로 알 수 있음.
		System.out.println("list의 현재크기: "+list.size());//list의 현재크기: 0
		
		StudentVO s=new StudentVO();
		s.setName("일");
		s.setKorean(50);
		s.setEnglish(60);
		s.setMath(70);
		
		StudentVO s2=new StudentVO();
		s2.setName("이");
		s2.setKorean(50);
		s2.setEnglish(60);
		s2.setMath(70);
		
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

		//ArrayList에 추가할 때는 add(추가할 값)를 실행하면 됨
		list.add(s);
		System.out.println("list의 현재크기: "+list.size());//list의 현재크기: 1
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		System.out.println("list의 현재크기: "+list.size());//list의 현재크기: 5
		
		//특정번호에 끼워넣기 하면 그 자리에 새값이 들어가고 한칸씩 밀린다. add(index, element)
		StudentVO s6=new StudentVO();
		s6.setName("육");
		s6.setKorean(50);
		s6.setEnglish(60);
		s6.setMath(70);
		
		//해당 위치의 객체를 호출할 땐 get(index)
		System.out.println("index 2의 StudentVO의 getName(): "+list.get(2).getName());
		//index 2의 StudentVO의 getName(): 삼
	
		list.add(2, s6);
		System.out.println("index 2의 StudentVO의 getName(): "+list.get(2).getName());
		//index 2의 StudentVO의 getName(): 육
		System.out.println("index 3의 StudentVO의 getName(): "+list.get(3).getName());
		//index 3의 StudentVO의 getName(): 삼 //한 칸 밀림
		
		//list에서 해당 객체의 위치를 알고 싶을 땐 indexOf(e)로 호출
		System.out.println("s4의 list index: "+list.indexOf(s4));
		//s4의 list index: 4
		//만약 해당 객체가 리스트에 여러개 있으면 제일 앞의 index만 나옴
		//만약 가장 뒤의 index 를 알고 싶으면 
		System.out.println("s4의 list lastIndex:"+list.lastIndexOf(s4));
		//s4의 list lastIndex:4
		//값의 중복 여부 알 수 있겠네
		
		//list에 있는지 없는지만 궁금하면 contains
		System.out.println("s4가 있을까? "+list.contains(s4));//s4가 있을까? true

		//indexOf, lastIndexOf, contains 모두 존재하지 않는 객체를 검색하면 각각 -1, -1, false가 리턴된다
		
		//list에서 삭제할 때 2가지 방법이 가능함
		//1. 해당 인덱스 삭제
		System.out.println("list의 현재 크기: "+list.size());//list의 현재 크기: 6
		list.remove(0);
		System.out.println("list의 현재 크기: "+list.size());//list의 현재 크기: 5

		//2. 해당 객체와 값이 일치하는 요소 중에서 가장 앞번호를 삭제
		System.out.println("contains(s6): "+list.contains(s6));//contains(s6): true
		StudentVO s60=new StudentVO();
		s60.setName("육");
		s60.setKorean(50);
		s60.setEnglish(60);
		s60.setMath(70);
		list.remove(s60);//s60과 값이 같은 요소인 s6을 찾아 지운다. 그런 값이 없으면 no change
		System.out.println("contains(s6): "+list.contains(s6));//contains(s6): false
		System.out.println("list의 현재 크기: "+list.size());//list의 현재 크기: 4
	}
}
