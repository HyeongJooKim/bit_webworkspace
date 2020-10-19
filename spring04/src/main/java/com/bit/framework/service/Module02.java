package com.bit.framework.service;

public class Module02 {
//	ConsoleService console=new KorConsoleService(); // 객체 생성을 모듈이 아닌 실행부로 이동

	//	다형성이용
	ConsoleService console;

// 의존주입 : 세터 또는 생성자 이용
	public void setConsole(ConsoleService console) {
		this.console = console;
	}
	public Module02(ConsoleService console) {
		super();
		this.console = console;
	}

	public Module02() {};
	
	public void func01() {
		console.sayHello();
	}
	
	public void func02() {
//		ConsoleService console=new KorConsoleService();
		int[] arr= {1,3,5,7,9};
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]+":");
			console.sayHi();
		}
	}
}
