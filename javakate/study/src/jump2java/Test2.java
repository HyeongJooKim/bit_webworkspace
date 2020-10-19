package jump2java;

public class Test2 {

	int su;
	
	public int vartest(Test2 test){
		test.su++;
		return test.su;
	}
	
	public static void main(String[] args) {
		Test2 test=new Test2();
		test.su=1;
		test.vartest(test);
		System.out.println(test.su);//2
		
	}

}
