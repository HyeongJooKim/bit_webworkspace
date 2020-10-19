package com.bit.day16;
//3세대 언어식이면서 단일최대원칙 지켜보자

//Student의 필드를 정의하는 부분
//필드를 정의하고 java.lang.Object의 메소드를 해당 필드에 맞추어 
//overriding 하는 메소드만 들어간다.
//이렇게 데이터를 담당하는 '틀'을 우리는 Value Object 혹은 Data Transfer Object
//줄여서 VO, DTO 클래스라고 부른다.
//즉, 이 클래스의 이름은 Student VO 클래스가 되어야 한다.

//코딩할 때 꼭 외부에서 알아야 하는 메소드가 아니면
//모든 필드나 메소드에 private 접근제한자를 설정하게 됨
//하지면 private은 외부 클래스의 접근을 모두 막으므로
//만약 외부 클래스에서 필드에 값을 넣으려면?
//더 이상 직접 접근이 불가능해짐
//대신, 우린 메소드를 만들어서, 그 메소드에 값을 넣어나 호출하게 만들어 두어야 함.
//이렇게 외부에 클래스 내부를 전부공개 하는 게 아니라 
//꼭 필요한 메소드만 공개하도록 모든 접근 제한자를 private으로 하고
//메소드로만 관리하게 만드는 걸 캡슐화(encapsulation)라고 한다.

public class StudentVO {

	private int id;//학생번호
	private String name;//private 붙이면 Controller, Viewer에서는 오류가 뜸
	private int korean;
	private int english;
	private int math;
	
	//필드에 값을 넣는 메소드를 setter method라 함.
	//필드의 현재값을 호출하는 메소드를  getter method라 함.
	//화면 출력이 아니라 값을 return 호출한다는 의미임.
	
	//setter method형식
	//public void set필드명(필드타입 필드이름){
	//	this.필드=필드;
	//}
	
	public void setName(String name){
		this.name=name;
	}
	
	//getter method형식
	//public 필드타입 get필드명(){
	//	return 필드이름;
	//}
	
	public String getName(){
		return name;
	}
	
	public void setKorean(int korean){
		this.korean=korean;
	}

	public int getKorean(){
		return korean;
	}
	
	public void setEnglish(int english){
		this.english=english;
	}
	
	public int getEnglish(){
		return english;
	}
	
	public void setMath(int math){
		this.math=math;
	}
	
	public int getMath(){
		return math;
	}
	
	//우클릭 Source > Generate Getters and Setters...로 자동 생성됨
	
	//equals method는 parameter로 모든 클래스의 객체가 넘어올 수 있다.
	//그럼 어찌 해야 모든 클래스의 객체를 parameter 로 받을 수 있을까?
	//1. 모든 클래스를 overload 해준다....? 클래스가 몇개? 불가능함
	//2. 다형성을 사용한다. (책 p354 5.1 참조) 모든 클래스의 조상인 Object를 사용
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean equals(Object o){
		//2개의 객체가 같은지 알아보려면
		//1. 2개의 객체가 같은 클래스 객체인지 확인해본다.
		//2. 2개의 객체가 같은 클래스 객체면
		//   해당 클래스의 필드 중 특정 필드 혹은 모든 필드를 비교해서
		//   모두 같으면 두 개가 같은 객체이다.

		//먼저 2 객체가 같은 클래스 객체인지 알아보자.
		//즉, parameter로 넘어온 o가 null이 아니고 StudentVO 클래스의 객체인지 확인하자
		//우리는 여기서 간단하게 예약어 하나로 2개를 동시에 확인할 수 있다.
		// instanceof 라는 훌륭한 예약어가 있네. null 이 아니고 해당 클래스의 객체인지 확인해준다.
		
//		if(o instanceof StudentVO){ 
//			//true라고 하면, parameter로 넘어온 o가 StudentVO의 객체란 뜻이므로
//			//우리는 StudentVO의 필드를 꺼내올 수 있다.
//			//하지만 object 타입이므로 형변환해야 StudentVO 객체에 덮어씌울 수 있다.
//			StudentVO s=(StudentVO)o;
//			if(name.equals(s.name) && korean == s.korean && english == s.english && math == s.math){
//				return true;
//			}
//		}
		
		//학번만 비교하는 method
		if(o instanceof StudentVO){ 
			StudentVO s=(StudentVO)o;
			if(id==s.id){
				return true;
			}
		}
		return false;
	}
//우클릭 Resource > Generate toString();
	@Override
	public String toString() {
		return "학번:" + id + "\t이름:" + name + "\t국어:" + korean
				+ "\t영어:" + english + "\t수학:" + math;
	}
	
}
