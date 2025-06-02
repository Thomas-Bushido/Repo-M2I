package org.example.util;
import org.example.service.AnimalService;

import java.util.List;
import java.util.Scanner;

public class Diet {
    private static AnimalService animalService = new AnimalService();
    private static Scanner scanner = new Scanner(System.in);

    public static void start() {
        boolean running = true;
        while (running) {
            System.out.println("1. Créer animal");
            System.out.println("2. Modifier animal");
            System.out.println("3. Supprimer animal");
            System.out.println("4. Afficher tous les animaux");
            System.out.println("5. Quitter");
            System.out.print("Choix : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createAnimal();
                    break;
                case 2:
                    updateAnimal();
                    break;
                case 3:
                    deleteAnimal();
                    break;
                case 4:
                    displayAllAnimals();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }
        System.out.println("Au revoir !");
    }

    private static void createAnimal() {
        System.out.print("Nom  : ");
        String name = scanner.nextLine();
        System.out.print("Espece : ");
        String species = scanner.nextLine();


        AnimalService.createAnimal(name,species);
    }

    private static void updateUser() {
        System.out.print("ID de l'utilisateur à modifier : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        AnimalService animal = AnimalService.getAnimal(id);
        if (animal == null) {
            System.out.println("Utilisateur non trouvé !");
            return;
        }

        System.out.print("Nouveau nom d'utilisateur : ");
        String newName = scanner.nextLine();
        System.out.print("Nouveau prenom : ");
        String newSpecies = scanner.nextLine();

        animal.setname(newName);
        animal.setspecies(newSpecies);

        AnimalService.updateAnimal(animal);
        System.out.println("Animal mis à jour avec succès !");
    }

    private static void deleteAnimal() {
        System.out.print("ID de l'animal à supprimer : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        personAnimal.deleteAnimal(id);
        System.out.println("Animal supprimé avec succès !");
    }

    private static void displayAllAnimals() {
        List<AnimalService> animals = AnimalService.getAllAnimal();
        for (AnimalService animal : animals) {
            System.out.println(animal);
        }
    }
}
