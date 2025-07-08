package com.example.rentacar.mapper;

import com.example.rentacar.dto.*;
import com.example.rentacar.entity.Car;

public class CarMapper {

    public static CarResponse toResponse(Car car) {
        return CarResponse.builder()
                .id(car.getId())
                .brand(car.getBrand())
                .model(car.getModel())
                .year(car.getYear())
                .dailyPrice(car.getDailyPrice())
                .available(car.isAvailable())
                .build();
    }
}