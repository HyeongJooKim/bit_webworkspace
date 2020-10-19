package jump2java;

public class Dog extends Animal{

	public Dog(){}//default 생성자. 만들지 않아도 됨. 자동 생성
	
	public void sleep(){
		System.out.println(this.name+"가 잠을 잔다");
	}
	
	public static void main(String[] args) {
		Animal dog=new Dog();
		dog.setName("멍멍이");
		System.out.println(dog.name);
		
		((Dog) dog).sleep();
	}

}
