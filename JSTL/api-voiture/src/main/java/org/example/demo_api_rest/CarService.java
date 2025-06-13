package org.example.demo_api_rest;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CarService {
    public Car save(int id, String brand, String year, String color) {
        return new Car(id, brand, year, color);
    }

    public Car get(int id){

    };

}

