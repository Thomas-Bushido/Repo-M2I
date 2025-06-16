package org.example.demo_api_rest.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.demo_api_rest.model.Car;
import org.example.demo_api_rest.service.CarService;

import java.util.List;

@Path("/car")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarResources {

    private final CarService carService;

    @Inject
    public CarResources(CarService carService){
        this.carService = carService;
    }

    @GET
    @Path("/findcars")
    public List<Car> findAll(){
        return carService.findAll();
    }

    @GET
    @Path("/{id}")
    public Car findById(@PathParam("id") Long id){
        return carService.findById(id);
    }

    @POST
    public Car create(Car car){
        carService.create(car);
        return car;
    }

    @PUT
    @Path("/{id}")
    public Car update (@PathParam("id") Long id, Car car){
        car.setId(id);
        return carService.update(car);
    }



/*

    @GET
    @Path("/carbyid")
    @Produces(MediaType.APPLICATION_JSON)
    public Car getId(int id){
        return carService.get(id);
    }
*/
    @DELETE
    @Path("/delete{id}")
    public int delete(@PathParam("id") int id){
        return id;
    }


}

