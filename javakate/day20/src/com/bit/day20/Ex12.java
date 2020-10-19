package com.bit.day20;

class Lec12<T,V>{
	T su;
	V msg;
	
	void setSu(T su){
		this.su=su;
	}
	void setMsg(V msg){
		this.msg=msg;
	}
	T getSu(){
		return su;
	}
	V getMsg(){
		return msg;
	}
}

public class Ex12 {

	public static void main(String[] args) {
		Lec12<Integer, String> lec=new Lec12<Integer, String>();//두 개도 가능
		
		lec.setSu(1234);
		lec.setMsg("hello");
		int su=lec.getSu();
		
		System.out.println(lec.getSu());
		System.out.println(lec.getMsg());
//		System.out.println(lec.getMsg() instanceof String);//
	}
}
