package day09;

class Ex01{

	int su=1234;//λ³??? ? ?Έ
	static int su2=4321;
	
	public Ex01(){//??±?. (int a)λ₯? ? ??λ©? compile ?€λ₯λ¨ 
	//??±? ?΄λ¦?==?΄??€λͺ?
	//??±? ??: ?΄??€λͺ?(){}
	//?΄? κΉμ?? ?λ§λ€???? default ??±?(?Έ?κ°? ?? ?΄??€λͺ?(){})? ??΅ κ°??₯. 
	//???Όλ‘? λ§λ€?΄ μ€?.
	//default ??±?? κ²½μ° ?€λ₯? ??±?κ°? ?? ? ??΅ κ°??₯
		System.out.println("κ°μ²΄λ₯? ??±?©??€");
		return;//μ‘΄μ¬?? κ°μ΄ ?? λΏ?. voidμ§?λ§? void?Ό? ?Έ ?? ??.
	}

	public static void main(String[] args){
		//java.util.Scanner sc=new java.util.Scanner(System.in);//System.in ??¨μ£Όλ©΄ ?€λ₯?. ?΄ ??±?? ?Έ?λ₯? λ°λ? ?£κΈ°λ‘ ??΄ ?? ??±??.
		Ex01 me;//λ³??? ? ?Έ
		me=new Ex01();//λ³??? μ΄κΈ°?, ??? λ§λ  ??±? ?ΈμΆν? κ²?
		System.out.println("su="+me.su);
	}//main end

	public static void func01(){
		System.out.println("static method func01()");
	}

	public void func02(){
		System.out.println("non-static method func02()");
	}

}//class end