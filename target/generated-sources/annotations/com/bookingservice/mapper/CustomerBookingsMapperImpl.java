package com.bookingservice.mapper;

import com.bookingservice.domain.CustomerBookingResponseDTO;
import com.bookingservice.entity.MyBookings;
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
public class CustomerBookingsMapperImpl implements CustomerBookingsMapper {

    @Override
    public CustomerBookingResponseDTO toCustomerBookingDTO(MyBookings booking) {
        if ( booking == null ) {
            return null;
        }

        CustomerBookingResponseDTO customerBookingResponseDTO = new CustomerBookingResponseDTO();

        customerBookingResponseDTO.setBooking_id( booking.getBooking_id() );
        customerBookingResponseDTO.setStatus( booking.getStatus() );
        customerBookingResponseDTO.setBOOKING_DATE( booking.getBOOKING_DATE() );
        customerBookingResponseDTO.setSCHEDULED_DATE( booking.getSCHEDULED_DATE() );
        customerBookingResponseDTO.setPICKUP_TIME_SLOT( booking.getPICKUP_TIME_SLOT() );
        customerBookingResponseDTO.setDELIVERY_DATE( booking.getDELIVERY_DATE() );
        customerBookingResponseDTO.setSERVICE_TYPE( booking.getSERVICE_TYPE() );
        customerBookingResponseDTO.setITEM_COUNT( booking.getITEM_COUNT() );
        customerBookingResponseDTO.setESTIMATED_WEIGHT( booking.getESTIMATED_WEIGHT() );
        customerBookingResponseDTO.setESTIMATED_COST( booking.getESTIMATED_COST() );
        customerBookingResponseDTO.setDISCOUNT_AMOUNT( booking.getDISCOUNT_AMOUNT() );
        customerBookingResponseDTO.setFINAL_COST( booking.getFINAL_COST() );
        customerBookingResponseDTO.setPAYMENT_STATUS( booking.getPAYMENT_STATUS() );
        customerBookingResponseDTO.setPAYMENT_MODE( booking.getPAYMENT_MODE() );
        customerBookingResponseDTO.setTRANSACTION_ID( booking.getTRANSACTION_ID() );
        customerBookingResponseDTO.setBOOKING_STATUS( booking.getBOOKING_STATUS() );
        customerBookingResponseDTO.setVEHICLE_NUMBER( booking.getVEHICLE_NUMBER() );
        customerBookingResponseDTO.setTRACKING_URL( booking.getTRACKING_URL() );
        customerBookingResponseDTO.setOTP_FOR_DELIVERY( booking.getOTP_FOR_DELIVERY() );
        customerBookingResponseDTO.setCREATED_AT( booking.getCREATED_AT() );
        customerBookingResponseDTO.setCREATED_BY( booking.getCREATED_BY() );
        customerBookingResponseDTO.setUPDATED_AT( booking.getUPDATED_AT() );
        customerBookingResponseDTO.setUPDATED_BY( booking.getUPDATED_BY() );
        customerBookingResponseDTO.setCustomerDetails( booking.getCustomerDetails() );

        return customerBookingResponseDTO;
    }

    @Override
    public List<CustomerBookingResponseDTO> toCustomerBookingDTOs(List<MyBookings> bookings) {
        if ( bookings == null ) {
            return null;
        }

        List<CustomerBookingResponseDTO> list = new ArrayList<CustomerBookingResponseDTO>( bookings.size() );
        for ( MyBookings myBookings : bookings ) {
            list.add( toCustomerBookingDTO( myBookings ) );
        }

        return list;
    }
}
