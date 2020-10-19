package com.bit.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Ex05 implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("listener init...."+sce.getServletContext().getInitParameter("abcd"));
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("listener contextDestroyed....");
		
	}
//listener > filter > filter... > servlet 순으로 시작되고 닫힐 때는 반대순서로
}