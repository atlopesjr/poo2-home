package com.example.poo2presenca23032020.service;

import java.util.HashMap;

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
    
    public HashMap<Integer,Car> getCars(){
        HashMap<Integer,Car> cars = cr.getCars();

        if(cars != null){
            return cars;
        }
        return null;
    }

    public Car getCarById(int id){
        Car car = cr.getCarById(id);

        if(car == null){
            throw new RuntimeException("Id Invalido para Carro!");
        }
        return car;
    }
}