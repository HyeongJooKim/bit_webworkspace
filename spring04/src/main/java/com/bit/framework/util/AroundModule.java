package com.bit.framework.util;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundModule implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object obj=null;
		System.out.println("Around(bofore)...");
		try {
			obj=invocation.proceed();
			System.out.println("Around(after)...");
		}catch(Exception e) {
			System.out.println("Exception around throw...");
			
		}
		return obj;
	}
}
