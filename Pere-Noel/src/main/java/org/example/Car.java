package org.example;

public class Car implements Jouet {


    @Override
    public String createJouet() {
        return "voiture créé";
    }

    public void particularity(){
        System.out.println("Girophare intégré");
    }
}
