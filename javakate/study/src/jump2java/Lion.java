package jump2java;

public class Lion extends Predator implements Barkable {

//	public void feed(Predator predator){
//		System.out.println("는 떼로 사냥해");
//	}

	@Override
	public String getFood() {
		return "치킨";
	}

	@Override
	public void bark() {
		System.out.println("으르렁");
	}

}
