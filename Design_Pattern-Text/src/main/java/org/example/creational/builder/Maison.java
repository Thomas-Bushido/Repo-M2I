package org.example.Design_Pattern.src.main.java.org.example.creational.builder;

public class Maison {

    private double superficie;
    private int nbPieces;
    private int nbEtages;
    boolean piscine;
    private String typeToiture;
    private String couleur;

    public Maison(double superficie, int nbPieces, int nbEtages, boolean piscine, String typeToiture, String couleur) {
        this.superficie = superficie;
        this.nbPieces = nbPieces;
        this.nbEtages = nbEtages;
        this.piscine = piscine;
        this.typeToiture = typeToiture;
        this.couleur = couleur;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    public int getNbEtages() {
        return nbEtages;
    }

    public void setNbEtages(int nbEtages) {
        this.nbEtages = nbEtages;
    }

    public boolean isPiscine() {
        return piscine;
    }

    public void setPiscine(boolean piscine) {
        this.piscine = piscine;
    }

    public String getTypeToiture() {
        return typeToiture;
    }

    public void setTypeToiture(String typeToiture) {
        this.typeToiture = typeToiture;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public static class Builder {
        private double superficie;
        private int nbPieces;
        private int nbEtages;
        boolean piscine;
        private String typeToiture;
        private String couleur;
    }

    public Maison superficie(double superficie){
        this.superficie = superficie;
        return this;
    }

    public Maison nbPieces(int nbPieces){
        this.nbPieces = nbPieces;
        return this;
    }
    public Maison nbEtages(int nbEtages){
        this.nbEtages = nbEtages;
        return this;
    }
    public Maison piscine(boolean piscine){
        this.piscine = piscine;
        return this;
    }
    public Maison typeToiture(String typeToiture){
        this.typeToiture = typeToiture;
        return this;
    }
    public Maison couleur(String couleur){
        this.couleur = couleur;
        return this;
    }




}

