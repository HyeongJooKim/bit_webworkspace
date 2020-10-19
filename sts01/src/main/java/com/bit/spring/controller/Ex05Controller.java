package com.bit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/") //이 클래스 전체에 적용되는 것, 한 뎁스 더 주는 것. value만 가능. 여기 / 넣어 주면 아래는 다 안넣어도 됨
public class Ex05Controller {

	@RequestMapping("ex06")
	public void ex01() {} //void일 경우 url 값 리턴해줌

	@RequestMapping("ex/ex07")
	public void ex02() {} 
	//이 경우 /ex/ex07는 존재하지 않으므로 검색 안됨. 메소드명은 상관 없음. 임의 지정. 

}