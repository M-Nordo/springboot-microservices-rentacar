package com.example.rentacar.service;

import com.example.rentacar.dto.CarRequest;
import com.example.rentacar.entity.Car;
import com.example.rentacar.repository.CarRepository;
import com.example.rentacar.service.impl.CarServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class CarServiceTest {

    private final CarRepository carRepository = Mockito.mock(CarRepository.class);
    private final CarService carService = new CarServiceImpl(carRepository);

    @Test
    void shouldReturnEmptyListWhenNoCars() {
        Mockito.when(carRepository.findAll()).thenReturn(Collections.emptyList());
        assertThat(carService.getAllCars()).isEmpty();
    }

    @Test
    void shouldCreateCar() {
        CarRequest request = new CarRequest();
        request.setBrand("BMW");
        request.setModel("3 Series");
        request.setYear(2020);
        request.setDailyPrice(800);
        request.setAvailable(true);

        Car car = Car.builder()
                .id(1L)
                .brand(request.getBrand())
                .model(request.getModel())
                .year(request.getYear())
                .dailyPrice(request.getDailyPrice())
                .available(request.isAvailable())
                .build();

        Mockito.when(carRepository.save(Mockito.any())).thenReturn(car);

        assertThat(carService.createCar(request).getBrand()).isEqualTo("BMW");
    }
}