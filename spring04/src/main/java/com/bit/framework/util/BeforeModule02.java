package com.bit.framework.util;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeModule02 implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("before module02");//before module02
//		System.out.println(method.getName());//func01
//		System.out.println(Arrays.toString(args));//[] : 메소드의 인자값 받아줌
//		System.out.println(target);//com.bit.framework.service.Module02@25af5db5 메인의 해쉬값과 같음
	}
}