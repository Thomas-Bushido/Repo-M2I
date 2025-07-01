package org.example.model;

import java.util.HashMap;

public class Shop {
    private int selliIn;
    private double quality;



    public int getSelliIn() {
        return selliIn;
    }

    public void setSelliIn(int selliIn) {
        this.selliIn = selliIn;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }

    public void update(HashMap<>){

        if(selliIn > 0 && quality >= 0){
            selliIn--;
            quality--;
            quality--;

        }
    }



}

