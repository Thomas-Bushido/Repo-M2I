package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ville {
    private String nom;


    public Ville() {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String search(String nom) {

        List<String> villes = new ArrayList<>();
        villes.add("Paris");
        villes.add("Budapest");
        villes.add("Skopje");
        villes.add("Rotterdam");

        for (String ville : villes) {
            if (Objects.equals(ville, nom)) {
                return ville;
            }
            /*else if (nom.length()<=2) {
                return "Une exception est levée de type NotFoundException";
            } else {
                return villes.toString();
            }
            */

        }
        return "pas de ville trouvée";

    }

}

