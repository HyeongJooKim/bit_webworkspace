package jump2java;

public class Animal {
	
	String name;
	//Ŭ������ ����� ����, ��ü����, instance����, �������, �Ӽ�
	
	public void setName(String name){
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		Animal cat=new Animal();
		//cat�� ���� ������� ��ü
		//cat�� Animal�� instance
		cat.setName("Happy");
		System.out.println(cat.name);//Happy
		
		Animal dog=new Animal();
		Animal horse=new Animal();

	}
}
