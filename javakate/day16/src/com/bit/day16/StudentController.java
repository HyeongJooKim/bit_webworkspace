package com.bit.day16;

import java.util.List;

public class StudentController {
	//Dependency Injection: 어떤 클래스가 외부 클래스에 의존적일 때,
	//	외부클래스를 직접 만들어 쓰지 않고, 외부에서 받아다가 쓰는 것
	//DI하는 2가지방법:
	//	1.생성자를 통한 DI >> 실습해보자
	//	2.메소드를 통한 DI
	//원래는 list는 우리가 필요할 때마다 DB에서 긁어와야 하지만
	//우리는 DB가 없으므로 여기에 필드로 넣는다.
	//또한 다형성을 활용핟기 위해 데이터터입을 Arraylist가 아닌 List로 넣는다.
	
	//list 에 직접 접근하지 않고 controller를 통해 수행하도록 해보자
	
	List<StudentVO> list;//List는 interface임. ArrayList 아닌 List로 list를 바꿔주기
	public StudentController(List<StudentVO> list){
		//이 컨트롤러 클래스는 List<StudentVO> list에 의존적인 관계임
		//그렇다고해서 이 리스트를 어떻게 초기화할지를 여기에 적어주면
		//만약 그 리스트가 변경이 가해지게 된다면 여기도 바꿔줘야 한다,
		//하지만 외부에서 리스트를 주입하게 된다면
		//여기선 그녕 초기화 코드만 있기 대문에 그 주입받은 것을 그대로 쓰면 됨다
		//이러한 주입이 바로 의존성 주입이 된다.
		this.list=list;
//		this.list=new ArrayList<>();//이렇게 쓴다면 ArrayList를 다른 걸로 바꾸면 여기도 바꿔줘야 함
	}
	
	public int calculateSum(StudentVO s){//값이 없으므로 parameter 지정해줘야 함
		return s.getKorean() + s.getEnglish() + s.getMath();
	}
	public double calculateAverage(StudentVO s){
		return calculateSum(s)*100/3/100.0;
	}
	public StudentVO findById(StudentVO s){
		StudentVO result=null;
		if(list.indexOf(s)!=-1){
			int index=list.indexOf(s);
			result=list.get(index);
		}
		return result;
	}
	
	//학번 자동부여하고 값더하기
	public void add(StudentVO s){
		if(list.size()==0){//입력된 값이 없으면 0번부터 지정
			s.setId(0);
		}else{//입력된 값이 있으면 list의 마지막값으로 id 입력
			int id=list.get(list.size()-1).getId() +1;
			s.setId(id);
		}
		list.add(s);
	}

	//추가된 입력값을 list에 추가하기
	public void set(StudentVO s){
		int index=list.indexOf(s);
		list.set(index, s);
	}
	
	public void remove(StudentVO s){
		list.remove(s);
	}
}
