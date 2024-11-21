package com.jsp.hotelservice.service;

import com.jsp.hotelservice.entity.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> createAll(List<Hotel> list);

    List<Hotel> getAllHotel();

    Hotel getHotelById(int id);

    void deleteAll();

    void deleteById(int id);
}
