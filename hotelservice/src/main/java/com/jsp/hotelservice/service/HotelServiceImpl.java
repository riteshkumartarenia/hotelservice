package com.jsp.hotelservice.service;

import com.jsp.hotelservice.entity.Hotel;
import com.jsp.hotelservice.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository repository;

    @Override
    public Hotel create(Hotel hotel) {
        return repository.save(hotel);
    }

    @Override
    public List<Hotel> createAll(List<Hotel> list) {
        return repository.saveAll(list);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return repository.findAll();
    }

    @Override
    public Hotel getHotelById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
