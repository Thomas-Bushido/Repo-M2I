package org.example;

public class Muppet implements Jouet {


    @Override
    public String createJouet() {
        return "Muppets créé";
    }

    public void particularity(){
        System.out.println("Micro intégré");
    }
}
