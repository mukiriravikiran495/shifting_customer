package com.bookingservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingservice.domain.CustomerBookingResponseDTO;
import com.bookingservice.domain.MyBookingsDTO;
import com.bookingservice.entity.MyBookings;
import com.bookingservice.mapper.CustomerBookingsMapper;
import com.bookingservice.mapper.MyBookingsMapper;
import com.bookingservice.repository.CustomerBookingsRepository;
import com.bookingservice.repository.MyBookingsRepository;

@Service("MyBookingsService")
public class MyBookingsServiceImpl implements MyBookingsService{

	private final MyBookingsRepository repository;
	
	@Autowired
	CustomerBookingsRepository custRepository;
	
	
	private final MyBookingsMapper mapper;
	
	@Autowired
	CustomerBookingsMapper customerMapper;
	
	@Autowired
	public MyBookingsServiceImpl(MyBookingsRepository repository, MyBookingsMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	@Override
	public List<MyBookingsDTO> getall() {
		
		List<MyBookings> list = repository.findAllWithCustomerAndVendor();

			return mapper.toDtoList(list);
		
	}
	
	public List<CustomerBookingResponseDTO> getBookingsByCustomerId(Long custId) {
        List<MyBookings> bookings = custRepository.findByCustomerDetails_CustId(custId);
        return customerMapper.toCustomerBookingDTOs(bookings);
    }

}
