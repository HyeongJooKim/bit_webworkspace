package com.bit.day18;

//내부클래스 중 이건 꼭 알아야 하고 많이 쓰임.
//4. anonymous class 익명클래스
//다음주 UI 그릴 때 상속 많이 받게 될텐데 익명클래스 많이 보게 될 거다

class Lec05{
	void func01(){
		class Inner{
			void func22(){
				System.out.println("로컬클래스의 기능");
			}
		}
//		Inner inn=new Inner();
//		inn.func02();
		//위 두 줄 대신 아래 한줄 가능
		new Inner().func22();
	}
	
	void func03(){
		//anonymous class 익명클래스. 아래 func04() 수행한 것과 동일
		new Local(){//Local이라는 interface를 상속받는 이름 없는 클래스를 만들어
					//수행하고 바로 없어짐. 이름을 짓지 않음.
			public void func22(){
				System.out.println("로컬클래스의 기능");
			}
		}.func22();
	}

	void func05(){//이렇게도 쓸 수 있음
		Local local=new Local(){
			public void func22(){
				System.out.println("로컬클래스의 기능");
			}
		};
		local.func22();
	}
	
	
	Local func04(){
		class Inner implements Local{//Local이라는 interface를 상속받는 Inner라는 클래스
			public void func22(){
				System.out.println("로컬클래스의 기능");
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
//		outter.func01();//Lec05.func01(); 수행
//		Local obj=outter.func04();
////		System.out.println(obj);
//		obj.func22();
		
		Ex11 me=new Ex11(){
			public void func01(){
				System.out.println("익명클래스");
			}
		};
		me.func01();
		
		//책 14장
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("쓰레드 진행");				
			}
		}).start();
		
//		new Thread(()) -> System.out.println("쓰레드진행")).start();
//		이런 식으로 쓰인다.
	}
}
