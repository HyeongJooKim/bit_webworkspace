package com.bit.day18;

//����Ŭ���� �� �̰� �� �˾ƾ� �ϰ� ���� ����.
//4. anonymous class �͸�Ŭ����
//������ UI �׸� �� ��� ���� �ް� ���ٵ� �͸�Ŭ���� ���� ���� �� �Ŵ�

class Lec05{
	void func01(){
		class Inner{
			void func22(){
				System.out.println("����Ŭ������ ���");
			}
		}
//		Inner inn=new Inner();
//		inn.func02();
		//�� �� �� ��� �Ʒ� ���� ����
		new Inner().func22();
	}
	
	void func03(){
		//anonymous class �͸�Ŭ����. �Ʒ� func04() ������ �Ͱ� ����
		new Local(){//Local�̶�� interface�� ��ӹ޴� �̸� ���� Ŭ������ �����
					//�����ϰ� �ٷ� ������. �̸��� ���� ����.
			public void func22(){
				System.out.println("����Ŭ������ ���");
			}
		}.func22();
	}

	void func05(){//�̷��Ե� �� �� ����
		Local local=new Local(){
			public void func22(){
				System.out.println("����Ŭ������ ���");
			}
		};
		local.func22();
	}
	
	
	Local func04(){
		class Inner implements Local{//Local�̶�� interface�� ��ӹ޴� Inner��� Ŭ����
			public void func22(){
				System.out.println("����Ŭ������ ���");
			}
		};
		return new Inner();
	}
}

interface Local{
	void func22();
}

public class Ex11 {

	void func01(){}
	
	public static void main(String[] args) {
//		Lec05 outter = new Lec05();
//		outter.func01();//Lec05.func01(); ����
//		Local obj=outter.func04();
////		System.out.println(obj);
//		obj.func22();
		
		Ex11 me=new Ex11(){
			public void func01(){
				System.out.println("�͸�Ŭ����");
			}
		};
		me.func01();
		
		//å 14��
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("������ ����");				
			}
		}).start();
		
//		new Thread(()) -> System.out.println("����������")).start();
//		�̷� ������ ���δ�.
	}
}
