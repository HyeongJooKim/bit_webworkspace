package day07;

class Ex07{
	public Ex07 func(Ex07 me){

		System.out.println("func run");
		return me;

	}//func end

	public static void main(String[] args){

		Ex07 me;
		me=new Ex07();
		me.func(me).func(me).func(me);

	}//main end
}//class end