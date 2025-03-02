package com.phegondev.phegon_hotel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phegondev.phegon_hotel.entity.Booking;
import java.util.List;
import java.util.Optional;


public interface BookingRepository extends JpaRepository<Booking, Long> {


    List<Booking> findByRoomId(Long roomId);

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);

    List<Booking> findByUserId(Long userId);


    
} 
