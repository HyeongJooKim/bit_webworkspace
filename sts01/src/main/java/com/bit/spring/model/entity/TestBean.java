package com.bit.spring.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class TestBean {
	int sabun;
	String name;

	public TestBean(int sabun, String name) {
		super();
		this.sabun = sabun;
		this.name = name;
	}
	public TestBean() {}
}
