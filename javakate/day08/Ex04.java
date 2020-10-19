package day08;

class Ex04{

	int su=1234;

	public static void main(String[] arg) {
		Ex04 me=new Ex04();
		System.out.println(me.su);//non-static 변수는 참조변수로 만들어서 가져와야 함. 호출법칙은 static vs non-static method 호출규칙과 동일
		me.plus();
		me.func01();
		me.plus();
		me.func01();
		me.plus();
		me.func01();
		me=new Ex04();//static int su=1234;면 static값이 static영역에 저장되어 있어 우선 호출되므로 직전저장된 값을 인식
		me.plus();
		me.func01();
	}

	public void plus(){
		su++;
	}


	public void func01(){
		System.out.println("func01 su="+su);
	}

}