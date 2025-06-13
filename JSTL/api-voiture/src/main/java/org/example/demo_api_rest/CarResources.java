package org.example.demo_api_rest;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/car")
public class CarResources {

    private CarService carService;

    @Inject
    public CarResources(CarService carService){
        this.carService = carService;
    }
    @GET
    @Path("/carlist")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> getAll(){
        return new ArrayList<>();
    }



    @GET
    @Path("/carbyid")
    @Produces(MediaType.APPLICATION_JSON)
    public Car getCarById(int id){
        return carService.get(id);
    }

    @DELETE
    @Path("/delete{id}")
    public int delete(@PathParam("id") int id){
        return id;
    }


}

