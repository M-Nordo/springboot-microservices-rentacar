package com.example.rentacar.service;

import com.example.rentacar.dto.CarRequest;
import com.example.rentacar.dto.CarResponse;

import java.util.List;

public interface CarService {
    CarResponse createCar(CarRequest request);
    List<CarResponse> getAllCars();
    CarResponse getCarById(Long id);
    CarResponse updateCar(Long id, CarRequest request);
    void deleteCar(Long id);
}