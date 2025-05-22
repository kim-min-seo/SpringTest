package com.minse0.spring.test.real_estate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minse0.spring.test.real_estate.domain.Estate;
import com.minse0.spring.test.real_estate.repository.EstateRepository;

@Service
public class EstateService {
	
	@Autowired
	private EstateRepository estateRepository;
	
	// 전달받은 id에 대응되는 매물 정보 얻어오기
	public Estate getEstate(int id) {
		
		Estate estate = estateRepository.selectEstate(id);
		
		return estate;
	}
	
	public List<Estate> getEstateByRentPrice(int rentPrice) {
		
		List<Estate> EstateList = estateRepository.selectEstateByRentPrice(rentPrice);
		
		return EstateList;
	}
	
	public List<Estate> getEstateByAreaAndPrice(int area, int price){
		
		List<Estate> EstateList = estateRepository.selectEstateByAreaAndPrice(area, price);
		
		return EstateList;
	}
	public int addEstate(int realtorId
			, String address
			, int area
			, String type
			, int price) {
		int count = estateRepository.insertEstate(realtorId, address, area, type, price);
		
		return count;
	}
	public int addEstateByObject(Estate estate) {
		int count = estateRepository.insertEstateByObject(estate);
		
		return count;
		
		
	}
		
	
}
  