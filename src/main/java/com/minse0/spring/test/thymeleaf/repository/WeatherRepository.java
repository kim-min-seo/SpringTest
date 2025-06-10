package com.minse0.spring.test.thymeleaf.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.minse0.spring.test.thymeleaf.domain.Weather;

@Mapper
public interface WeatherRepository {

	public List<Weather> selectWeatherHistory();
	void insertWeather(Weather weather);

}
