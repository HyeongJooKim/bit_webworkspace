package jump2java;

public class Dog extends Animal{

	public Dog(){}//default ������. ������ �ʾƵ� ��. �ڵ� ����
	
	public void sleep(){
		System.out.println(this.name+"�� ���� �ܴ�");
	}
	
	public static void main(String[] args) {
		Animal dog=new Dog();
		dog.setName("�۸���");
		System.out.println(dog.name);
		
		((Dog) dog).sleep();
	}

}
