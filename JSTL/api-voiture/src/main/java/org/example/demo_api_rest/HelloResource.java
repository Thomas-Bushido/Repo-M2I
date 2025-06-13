package org.example.demo_api_rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.awt.*;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

    @GET
    @Path("hello-you")
    @Produces("text/plain")
    public String helloYou(){
        return "hello, you !!!";
    }

    @GET
    @Path("/hello-goodbye")
    @Produces("application/json")
    public String helloJson(){
        return "Hello, Json";
    }

    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public String json(){
        return "Encore du Json !!!";
    }
}