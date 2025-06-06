package com.bookingservice.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.bookingservice.domain.CustAddressDTO;
import com.bookingservice.domain.CustomerDetailsDTO;
import com.bookingservice.domain.MyBookingsDTO;
import com.bookingservice.domain.VendorAddressDTO;
import com.bookingservice.domain.VendorDetailsDTO;
import com.bookingservice.entity.CustAddress;
import com.bookingservice.entity.CustomerDetails;
import com.bookingservice.entity.MyBookings;
import com.bookingservice.entity.VendorAddress;
import com.bookingservice.entity.VendorDetails;

@Mapper(componentModel = "spring")
public interface MyBookingsMapper {

	
	@Mapping(target = "customerDetails.bookings", ignore = true) // Add this
    @Mapping(target = "vendorDetails.bookings", ignore = true)   // Add this
	MyBookingsDTO toDto(MyBookings booking);

	List<MyBookingsDTO> toDtoList(List<MyBookings> bookings);

	@Mapping(target = "custAddress", source = "custAddress")
	CustomerDetailsDTO toDto(CustomerDetails entity);

	@Mapping(target = "vendorAddress", source = "vendorAddress")
	VendorDetailsDTO toDto(VendorDetails entity);

	@Mapping(source = "c_address_id", target = "c_address_Id")
	CustAddressDTO toCustAddressDTO(CustAddress custAddress);

	List<CustAddressDTO> toCustAddressDTOList(List<CustAddress> addresses);

	@Mapping(source = "v_address_id", target = "v_address_Id")
	VendorAddressDTO toVendorAddressDTO(VendorAddress vendorAddress);

	List<VendorAddressDTO> toVendorAddressDTOList(List<VendorAddress> addresses);

}
