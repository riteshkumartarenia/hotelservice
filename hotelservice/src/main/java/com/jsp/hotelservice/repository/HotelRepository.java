package com.jsp.hotelservice.repository;

import com.jsp.hotelservice.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
