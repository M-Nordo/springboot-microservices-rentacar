package com.example.rentacar.service.impl;

import com.example.rentacar.dto.CarRequest;
import com.example.rentacar.dto.CarResponse;
import com.example.rentacar.entity.Car;
import com.example.rentacar.repository.CarRepository;
import com.example.rentacar.service.CarService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public CarResponse createCar(CarRequest request) {
        Car car = Car.builder()
                .brand(request.getBrand())
                .model(request.getModel())
                .year(request.getYear())
                .dailyPrice(request.getDailyPrice())
                .available(request.isAvailable())
                .build();

        Car saved = carRepository.save(car);

        return mapToResponse(saved);
    }

    @Override
    public List<CarResponse> getAllCars() {
        return carRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public CarResponse getCarById(Long id) {
        Car car = carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found"));
        return mapToResponse(car);
    }

    @Override
    public CarResponse updateCar(Long id, CarRequest request) {
        Car car = carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found"));

        car.setBrand(request.getBrand());
        car.setModel(request.getModel());
        car.setYear(request.getYear());
        car.setDailyPrice(request.getDailyPrice());
        car.setAvailable(request.isAvailable());

        Car updated = carRepository.save(car);
        return mapToResponse(updated);
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    private CarResponse mapToResponse(Car car) {
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