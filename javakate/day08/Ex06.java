package day08;

class Ex66{
	static int su1=1234;
	int su2=4321;
}

class Ex06{
	public static void main(String[] arg) {
		
		System.out.println(Ex66.su1);//다른 클래스에 있는 static 변수 불러오기

		Ex66 you=new Ex66();//다른 클래스에 있는 non-static 변수 불러오기
		System.out.println(you.su2);
	}
}