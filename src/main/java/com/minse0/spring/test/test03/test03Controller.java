package com.minse0.spring.test.test03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test03Controller {
	@RequestMapping("/lifecycle/test04")
	public String thymleafResponse() {
		
		return "lifecycle/test01";
	}
}
