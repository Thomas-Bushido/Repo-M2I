package org.example.demo_api_rest;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

//annotation @applicatinoPath est appliqué à une classe qui extends Application
//Le chemin de @Application indique l'url de base où se trouve les ressources JAX-RS

@ApplicationPath("/api")
public class HelloApplication extends Application {

}