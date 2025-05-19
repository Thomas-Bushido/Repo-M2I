package org.example;

import java.util.Scanner;

public class Exercice57 {
    public static void main(String[] args) {
      /*  Exercice : Périmètre et aire d'un carré
        1. Saisir la longueur du côté du carré et la stocker dans une variable
        2. Calculer l'aire et le périmètre du carré
        Saisir la longueur d'un côté : 5
        Le périmètre du carré est de : 20cm
        L'aire du carré est de : 25cm carré
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculer le périmètre et l'air du carré: \n Saisissez la longueur du carré:");
        double longueur = scanner.nextInt();


        double air =  longueur*longueur;
        System.out.println("L'air du carré est: " + air + " cm carré");
        double perimetre =  longueur*4;
        System.out.println("Le périmètre du carré est: " + perimetre + " cm" );

    }
}
