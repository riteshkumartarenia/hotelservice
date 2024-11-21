package com.jsp.hotelservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "micro_hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "about")
    private String about;
}
