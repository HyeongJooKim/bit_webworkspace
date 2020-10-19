package day06;

class Ex05{

	public static void main(String[] args){
		int su=func01();
		func02();
		System.out.println("su="+su);
	}//main end

	public static int func01(){//void 대신 int, void면 오류남.
		System.out.println("func01 run");
		int a=3;
		int b=2;
		int c=a+b;
		return c;//이건 뭐지? return도 예약어? return이 없어도 오류남
	}//func01 end

	public static void func02(){
		System.out.println("func02 run");
//		return;//return 값이 없을 뿐, return은 자동 실행
	}//func02 end



}//class end
