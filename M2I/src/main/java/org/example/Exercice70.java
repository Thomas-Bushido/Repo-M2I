package org.example;

import java.util.Scanner;

public class Exercice70 {
    public static void main(String[] args) {
        /*Exercice : Maximum de 3 nombres
        1. Créer 3 variables : nombre1, nombre2, nombre3
        2. Affecter des valeurs aux variables
        3. Créer des structures conditionnelles permettant d'afficher le
        maximum parmis les 3 nombres créés précédemment
        Saisir le nombre 1 : 2
        Saisir le nombre 2 : 5
        Saisir le nombre 3 : 3
        La valeur maximale est : 5*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez le nombre1:");
        double nombre1 = scanner.nextInt();
        System.out.println("Saisissez le nombre2:");
        double nombre2 = scanner.nextInt();
        System.out.println("Saisissez le nombre3:");
        double nombre3 = scanner.nextInt();

        double[] tab = new double[3];
        tab[0] = nombre1;
        tab[1] = nombre2;
        tab[2] = nombre3;
        double nbMax = tab[0];
        for(int i=0;i<tab.length;i++){
            nbMax = Math.max(tab[0], tab[i]);
        }
        System.out.println("Nombre max: " +nbMax);
    }
}
