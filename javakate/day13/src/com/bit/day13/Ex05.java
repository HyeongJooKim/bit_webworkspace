package com.bit.day13;

public class Ex05 {
	//Object class
	int su;
	
	Ex05(int su){
		this.su=su;
	}//me가 무엇인지를 지정해주는 역할
	
	public static void main(String[] args) {
		Object obj=new Object();
		System.out.println(obj.toString());//java.lang.Object@15db9742 출력 (class이름@hashcode)
		Object obj2=obj;
		Object obj3=new Object();
		System.out.println(obj.toString());//java.lang.Object@15db9742 출력
		System.out.println(obj.hashCode());//366712642 출력 (hashCode를 int로 출력해서 달라보임
		System.out.println(obj.equals(obj2));//true
		System.out.println(obj.equals(obj3));//false
//		obj.clone();//Object class는 protected class라서 clone 불가함.그러나 Object를 상속받은 다른 class들은 clone이 됨. clone결과물은 Object type임
		System.out.println("------------------");
		
		Ex05 me=new Ex05(10);
		Ex05 me2=new Ex05(10);
		try {
			me.clone();//그냥 이렇게 쓰면 다음줄과 같은 뜻. Object type으로 복제되는 것.
//			Object me3=me.clone();
//			Ex05 me3=(Ex05)me.clone();//이렇게 쓰면 내class type으로 복제하는 것.
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(me==me2);//false. ==는 주소 비교, equals는 값비교할 것 같은데
		System.out.println(me.equals(me2));//false.. 
		//왜 얘만 false일까? 값을 결정해주지 않았기 때문에. 
		//정해주기 위해서 Ex02 생성자를 만들었다.
		
		String msg="java";
		String msg2=new String("java");
		System.out.println(msg==msg2);//false
		System.out.println(msg.equals(msg2));//true
		
		
		Integer su1=new Integer(100);
		Integer su2=new Integer(100);
		System.out.println(su1==su2);//false
		System.out.println(su1.equals(su2));//true	
		
		
	}//main end
	
	public boolean equals(Object me2){//Object 클래스의 equals를 equals method override 해보자
		Ex05 me=(Ex05) me2;//Object 타입의 equals를 Ex05 타입으로 형변환
		return this.su==me.su;
	}

}//class end
