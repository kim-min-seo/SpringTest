package com.minse0.spring.test.real_estate.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.minse0.spring.test.real_estate.domain.Estate;

@Mapper
public interface EstateRepository {
	
	public Estate selectEstate(@Param("id") int id);
}
