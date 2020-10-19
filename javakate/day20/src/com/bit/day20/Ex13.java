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
		
		//		Lec1<String> lec1=new Lec1<>();//�̷��� <>����� ��. �˾Ƽ� ������. JDK 1.6���� �߰���
		//Wildcard generic type. ���� ������ �� ��. �����Ϸ��� ���߿��� �ʿ���

		//<?>
		//<? super Number> Number�� ����Ÿ�Ը� ����
		//<? extends Number> Number�� ����Ÿ�Ը� ����

//		Lec1<? super Number> lec1=new Lec1<>();//<?>�� ���������δ� ����.
//		//super Number �� �ٿ��θ� ������ ���������� Number�� ��ӹ޴� Ÿ�Ը� ����
////		Lec1<String> lec2=(Lec1<String>)lec1;//���߿� �����Ǹ� �̷���
//		lec1.setObj(1234);
//		lec1.setObj(12.34);
//		System.out.println(lec1.getObj());
////		String msg=lec2.getObj();
//		System.out.println(msg);
		
	}

}
