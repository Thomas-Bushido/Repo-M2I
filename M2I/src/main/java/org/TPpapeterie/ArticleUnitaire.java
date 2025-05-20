package org.example.TPpapeterie;

public class
ArticleUnitaire extends Articles{
private String nom;
private double prixUnitaire;

    public ArticleUnitaire(String uniqueRef, String nom, double prixUnitaire) {
        /*super(uniqueRef);*/
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }







}

