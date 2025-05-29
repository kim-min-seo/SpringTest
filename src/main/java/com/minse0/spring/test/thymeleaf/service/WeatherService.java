package com.minse0.spring.test.thymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minse0.spring.test.thymeleaf.domain.Weather;
import com.minse0.spring.test.thymeleaf.repository.WeatherRepository;

@Service
public class WeatherService {
	// 모든 날씨 정보 리시트 얻어오기
	@Autowired
	private WeatherRepository weatherRepository;
	public List<Weather> getWeaterHistory() {
		// weatherhistory 테이블 모든행 조회
		List<Weather> weatherhistotry = weatherRepository.selectWeatherHistory();
		
		return weatherhistotry;
	}
}
