package com.example.poo2presenca23032020.service;

import java.util.ArrayList;

import com.example.poo2presenca23032020.model.Car;
import com.example.poo2presenca23032020.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CarService
 */
@Service
public class CarService {
    @Autowired
    private CarRepository cr;

    public ArrayList<Car> getCars() {
        ArrayList<Car> cars = new ArrayList<>(cr.getCars().values());
        
        return cars;
    }

    public Car getCarById(int id) {
        Car car = cr.getCarById(id);

        if (car == null) {
            throw new RuntimeException("Id Invalido para Carro!");
        }
        return car;
    }

}