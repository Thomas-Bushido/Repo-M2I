package org.example;

public class CarFactory extends JouetFactory {
    public Jouet createJouet(){
        return new Car();
    }
}
