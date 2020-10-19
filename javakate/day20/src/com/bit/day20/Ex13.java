package com.bit.day20;

import java.util.ArrayList;

class Lec1<T>{
	T obj;
	void setObj(T obj){
		this.obj=obj;
	}
	T getObj(){
		return obj;
	}
	void func(java.util.List<? extends Number> list){
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}

public class Ex13 {

	public static void main(String[] args) {

//		ArrayList<String> list=new ArrayList<>();
//		list.add("1234");
//		list.func(list);

		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(1234);
		list2.func();

		ArrayList<Double> list3=new ArrayList<>();
		list3.add(12.34);
		Lec1<Integer> lec=new Lec1<>();
		lec.func(list);
		lec.func(list2);
		lec.func(list3);
		
		//		Lec1<String> lec1=new Lec1<>();//이렇게 <>비워도 됨. 알아서 유추함. JDK 1.6에서 추가됨
		//Wildcard generic type. 아직 결정안 된 것. 실행하려면 나중에는 필요함

		//<?>
		//<? super Number> Number의 상위타입만 가능
		//<? extends Number> Number의 하위타입만 가능

//		Lec1<? super Number> lec1=new Lec1<>();//<?>도 문법적으로는 허용됨.
//		//super Number 를 붙여두면 아직은 미정이지만 Number를 상속받는 타입만 가능
////		Lec1<String> lec2=(Lec1<String>)lec1;//나중에 결정되면 이렇게
//		lec1.setObj(1234);
//		lec1.setObj(12.34);
//		System.out.println(lec1.getObj());
////		String msg=lec2.getObj();
//		System.out.println(msg);
		
	}

}
