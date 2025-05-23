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
@RequestMapping("/mybatis/real-estate")
public class EstateController {
	
	@Autowired
	private EstateService estateService;
	
	@ResponseBody
	@RequestMapping("/select/1")
	public Estate estate(@RequestParam("id") int id) {
		
		Estate estate = estateService.getEstate(id);
		
		return estate;
	}
	@ResponseBody
	@RequestMapping("/select/2")
	public List<Estate> EstateByRentPrice(@RequestParam("rent")int rentPrice) {
		
		List<Estate> EstateList = estateService.getEstateByRentPrice(rentPrice);
	
		return EstateList;
		
	}
	@ResponseBody
	@RequestMapping("/select/3")
	public List<Estate> EstateByAreaAndPrice(
			@RequestParam("area")int area
			,@RequestParam("price") int price) {
		List<Estate> EstateList = estateService.getEstateByAreaAndPrice(area, price);
		
		return EstateList;
	}
	@ResponseBody
	@RequestMapping("/insert/1")
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
	
	@RequestMapping("/insert/2")
	public String createRealEstate(@RequestParam("realtorId") int realtorId) {
		
//		address : 썅떼빌리버 오피스텔 814호
//		area : 45
//		type : 월세
//		price : 100000
//		rentPrice : 120
	  int count =	estateService.addRealEstate(realtorId , "썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
	  
	  return "실행 결과 : " + count;
	}
	  @ResponseBody
	  @RequestMapping("/update")
	  public String updateRealEstate() {
		int count =  estateService.updateRealEstate(21, "전세", 70000);
		
		return "실행 결과 : " + count;
		
	  
	}
	  @ResponseBody
	  @RequestMapping("/delete")
	  public String deleteRealEstate(@RequestParam("id") int id){
		
		  int count = estateService.deleteRealEstate(id);
		  
		  return "실행 결과 : " + count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
