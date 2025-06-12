package com.minse0.spring.test.ajax;

import java.time.LocalDate;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.minse0.spring.test.ajax.domain.Reservation;
import com.minse0.spring.test.ajax.service.ReservationService;

@Controller
@RequestMapping("/ajax/reservation")
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("/input")
	public String inputReservation() {
		return "ajax/reservation/input";
	}
	
	@GetMapping("/list")
	public String ReservationList(Model model) {
		model.addAttribute("reservationList", reservationService.getReservationList());
		return "ajax/reservation/list";
	}
	
	@ResponseBody
	@PostMapping("/create")
	public Map<String, String> createReservation(
			@RequestParam("name") String name
			, @DateTimeFormat(pattern="yyyy년 M월 d일") @RequestParam("date") LocalDate date
			, @RequestParam("day") int day
			, @RequestParam("headcount") int headcount
			, @RequestParam("phoneNumber") String phoneNumber
			, @RequestParam("state") String state
			) {
				int count = reservationService.createReservation(
			            name, date, day, headcount, phoneNumber, state
			        );
			     return Map.of("result", count == 1 ? "success" : "fail");
	}
	
	
	
	@ResponseBody
	@GetMapping("/delete")
	public Map<String, String> deleteReservation(@RequestParam("id") int id) {
		int count = reservationService.deleteReservation(id);
        return Map.of("result", count == 1 ? "success" : "fail");
	}
	
	@GetMapping("/check")
	public String checkReservation() {
	    return "ajax/reservation/check";
	}
	
	 @ResponseBody
	    @GetMapping("/query")
	    public Map<String, Object> queryReservation(
	        @RequestParam("name") String name,
	        @RequestParam("phoneNumber") String phoneNumber
	    ) {
	        Reservation r = reservationService.getByNameAndPhone(name, phoneNumber);
	        if (r != null) {
	            return Map.of(
	                "result",      "success",
	                "reservation", r
	            );
	        } else {
	            return Map.of("result", "fail");
	        }
	    }
	
	
	
}
