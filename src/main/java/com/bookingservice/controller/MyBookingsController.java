package com.bookingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookingservice.domain.CustomerBookingResponseDTO;
import com.bookingservice.domain.MyBookingsDTO;
import com.bookingservice.service.MyBookingsService;

@RestController
@RequestMapping( path = "/v1/api/bookings")
public class MyBookingsController {

	private final MyBookingsService service;
	
	
	@Autowired
	public MyBookingsController(MyBookingsService service) {
		this.service = service;
	}
	
	@GetMapping( value = "/getall")
	public List<MyBookingsDTO> getbookings(){
		return service.getall();
	}
	
	@GetMapping("/customer/{custId}")
    public ResponseEntity<List<CustomerBookingResponseDTO>> getBookingsByCustomer(@PathVariable Long custId) {
        List<CustomerBookingResponseDTO> bookings = service.getBookingsByCustomerId(custId);
        return ResponseEntity.ok(bookings);
    }
}
