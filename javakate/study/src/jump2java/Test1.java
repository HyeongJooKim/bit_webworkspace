package jump2java;

public class Test1 {

	public int vartest(int a){
		a++;
		return a;
	}
	
	public static void main(String[] args) {
		int su=1;
		
		Test1 test=new Test1();//static���� non-static�� ȣ���ϱ� ���� �������� �������
		int result=test.vartest(su);//void�δ� ���� ���� �� ����.
		System.out.println(result);
		
	}

}
