package org.example.demo_api_rest;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/car")
public class CarResources {

    private CarService carService;

    @Inject
    public CarResources(CarService carService){
        this.carService = carService;
    }

    @GET
    @Path("/createcars")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> createCars(){
        return carService.carsAdd(1,"X","1999", "color");
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

