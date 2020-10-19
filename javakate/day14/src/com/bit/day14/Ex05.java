package com.bit.day14;

interface Inter05 extends Inter04, Inter03, Inter02{ 
// class 처럼 역시 public 쓰면 오류. 다른 public이 있으므로
// class와 naming 규칙 동일
// interface끼리의 상속은 extends, 다만, 다중 상속이 가능함
	void func02();
	void func01();
	// func 이름 겹쳐도 아무 문제 없다. 어차피, overriding 할거니깐.
	// 다만, return type은 같아야 overload 될 것
}

public class Ex05 implements Inter05{
	// 관례상 문서 이름과 class 이름 같이 쓰고, 같은 class에는 public 붙인다.
	// 한 문서에 두개의 public class(interface 포함) 안씀.
	// 하나의 문서에 두 개 이상의 class는 가능하나 public은 문서 이름과 같은 그 class에만 붙인다.

	public static void main(String[] args) {
	}

	@Override
	public void func02() {
	}
	
	@Override
	public void func01() {
	}
}