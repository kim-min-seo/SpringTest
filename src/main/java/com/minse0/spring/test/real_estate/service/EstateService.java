package com.minse0.spring.test.real_estate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minse0.spring.test.real_estate.domain.Estate;
import com.minse0.spring.test.real_estate.repository.EstateRepository;

@Service
public class EstateService {
	
	@Autowired
	private EstateRepository estateRepository;
	
	public Estate getEstate(int id) {
		
		Estate estate = estateRepository.selectEstate(id);
		
		return estate;
	}
}
