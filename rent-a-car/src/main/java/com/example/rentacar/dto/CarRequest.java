package com.example.rentacar.dto;

import lombok.Data;

@Data
public class CarRequest {
    private String brand;
    private String model;
    private int year;
    private double dailyPrice;
    private boolean available;
}