package org.example;

public class MuppetFactory extends JouetFactory {
    public Jouet createJouet(){
        return new Muppet();
    }
}
