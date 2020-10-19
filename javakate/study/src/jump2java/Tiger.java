package jump2java;

public class Tiger extends Predator implements Barkable {

//	public void feed(Predator predator){
//		System.out.println("는 고기 좋아해");
//	}

	@Override
	public String getFood() {
		return "토끼";
	}

	@Override
	public void bark() {
		System.out.println("어흥");
	}
}