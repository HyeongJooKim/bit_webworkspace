package jump2java;

public class HouseDog extends Dog{

	public HouseDog(String name){
		//생성자: Class 이름과 같고 return 자료형이 없는 메소드
		//생성자가 선언된 경우 생성자의 규칙대로만 객체생성가능.
		//new 키워드가 사용될 때 호출됨.
		//생성자 따로 만들지 않으면 default 생성자가 자동으로 생성되는 것과 같음
		
	}
	
	public void sleep(){//method overriding
		System.out.println(this.name+"가 집에서 잠을 잔다");
	}
	
	public void sleep(int hour){
		System.out.println(this.name+"가 집에서 "+hour+"시간동안 잠을 잔다");
		
	}
	
	public static void main(String[] args) {
		HouseDog houseDog=new HouseDog("통통이");
//		houseDog.setName("통통이");//생성자에서 넣어줘야 하므로 이제 불필요함
		houseDog.sleep();
		houseDog.sleep(3);//method overloading 됨
		
	}

}
