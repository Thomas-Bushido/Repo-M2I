package org.example;

import java.util.HashMap;
import java.util.Map;

public class BigFactory {
    private Map<String,JouetFactory> factoryMap = new HashMap<>();

    public void enregistrerFactory(String typeFactory, JouetFactory factory){
        factoryMap.put(typeFactory,factory);
    }


    public Jouet produireJouet(String typeJouet){
        JouetFactory factory = factoryMap.get(typeJouet);
        Jouet jouet = factory.createJouet();
        return jouet;

    }


}

