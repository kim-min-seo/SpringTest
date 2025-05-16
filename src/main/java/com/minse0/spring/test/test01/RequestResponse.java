package com.minse0.spring.test.test01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/lifecycle/test01")
public class RequestResponse {
	
	
	@RequestMapping("/1")
	public String test() {
		return ""
				+ "<html>\n"
				+ "<head><title>시작</title></head>"
				+ "   <body>"
				+ "		<h2>테스트 프로젝트 완성</h2>"
				+ "		<h4>해당 프로젝트를 통해서 문제 풀이를 진행 합니다.</h4>"
				+ "   </body>"
				+ "</html>";
	}
	@RequestMapping("/2")
	public Map<String, Integer> scoreList(){
		Map<String, Integer> score = new HashMap<>();
		
		score.put("국어", 80);
		score.put("수학", 90);
		score.put("영어", 85);
		
		return score;
	}
}
