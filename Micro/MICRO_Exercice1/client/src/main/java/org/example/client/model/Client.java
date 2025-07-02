package org.example.client.model;

public class Client {
    private Integer id;
    private String firstName;
    private String lastName;
    private String adresse;

    public Client(Integer id, String firstName, String lastName, String adresse) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adresse = adresse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
