package com.jsp.hotelservice.controller;

import com.jsp.hotelservice.constants.MappingConstants;
import com.jsp.hotelservice.entity.Hotel;
import com.jsp.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hotels")
public class HotelController {

    @Autowired
    private HotelService service;

    @PostMapping(value = MappingConstants.SAVE_HOTEL)
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return service.create(hotel);
    }

    @PostMapping(value = MappingConstants.SAVE_ALL_HOTELS)
    public List<Hotel> createAllHotel(@RequestBody List<Hotel> list) {
        return service.createAll(list);
    }

    @GetMapping(value = MappingConstants.FIND_ALL_HOTELS)
    public List<Hotel> getAllHotel() {
        return service.getAllHotel();
    }

    @GetMapping(value = MappingConstants.FIND_BY_ID)
    public Hotel getHotelById(@PathVariable("hotel_id") int id) {
        return service.getHotelById(id);
    }

    @DeleteMapping(value = MappingConstants.DELETE_ALL_HOTELS)
    public void deleteAll() {
        service.deleteAll();
    }

    @DeleteMapping(value = MappingConstants.DELETE_HOTEL)
    public void deleteById(@PathVariable("hotelId") int id) {
        service.deleteById(id);
    }
}
