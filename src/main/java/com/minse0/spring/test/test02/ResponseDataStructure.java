package com.minse0.spring.test.test02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lifecycle/test02")
public class ResponseDataStructure {

	@RequestMapping("/1")
	public List<Map<String, Object>> getmovies(){
		List<Map<String, Object>> movieList = new ArrayList<>();
		 
		Map<String, Object> Movie = new HashMap<>(); 
		Movie.put("rate", 15);
		Movie.put("director", "봉준호");
		Movie.put("time", 131);
		Movie.put("title", "기생충");
		movieList.add(Movie);
		
		Movie = new HashMap<>(); 
		Movie.put("rate", 0);
		Movie.put("director", "로베르토 베니니");
		Movie.put("time", 116);
		Movie.put("title", "인생은 아름다워");
		movieList.add(Movie);
		
		Movie = new HashMap<>(); 
		Movie.put("rate", 12);
		Movie.put("director", "크리스토퍼 놀란");
		Movie.put("time", 147);
		Movie.put("title", "인셉션");
		movieList.add(Movie);
		
		Movie = new HashMap<>(); 
		Movie.put("rate", 19);
		Movie.put("director", "김민서");
		Movie.put("time", 133);
		Movie.put("title", "동창회의 목적");
		movieList.add(Movie);
		
		Movie = new HashMap<>(); 
		Movie.put("rate", 15);
		Movie.put("director", "프란시스 로렌스");
		Movie.put("time", 137);
		Movie.put("title", "헝거게임");
		
		movieList.add(Movie);
		
		return movieList;
	
	}
	
}
