package jump2java;

public class Test3 {

	int su;
	
	public void vartest(){
		this.su++;//�Ű����� ���� Test3 ��ü�� su ���� �ϳ� �ø��� �޼ҵ尡 ��.
	}
	
	public static void main(String[] args) {
		Test3 test=new Test3();
		test.su=1;
		test.vartest();
		System.out.println(test.su);//2
		
	}

}
