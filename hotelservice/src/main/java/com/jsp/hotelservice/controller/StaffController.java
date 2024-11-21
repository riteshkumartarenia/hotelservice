package com.jsp.hotelservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/staffs")
public class StaffController {

    private List<String> staffs;

    @GetMapping
    List<String> getStaffs(){
        return Arrays.asList("Ram","Shyam","Hari","Sita");
    }
    
}
