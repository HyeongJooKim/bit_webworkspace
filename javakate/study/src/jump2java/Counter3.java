package jump2java;

public class Counter3 {

	static int count=0;//°´Ã¼º¯¼ö
	
	Counter3(){
		this.count++;
		System.out.println(this.count);
	}
	
	public static int getCount(){
		return count;
	}
		
	public static void main(String[] args) {

		Counter3 c1=new Counter3();
		Counter3 c2=new Counter3();
		
//		System.out.println(c1.getCount());
//		System.out.println(c2.getCount());
//		
	}

}
