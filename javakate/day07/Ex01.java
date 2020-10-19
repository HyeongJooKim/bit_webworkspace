package day07;//class가 속할 그룹지정

	public class Ex01{

	//non static method 배우자
	//1.정적메서드(static method,class method)
	//2.인스턴스메서드(non-static method)

		public void func01(){

			System.out.println("Ex01.func01 non-static method");

		}

		public static void func02(){

			System.out.println("Ex01.func02 static method");

		}

		public static void main(String[] args){

			func02();//static은 그냥 이렇게 실행됨
//			func01();//non-static은 이렇게는 실행 안됨

//			클래스명 참조변수 = new 클래스명(); non-static은 이렇게 써야 실행됨, 
			Ex01 me=new Ex01();
			me.func01();//
//			me.func01();//static method도이렇게 해도실행은되지만 이렇게 쓰지않는다. 그냥도 되는데 이렇게 쓰면 static인지 non-static인지 혼란. 이러지 말자


		}//main end
	}//class end