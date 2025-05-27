package org.example.model;

import lombok.Getter;
import lombok.Setter;

public class Animal {

    @Getter
    @Setter
    private int id;
    private String name;
    private String species;



    public Animal() {
    }

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public Animal(int id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getspecies() {
        return species;
    }

    public void setspecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", Espèce='" + species + '\'' +
                '}';
    }
}
