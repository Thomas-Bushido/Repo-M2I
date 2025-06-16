package org.example.demo_api_rest.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.demo_api_rest.model.Car;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CarService {

    private final List<Car> cars = new ArrayList<>();
    private long currentId = 1;


    public void create(Car car) {
         car.setId(currentId++);
         cars.add(car);
    }

    public List<Car> findAll(){
        return cars;
    }
    public Car findById(Long id){

        for(Car c: cars){
            if(c.getId()== id){
                return c;
            }
        }
        return null;
    }

    public Car update(Car carUpdate){
        Car car = findById(carUpdate.getId());
        car.setBrand(carUpdate.getBrand());
        car.setYear(carUpdate.getYear());
        car.setColor(carUpdate.getColor());
        return car;
    }
    public void delete(Long id){
        cars.remove(findById(id)
        );

    }
}

