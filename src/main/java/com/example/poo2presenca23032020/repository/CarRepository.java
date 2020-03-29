package com.example.poo2presenca23032020.repository;

import java.util.HashMap;

import com.example.poo2presenca23032020.model.Car;

import org.springframework.stereotype.Repository;

/**
 * CarRepository
 */
@Repository
public class CarRepository {
    public HashMap<Integer,Car> hm = new HashMap<>();
    
    public CarRepository(){
        hm.put(1, new Car(1, "Volvo", "XC 60", "Branca", 250.000));
        hm.put(2, new Car(2, "Volvo", "XC 60", "Chumbo", 255.000));
        hm.put(3, new Car(3, "Honda", "Civic", "Branca", 65.000));
        hm.put(4, new Car(4, "Ford", "Focus", "Branca", 60.000));
        hm.put(5, new Car(5, "Fiat", "Uno", "Branca", 50.000));
    }

    public Car getCarById(int id){
        return hm.get(id);
    }

    public HashMap<Integer,Car> getCars(){
        return hm;
    }
}