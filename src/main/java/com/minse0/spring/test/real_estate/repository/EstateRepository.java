package com.minse0.spring.test.real_estate.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.minse0.spring.test.real_estate.domain.Estate;

@Mapper
public interface EstateRepository {
	
	public Estate selectEstate(@Param("id") int id);
	
	public List<Estate> selectEstateByRentPrice(@Param("rentPrice")int rentPrice);
	
	public List<Estate> selectEstateByAreaAndPrice(
			@Param("area")int area
		  , @Param("price")int price);
	public int insertEstate(
			@Param("realtorId") int realtorId
			, @Param("address") String adress
			, @Param("area") int area
			, @Param("type") String type
			, @Param("price") int price
			);
		public int insertEstateByObject(Estate estate);	
	
}
