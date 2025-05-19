package org.example.TPpapeterie;

public class Ramette extends ArticleUnitaire {

    private double grammage;

    public Ramette(String uniqueRef, String nom, double prixUnitaire, double grammage) {
        super(uniqueRef, nom, prixUnitaire);
        this.grammage = grammage;
    }

    public double getGrammage() {
        return grammage;
    }

    public void setGrammage(double grammage) {
        this.grammage = grammage;
    }


    }
}
