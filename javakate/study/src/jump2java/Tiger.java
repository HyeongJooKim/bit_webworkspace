package jump2java;

public class Tiger extends Predator implements Barkable {

//	public void feed(Predator predator){
//		System.out.println("�� ��� ������");
//	}

	@Override
	public String getFood() {
		return "�䳢";
	}

	@Override
	public void bark() {
		System.out.println("����");
	}
}