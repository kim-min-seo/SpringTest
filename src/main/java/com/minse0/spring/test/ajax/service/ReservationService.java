package com.minse0.spring.test.ajax.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.minse0.spring.test.ajax.domain.Reservation;
import com.minse0.spring.test.ajax.repository.ReservationRepository;

@Service
public class ReservationService {
	@AutoWired
	private ReservationRepository reservationRepository;
	
	public  List<Reservation> getReservationList(){
		List<Reservation> reservationList = reservationRepository.selectReservationList();
		
		return reservationList;
	}
	
	public int deleteReservation(int id) {
		int count = reservationRepository.deleteReservation(id);
		
		return count;
	}
}
