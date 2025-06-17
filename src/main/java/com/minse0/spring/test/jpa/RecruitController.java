package com.minse0.spring.test.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.minse0.spring.test.jpa.domain.Recruit;
import com.minse0.spring.test.jpa.repository.RecruitRepository;

@Controller
@RequestMapping("/jpa/recruit")
public class RecruitController {
	
	@Autowired
	private RecruitRepository recruitRepository;
	
	@ResponseBody
	@GetMapping("/find")
	public List<Recruit> findRecruit(){
		List<Recruit> recruitList = null;
		
		 recruitList = recruitRepository.findById(8);
		
		return recruitList;
	}
	
	@ResponseBody
	@GetMapping("/requestParameter")
	public List<Recruit> findRequestParameter(@RequestParam("companyId") int companyId){
		return recruitRepository.findByCompanyId(companyId);
	}
	
	@ResponseBody
	@GetMapping("/condition")
	public List<Recruit> findCondition(){
		
		List<Recruit> recruitList = null;
		
		//recruitList = recruitRepository.findByPositionAndType("웹 back-end 개발자", "정규직");
		//recruitList = recruitRepository.findByTypeOrSalaryGreaterThan("정규직", 9000);
		//recruitList = recruitRepository.findTop3ByOrderBySalaryDesc();
		//recruitList = recruitRepository.findByRegionAndSalaryBetween("성남시 분당구", 7000, 8500);
		recruitList = recruitRepository.findByDeadlineAndSalaryAndTypeDesc();
		
		return recruitList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
