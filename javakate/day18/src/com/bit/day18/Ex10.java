package com.bit.day18;

//����Ŭ����
//3. ���� Ŭ����

class Lec04{
	static int su1=1111;
	int su2=2222;	
	
	Lec04(){}
	
	static void func01(){
//		static int su=0;//�Ұ�
		int su99=999999;
		class Lec55{}
			}
	
	void func02(final int su5){ //(fianl int su5)�� ���� �Ͱ� ����. �� ���� ���ٲ�
//		static int su=0;//�Ұ�
//		static final int su5=5555;//����
		int su9=9999;//final�� ���� ����
		
		class Lec44{
//			static int su=0;//�Ұ�
			static final int su33=1;//����
			int su9=9999;
//			su9=1111;//�̷��� ���� �ٲٸ� ������
			Lec44(){}
//			static void func03(){}
			void func04(){}
			void func05(){
				func04();
				func02(1);
				//~jdk 1.7 �������������� final  �ʼ�
				//jdk 1.8~ final ��������. �����Ǿ� �ִ� ���� ���� �� �ƴ�.
				int a=su9;
				int b=su1;
				int c=su2;
			}
		}
	}
}

public class Ex10 {

	public static void main(String[] args) {

	}
}
