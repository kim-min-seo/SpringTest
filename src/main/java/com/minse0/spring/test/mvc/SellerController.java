package com.minse0.spring.test.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.minse0.spring.test.mvc.domain.Seller;
import com.minse0.spring.test.mvc.service.SellerService;

@Controller
@RequestMapping("/mvc/seller")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	// 하나의 판매자 정보 저장 기능
	// 닉네님, 매너온도, 프로필 사진 url
//	@ResponseBody
//	@RequestMapping(path="/mvc/seller/create", method=RequestMethod.POST)
	@PostMapping("/create")
	public String createSeller(
			@RequestParam("nickname") String nickname
			, @RequestParam("temperature") double tempertaure
			, @RequestParam("profileImage") String profileImage) {
		
		int count = sellerService.addSeller(nickname, tempertaure, profileImage);
		
	//	return "실행 결과 : " + count;
		return "redirect:/mvc/info";
	}
		@GetMapping("/input")
		public String sellerInput() {
			
			return "mvc/input";
		}
		
		@GetMapping("/info")
		public String sellerInfo(@RequestParam(value="id", required=false) Integer id ,Model model) {
		
	    Seller seller = null;
		if(id == null) {
			 seller = sellerService.getlastSeller();
		} else {
			 seller  = sellerService.getlastSeller();
		}
		
		model.addAttribute("seller", seller);
			
		return "mvc/info";
		}
		
		
	
}
