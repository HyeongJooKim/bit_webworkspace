package com.bit.day18;

//����Ŭ����
//2. ��� Ŭ����

class Lec03{
	static int su1=1111;
	int su2=2222;	
	
	class Lec33{
		
//		static int su3=3333;//non-static class�ȿ� static ���� �Ұ�
		static final int su5=5555;//����� ���ܷ� ����. ��������� ����� �����ϹǷ� ����.
		int su4=4444;
		
		Lec33(){}
		
//		static void func03(){}////non-static class�ȿ� static ���� �Ұ�

		void func04(){
			System.out.println(su1);//���ٰ���
			func01();//���ٰ���
			Lec03 lec03=new Lec03();
			System.out.println(lec03.su2);
			lec03.func02();
			func02();//���� ���� ����. non-static ���� ���� ������ �Ͱ� ���� ���̴µ�...?
		}
	}

	Lec03(){}
	
	static void func01(){
//		System.out.println(su4);//���� �Ұ�
		Lec03 me=new Lec03();
		Lec33 lec33=me.new Lec33();
		System.out.println(lec33.su4);
		lec33.func04();		
	}
	
	void func02(){
		Lec33 lec33=new Lec33();
		System.out.println(lec33.su4);
		lec33.func04();		
	}
}

public class Ex09 {

	public static void main(String[] args) {
		Lec03 outter=new Lec03();
		Lec03.Lec33 inner=outter.new Lec33();
		System.out.println(inner.su4);
		System.out.println(inner.su5);
		inner.func04();		
	}
}
