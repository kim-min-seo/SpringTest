package com.minse0.spring.test.ajax;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ajax/reservation")
public class ReservationController {
	
	@GetMapping("/list")
	public String ReservationList(Model model) {
		
		return "ajax/reservation/list";
	}
	
	@ResponseBody
	@PostMapping("/create")
	public Map<Object, Object> createReservation(
			@RequestParam("name") String name
			, @RequestParam("date") String date
			, @RequestParam("day") int day
			, @RequestParam("headcount") int headcount
			, @RequestParam("phoneNumber") String phoneNumber
			, @RequestParam("state") String state
			) {
		
	}
	
	@GetMapping("/input")
	public String inputReservation() {
		return "ajax/reservation/input";
	}
	
	@ResponseBody
	@GetMapping("/delete")
	public Map<Object, Object> deleteReservation(@RequestParam("id") int id) {
		
	}
	
	
}
