package org.example;

public class Main {
    public static void main(String[] args) {
        // FACTORY JOUET
        // OBSERVER LUTIN
        // DECORATOR JOUET
BigFactory factory1 = new BigFactory();
        BigFactory factory2 = new BigFactory();
factory1.enregistrerFactory("muppet", new MuppetFactory());
        factory2.enregistrerFactory("car", new CarFactory());


    }
}
