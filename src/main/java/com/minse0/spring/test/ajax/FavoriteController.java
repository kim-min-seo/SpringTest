package com.minse0.spring.test.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.minse0.spring.test.ajax.domain.Favorite;
import com.minse0.spring.test.ajax.service.FavoriteService;


@Controller
@RequestMapping("/ajax/favorite")
public class FavoriteController {
	
	 @Autowired
	 private FavoriteService favoriteService;
	
	 @GetMapping("/list")
	 public String favoriteList(Model model) {
		 
		 List<Favorite> favoriteList = favoriteService.getFavoriteList();
		 
		 model.addAttribute("favoriteList", favoriteList);   
		 
		 return "ajax/list";
	 }
	 // 즐쳐찾기 추가 API
	 @ResponseBody
	 @PostMapping("/create")
	public Map<String, String> createFavorite(
			 @RequestParam("name") String name
			 , @RequestParam("url") String url){
		 
		int count =  favoriteService.addFavorite(name, url);
		
		Map<String, String> resultMap = new HashMap<>();
		
		// 성공 : {"result":"success"}
		// 실패 : {"result":"fail"}
		if(count == 1) {
			resultMap.put("result", "success");
		} else {
			resultMap.put("result", "fail");
		}
		return resultMap;
	 }
	 @GetMapping("/input")
	 public String inputFavorite() {
	     return "ajax/input";
	 }
	 
	 @ResponseBody
	 @GetMapping("/duplicate")
	 public Map<String, Object> checkDuplicate(@RequestParam("url") String url) {
	     boolean usable = favoriteService.isUsableUrl(url);
	     Map<String, Object> result = new HashMap<>();
	     result.put("usable", usable);
	     result.put("message", usable ? "저장 가능한 url 입니다." : "중복된 url 입니다.");
	     return result;
	 }

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
