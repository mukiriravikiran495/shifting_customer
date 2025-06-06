package com.bookingservice.mapper;

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
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-06T17:45:16+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.v20250213-1140, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class MyBookingsMapperImpl implements MyBookingsMapper {

    @Override
    public MyBookingsDTO toDto(MyBookings booking) {
        if ( booking == null ) {
            return null;
        }

        MyBookingsDTO myBookingsDTO = new MyBookingsDTO();

        myBookingsDTO.setBooking_id( booking.getBooking_id() );
        myBookingsDTO.setStatus( booking.getStatus() );
        myBookingsDTO.setBOOKING_DATE( booking.getBOOKING_DATE() );
        myBookingsDTO.setSCHEDULED_DATE( booking.getSCHEDULED_DATE() );
        myBookingsDTO.setPICKUP_TIME_SLOT( booking.getPICKUP_TIME_SLOT() );
        myBookingsDTO.setDELIVERY_DATE( booking.getDELIVERY_DATE() );
        myBookingsDTO.setSERVICE_TYPE( booking.getSERVICE_TYPE() );
        myBookingsDTO.setITEM_COUNT( booking.getITEM_COUNT() );
        myBookingsDTO.setESTIMATED_WEIGHT( booking.getESTIMATED_WEIGHT() );
        myBookingsDTO.setESTIMATED_COST( booking.getESTIMATED_COST() );
        myBookingsDTO.setDISCOUNT_AMOUNT( booking.getDISCOUNT_AMOUNT() );
        myBookingsDTO.setFINAL_COST( booking.getFINAL_COST() );
        myBookingsDTO.setPAYMENT_STATUS( booking.getPAYMENT_STATUS() );
        myBookingsDTO.setPAYMENT_MODE( booking.getPAYMENT_MODE() );
        myBookingsDTO.setTRANSACTION_ID( booking.getTRANSACTION_ID() );
        myBookingsDTO.setBOOKING_STATUS( booking.getBOOKING_STATUS() );
        myBookingsDTO.setVEHICLE_NUMBER( booking.getVEHICLE_NUMBER() );
        myBookingsDTO.setTRACKING_URL( booking.getTRACKING_URL() );
        myBookingsDTO.setOTP_FOR_DELIVERY( booking.getOTP_FOR_DELIVERY() );
        myBookingsDTO.setCREATED_AT( booking.getCREATED_AT() );
        myBookingsDTO.setCREATED_BY( booking.getCREATED_BY() );
        myBookingsDTO.setUPDATED_AT( booking.getUPDATED_AT() );
        myBookingsDTO.setUPDATED_BY( booking.getUPDATED_BY() );
        myBookingsDTO.setCustomerDetails( customerDetailsToCustomerDetails( booking.getCustomerDetails() ) );
        myBookingsDTO.setVendorDetails( vendorDetailsToVendorDetails( booking.getVendorDetails() ) );

        return myBookingsDTO;
    }

    @Override
    public List<MyBookingsDTO> toDtoList(List<MyBookings> bookings) {
        if ( bookings == null ) {
            return null;
        }

        List<MyBookingsDTO> list = new ArrayList<MyBookingsDTO>( bookings.size() );
        for ( MyBookings myBookings : bookings ) {
            list.add( toDto( myBookings ) );
        }

        return list;
    }

    @Override
    public CustomerDetailsDTO toDto(CustomerDetails entity) {
        if ( entity == null ) {
            return null;
        }

        CustomerDetailsDTO customerDetailsDTO = new CustomerDetailsDTO();

        customerDetailsDTO.setCustAddress( toCustAddressDTO( entity.getCustAddress() ) );
        customerDetailsDTO.setC_firstName( entity.getC_firstName() );
        customerDetailsDTO.setC_lastName( entity.getC_lastName() );
        customerDetailsDTO.setC_mobile( entity.getC_mobile() );
        customerDetailsDTO.setC_email( entity.getC_email() );

        return customerDetailsDTO;
    }

    @Override
    public VendorDetailsDTO toDto(VendorDetails entity) {
        if ( entity == null ) {
            return null;
        }

        VendorDetailsDTO vendorDetailsDTO = new VendorDetailsDTO();

        vendorDetailsDTO.setVendorAddress( toVendorAddressDTO( entity.getVendorAddress() ) );
        vendorDetailsDTO.setVendor_id( String.valueOf( entity.getVendor_id() ) );
        vendorDetailsDTO.setV_firstName( entity.getV_firstName() );
        vendorDetailsDTO.setV_lastName( entity.getV_lastName() );
        vendorDetailsDTO.setV_mobile( entity.getV_mobile() );
        vendorDetailsDTO.setV_email( entity.getV_email() );

        return vendorDetailsDTO;
    }

    @Override
    public CustAddressDTO toCustAddressDTO(CustAddress custAddress) {
        if ( custAddress == null ) {
            return null;
        }

        CustAddressDTO custAddressDTO = new CustAddressDTO();

        custAddressDTO.setC_address_Id( String.valueOf( custAddress.getC_address_id() ) );
        custAddressDTO.setC_address1( custAddress.getC_address1() );
        custAddressDTO.setC_city( custAddress.getC_city() );
        custAddressDTO.setC_state( custAddress.getC_state() );
        custAddressDTO.setC_zipcode( custAddress.getC_zipcode() );

        return custAddressDTO;
    }

    @Override
    public List<CustAddressDTO> toCustAddressDTOList(List<CustAddress> addresses) {
        if ( addresses == null ) {
            return null;
        }

        List<CustAddressDTO> list = new ArrayList<CustAddressDTO>( addresses.size() );
        for ( CustAddress custAddress : addresses ) {
            list.add( toCustAddressDTO( custAddress ) );
        }

        return list;
    }

    @Override
    public VendorAddressDTO toVendorAddressDTO(VendorAddress vendorAddress) {
        if ( vendorAddress == null ) {
            return null;
        }

        VendorAddressDTO vendorAddressDTO = new VendorAddressDTO();

        vendorAddressDTO.setV_address_Id( String.valueOf( vendorAddress.getV_address_id() ) );
        vendorAddressDTO.setV_address1( vendorAddress.getV_address1() );
        vendorAddressDTO.setV_city( vendorAddress.getV_city() );
        vendorAddressDTO.setV_state( vendorAddress.getV_state() );
        vendorAddressDTO.setV_zipcode( vendorAddress.getV_zipcode() );

        return vendorAddressDTO;
    }

    @Override
    public List<VendorAddressDTO> toVendorAddressDTOList(List<VendorAddress> addresses) {
        if ( addresses == null ) {
            return null;
        }

        List<VendorAddressDTO> list = new ArrayList<VendorAddressDTO>( addresses.size() );
        for ( VendorAddress vendorAddress : addresses ) {
            list.add( toVendorAddressDTO( vendorAddress ) );
        }

        return list;
    }

    protected CustomerDetails customerDetailsToCustomerDetails(CustomerDetails customerDetails) {
        if ( customerDetails == null ) {
            return null;
        }

        CustomerDetails customerDetails1 = new CustomerDetails();

        customerDetails1.setCustId( customerDetails.getCustId() );
        customerDetails1.setC_firstName( customerDetails.getC_firstName() );
        customerDetails1.setC_lastName( customerDetails.getC_lastName() );
        customerDetails1.setC_mobile( customerDetails.getC_mobile() );
        customerDetails1.setC_email( customerDetails.getC_email() );
        customerDetails1.setCustAddress( customerDetails.getCustAddress() );

        return customerDetails1;
    }

    protected VendorDetails vendorDetailsToVendorDetails(VendorDetails vendorDetails) {
        if ( vendorDetails == null ) {
            return null;
        }

        VendorDetails vendorDetails1 = new VendorDetails();

        vendorDetails1.setVendor_id( vendorDetails.getVendor_id() );
        vendorDetails1.setV_firstName( vendorDetails.getV_firstName() );
        vendorDetails1.setV_lastName( vendorDetails.getV_lastName() );
        vendorDetails1.setV_mobile( vendorDetails.getV_mobile() );
        vendorDetails1.setV_email( vendorDetails.getV_email() );
        vendorDetails1.setVendorAddress( vendorDetails.getVendorAddress() );

        return vendorDetails1;
    }
}
