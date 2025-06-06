package com.bookingservice.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.bookingservice.domain.CustomerBookingResponseDTO;
import com.bookingservice.entity.MyBookings;




@Mapper(componentModel = "spring")
public interface CustomerBookingsMapper {

	CustomerBookingResponseDTO toCustomerBookingDTO(MyBookings booking);
	public List<CustomerBookingResponseDTO> toCustomerBookingDTOs(List<MyBookings> bookings);
	
}
