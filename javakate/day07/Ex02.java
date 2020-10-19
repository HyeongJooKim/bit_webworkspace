package day07;//class가 속할 그룹지정

	class Ex02{

		public static void func01(){
//			System.out.println("Ex02.func01 static method1");
//			func11();//static에서static 그냥 호출됨
//			func22();//static에서는 non-static 그냥은 호출 불가
			Ex02 me=new Ex02();//me라는 참조변수 생성
			me.func22();
		}

		public void func02(){
			System.out.println("Ex02.func02 non-static method1");
			func11();//non-static에서static 그냥 호출됨
			func22();//non-static에서 non-static 그냥 호출됨
		}

		public static void func11(){
			System.out.println("Ex02.func11 static method2");
		}

		public void func22(){
			System.out.println("Ex02.func22 non-static method2");
		}

		public static void main(String[] args){

			Ex02 me=new Ex02();//me라는 참조변수 생성
			me.func02();

			func01();//static에서 static 잘 호출됨

		}//main end
	}//class end