package jump2java;

public class Lion extends Predator implements Barkable {

//	public void feed(Predator predator){
//		System.out.println("�� ���� �����");
//	}

	@Override
	public String getFood() {
		return "ġŲ";
	}

	@Override
	public void bark() {
		System.out.println("������");
	}

}
