package com.minse0.spring.test.real_estate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.minse0.spring.test.real_estate.domain.Estate;
import com.minse0.spring.test.real_estate.service.EstateService;

@Controller
@RequestMapping("/mybatis/real-estate/select")
public class EstateController {
	
	@Autowired
	private EstateService estateService;
	
	@ResponseBody
	@RequestMapping("/1")
	public Estate estate(@RequestParam("id") int id) {
		
		Estate estate = estateService.getEstate(id);
		
		return estate;
	}
	@ResponseBody
	@RequestMapping("/2")
	public List<Estate> EstateByRentPrice(@RequestParam("rent")int rentPrice) {
		
		List<Estate> EstateList = estateService.getEstateByRentPrice(rentPrice);
	
		return EstateList;
		
	}
	@ResponseBody
	@RequestMapping("/3")
	public List<Estate> EstateByAreaAndPrice(
			@RequestParam("area")int area
			,@RequestParam("price") int price) {
		List<Estate> EstateList = estateService.getEstateByAreaAndPrice(area, price);
		
		return EstateList;
	}
	@ResponseBody
	@RequestMapping("/4")
	public String createEstate() {
		
		Estate estate = new Estate();
		estate.setRealtorId(3);
		estate.setAddress("푸르지용 리버 303동 1104호");
		estate.setArea(89);
		estate.setType("매매");
		estate.setPrice(100000);
		
		int count = estateService.addEstateByObject(estate);
		
		return "실행 결과 : " + count;
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
