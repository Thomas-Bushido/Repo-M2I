package org.example;

import java.util.Scanner;

public class Exercice55 {
    public static void main(String[] args) {
        /*Exercice : volume d'un cercle
1. Créer un programme qui permet de calculer le volume d'un cône
2. La formule est la suivante : 1/3 × π × r² × h
Saisir un rayon : 4
Saisir une hauteur : 7
Le volume du cône est de 117,29 cm3
*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculer le volume d'un cercle: \n Saisissez le rayon:");
        double rayon = scanner.nextInt();
        System.out.println("Saisissez la hauteur:");
        double hauteur = scanner.nextInt();

        double calcul =  (Math.PI*(rayon*rayon)*hauteur)/3;
        System.out.println("Le résultat est: " + calcul);

    }
}
