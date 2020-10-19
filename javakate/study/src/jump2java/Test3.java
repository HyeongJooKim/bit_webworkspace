package jump2java;

public class Test3 {

	int su;
	
	public void vartest(){
		this.su++;//매개변수 없이 Test3 객체의 su 값을 하나 올리는 메소드가 됨.
	}
	
	public static void main(String[] args) {
		Test3 test=new Test3();
		test.su=1;
		test.vartest();
		System.out.println(test.su);//2
		
	}

}
