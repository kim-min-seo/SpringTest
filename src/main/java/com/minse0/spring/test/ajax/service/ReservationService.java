package com.minse0.spring.test.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minse0.spring.test.ajax.domain.Reservation;
import com.minse0.spring.test.ajax.repository.ReservationRepository;

@Service
public class ReservationService {
	@Autowired
	private ReservationRepository reservationRepository;
	
	public  List<Reservation> getReservationList(){
		List<Reservation> reservationList = reservationRepository.selectReservationList();
		
		return reservationList;
	}
	
	 public int createReservation(
	            String name,
	            String date,
	            int day,
	            int headcount,
	            String phoneNumber,
	            String state
	    ) {
	        int count = reservationRepository.insertReservation(
	            name, date, day, headcount, phoneNumber, state
	        );
	        return count;
	    }
	
	public int deleteReservation(int id) {
		int count = reservationRepository.deleteReservation(id);
		
		return count;
	}
	
	 public Reservation getByNameAndPhone(String name, String phoneNumber) {
	        return reservationRepository.selectReservationByNameAndPhone(name, phoneNumber);
	    }
}
