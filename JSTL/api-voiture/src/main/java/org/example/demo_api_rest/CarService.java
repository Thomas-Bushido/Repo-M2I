package org.example.demo_api_rest;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CarService {

    private List<Car> cars = new ArrayList<>();


    public List<Car> carsAdd(int id, String brand, String year, String color) {
         cars.add(new Car(id,brand,year,color));
         return cars;
    }
}

