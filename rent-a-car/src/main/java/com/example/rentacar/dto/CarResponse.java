package com.example.rentacar.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarResponse {
    private Long id;
    private String brand;
    private String model;
    private int year;
    private double dailyPrice;
    private boolean available;
}