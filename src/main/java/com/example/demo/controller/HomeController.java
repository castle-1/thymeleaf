package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	//static 정적파일
	//controller 패키지 구조 주의
	//패키지 이름을 controller로 작성하면 매핑x
	//com.example.demo.controller 로작성해야함. mainApplication 이랑 같은 패키지에 있어야한다.
	
	@GetMapping()
	public String home() {
		return "index";
	}

}
