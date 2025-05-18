package com.minse0.spring.test.test02;

import java.util.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lifecycle/test03")

public class ResponseDataStructure2 {
	
	@RequestMapping("/2")
	public List<Post> getPosts(){
		List<Post> posts = new ArrayList<>();
		
		 posts.add(new Post(
		            "안녕하세요 가입인사 드립니다.",
		            "hagulu",
		            "안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다."
		        ));

		        posts.add(new Post(
		            "헐 대박",
		            "bada",
		            "오늘 목요일이 있어... 금요일인줄"
		        ));

		        posts.add(new Post(
		            "오늘 데이트 한 이야기 해드릴게요.",
		            "dulumary",
		            "...."
		        ));
		return posts;
		
	}
}
