package org.example;

public class Exercice52 {
    public static void main(String[] args) {
            /*
    1. Écrire un programme qui permet de permuter les valeurs entre deux variables
Saisir a :5
Saisir b :3
a = 3 et b = 5
    */

        int a, b, c;

        a = 5;
        b = 3;
        c = a;

        System.out.println("Initialisation: \n a =" + a + "\n b ="+ b);

        a = b;
        b = c;

        System.out.println("Permutation: \n a =" + a + "\n b ="+ c);




    }





}
