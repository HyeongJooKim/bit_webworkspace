package com.bit.framework.util;

import org.springframework.aop.ThrowsAdvice;

public class ThrowModule implements ThrowsAdvice {
	
	public void afterThrowing(Exception ex) {
		//익셉션을 특정하면 그 예외에 대해서만 작동시킬 수 있음
		System.out.println("exception after throwing module"+ex.toString());
	}
}
