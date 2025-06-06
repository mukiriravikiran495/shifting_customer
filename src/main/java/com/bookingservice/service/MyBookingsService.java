package com.bookingservice.service;

import java.util.List;

import com.bookingservice.domain.CustomerBookingResponseDTO;
import com.bookingservice.domain.MyBookingsDTO;

public interface MyBookingsService {

	
	List<MyBookingsDTO> getall();

	List<CustomerBookingResponseDTO> getBookingsByCustomerId(Long custId);

}
