package com.example.poo2presenca23032020.controller;

import java.util.HashMap;

import com.example.poo2presenca23032020.model.Car;
import com.example.poo2presenca23032020.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * CarController
 */
@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService cs;

    @GetMapping("")
    public ModelAndView getCars() {
        HashMap<Integer, Car> cars = cs.getCars();
        ModelAndView mv = new ModelAndView("cars");

        mv.addObject("cars", cars);
        return mv;
    }

    @GetMapping("/{carId}")
    public ModelAndView getCarById(@PathVariable("carId") int id) {
        Car car = cs.getCarById(id);
        ModelAndView mv = new ModelAndView("car-id");

        mv.addObject("car", car);
        return mv;
    }
    

}