package test;

//java.lang.Class
//java reflection 이란 키워드로 검색해보면 더 많은 내용 나올 것

class Target{
	
	public Target(){
		System.out.println("Target() created");
	}
	
	void func(){
		System.out.println("Target func run");
	}
}

public class Ex01 {
	
	public static void main(String[] args) {

		String info="test.Target";
		try {
			Class clazz=Class.forName(info);
			Target result=(Target)clazz.newInstance();
			result.func();
		} catch (IllegalAccessException | ClassNotFoundException | InstantiationException e) {
			e.printStackTrace();
		}
	}
}