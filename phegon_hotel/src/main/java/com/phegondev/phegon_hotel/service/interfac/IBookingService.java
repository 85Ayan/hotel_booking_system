package com.phegondev.phegon_hotel.service.interfac;

import com.phegondev.phegon_hotel.dto.Response;
import com.phegondev.phegon_hotel.entity.Booking;

public interface IBookingService {

     Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
