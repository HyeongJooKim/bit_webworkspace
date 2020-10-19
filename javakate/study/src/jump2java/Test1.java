package jump2java;

public class Test1 {

	public int vartest(int a){
		a++;
		return a;
	}
	
	public static void main(String[] args) {
		int su=1;
		
		Test1 test=new Test1();//static에서 non-static을 호출하기 위해 참조변수 만들어줌
		int result=test.vartest(su);//void로는 값을 받을 수 없음.
		System.out.println(result);
		
	}

}
