package jump2java;

public class Animal {
	
	String name;
	//클래스에 선언된 변수, 객체변수, instance변수, 멤버변수, 속성
	
	public void setName(String name){
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		Animal cat=new Animal();
		//cat은 새로 만들어진 객체
		//cat은 Animal의 instance
		cat.setName("Happy");
		System.out.println(cat.name);//Happy
		
		Animal dog=new Animal();
		Animal horse=new Animal();

	}
}
