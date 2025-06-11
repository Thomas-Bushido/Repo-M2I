package org.example.exercice3.model;

public class Cat {

    private String name;
    private String race;
    private String food;
    private String date;

    public Cat(String name, String race, String food, String date) {
        this.name = name;
        this.race = race;
        this.food = food;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
