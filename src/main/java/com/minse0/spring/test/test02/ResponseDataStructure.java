package com.minse0.spring.test.test02;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lifecycle/test02")
public class ResponseDataStructure {

	@RequestMapping("/1")
	public Map<String, Object> MovieList1(){
	 for(int i = 0; i < 5; i++) {
		 
		Map<String, Object> Movie = new HashMap<>(); 
		Movie.put("rate", 15);
		Movie.put("director", "봉준호");
		Movie.put("time", 131);
		Movie.put("title", "기생충");
		
		
		
	
	 
		Movie.put("rate", 0);
		Movie.put("director", "로베르토 베니니");
		Movie.put("time", 116);
		Movie.put("title", "인생은 아름다워");
		
			
	 
		Movie.put("rate", 12);
		Movie.put("director", "크리스토퍼 놀란");
		Movie.put("time", 147);
		Movie.put("title", "인셉션");
		
		
		
	
	
		Movie.put("rate", 19);
		Movie.put("director", "윤종빈");
		Movie.put("time", 133);
		Movie.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		
		
		
	
	 
		Movie.put("rate", 15);
		Movie.put("director", "프란시스 로렌스");
		Movie.put("time", 137);
		Movie.put("title", "헝거게임");
		
		
		return Movie;
	
	}
}
