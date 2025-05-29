package com.minse0.spring.test.thymeleaf.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WeatherRepository {

	public List<> selectWeatherHistory();
}
