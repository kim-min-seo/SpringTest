package com.minse0.spring.test.ajax.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.minse0.spring.test.ajax.domain.Reservation;

@Mapper
public interface ReservationRepository {
	public List<Reservation> selectReservationList();
	
	public int insertResrvation(
			@Param("name") String name
			, @Param("date") String date
			, @Param("day") int day
			, @Param("headcount") int headcount
			, @Param("phoneNumber") String phoneNumber
			, @Param("state") String state
			
			);
	
	public int deleteReservation(@Param("id") int id);
	
}
