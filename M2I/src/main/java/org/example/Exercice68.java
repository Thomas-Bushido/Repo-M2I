package org.example;

import java.util.Scanner;

public class Exercice68 {
    public static void main(String[] args) {
       /* Exercice : majeur ou mineur
        1. Créer une variable age
        2. Affecter une valeur à la variable age
        3. Créer une condition qui permet d'afficher si la personne est
        majeure ou mineure
        Saisir un âge : 23
        Vous êtes majeur, vous pouvez rentrer dans le club.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez votre age:");
        int age = scanner.nextInt();

        if(age<18){
            System.out.println("Désolé, réessayez plus tard!");
        } else {
            System.out.println("C'est ok, bienvenue au club!");
        }

    }
}
