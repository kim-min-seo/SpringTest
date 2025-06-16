package com.minse0.spring.test.jpa;

import java.util.ArrayList;
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
        // 1. builder 패턴으로 회사 객체 생성
        Company company1 = Company.builder()
                .name("넥슨")
                .business("컨텐츠 게임")
                .scale("대기업")
                .headcount(3585)
                .build();

        Company company2 = Company.builder()
                .name("버블팡")
                .business("여신 금융업")
                .scale("대기업")
                .headcount(6934)
                .build();

        // 2. DB에 저장
        companyRepository.save(company1);
        companyRepository.save(company2);

        // 3. JSON 형식으로 반환 (2개 회사 정보 리스트)
        return Arrays.asList(company1, company2);
       }
	    
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

