package com.minse0.spring.test.real_estate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.minse0.spring.test.real_estate.domain.Estate;
import com.minse0.spring.test.real_estate.service.EstateService;

@Controller
public class EstateController {
	
	@Autowired
	private EstateService estateService;
	
	@ResponseBody
	@RequestMapping("mybatis/real-estate")
	public Estate estate(@RequestParam("id") int id) {
		
		Estate estate = estateService.getEstate(id);
		
		return estate;
	}
}
