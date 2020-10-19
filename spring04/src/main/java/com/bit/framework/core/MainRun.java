package com.bit.framework.core;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bit.framework.model.entity.DeptVo;
import com.bit.framework.service.DeptService;
import com.bit.framework.service.KorConsoleService;
import com.bit.framework.service.Module02;
import com.bit.framework.service.Module03;
import com.bit.framework.service.Module04;

public class MainRun {

	public static void main(String arg[]) throws SQLException {

		ApplicationContext ac=null;
		ac=new ClassPathXmlApplicationContext("/applicationContext.xml");
//		ac=new FileSystemXmlApplicationContext("src\\main\\resources\\applicationContext.xml");
//		ac=new GenericXmlApplicationContext("classpath:/applicationContext.xml");
		
//		AOP
//		Module02 module=(Module02) ac.getBean("proxyBean");
//		module.func01();
//		module.func02();
		
		DeptService deptService = (DeptService) ac.getBean("deptService");
//		for(DeptVo bean : deptService.list()) {
//			System.out.println(bean);
//		}
		deptService.insert(new DeptVo(0, "test4", "test5"));
//		System.out.println(deptService.detail(1));
	}
}