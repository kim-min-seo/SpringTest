package com.minse0.spring.test.jpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.minse0.spring.test.jpa.domain.Company;
import com.minse0.spring.test.jpa.repository.CompanyRepository;
import com.minse0.spring.test.jpa.service.CompanyService;

@Controller
@RequestMapping("/jpa/company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private CompanyRepository companyRepository;

	
	@ResponseBody
	@GetMapping("/create")
	public List<Company> createCompanies() {
      
		
		 Company company1 = companyService.addCompany("넥슨", "컨텐츠 게임", "대기업", 3585);
	     Company company2 = companyService.addCompany("버블팡", "여신 금융업", "대기업", 6934);

	     return Arrays.asList(company1, company2);
        
	   }
	
	@ResponseBody
	@GetMapping("/update")
	public Company updateCompany() {
		
		Company company = companyService.updateCompany(12,"중소기업",34);
		
		return company;
	  }
	
	@ResponseBody
	@GetMapping("/delete")
	public String deleteCompany() {
		
		companyService.deleteCompany(12);
		
		return "수행 완료";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

