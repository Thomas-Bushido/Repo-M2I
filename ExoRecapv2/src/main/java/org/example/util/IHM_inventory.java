package org.example.util;

import org.example.dao.ArticleDAO;
import org.example.entity.Article;
import org.example.entity.Electronic;
import org.example.entity.Food;
import org.example.entity.Mode;

import java.util.Scanner;

public class IHM_inventory {
    Scanner scanner;
    String choice;
    ArticleDAO articleDAO;

    public IHM_inventory() {
        scanner = new Scanner(System.in);
        articleDAO = new ArticleDAO();
    }

    public void start() {
        do {
            menu();
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    menuCreate();
                    break;
                case "2":
                    //getArticleAction();
                    break;
                case "3":
                   // updateArticleAction();
                    break;
                case "4":
                  //  deleteArticleAction();
                    break;


            }
        } while (!choice.equals("0"));
    }
    private void menu() {
        System.out.println("###  Gestion de l'inventaire  ###");
        System.out.println("1 - Création d'un nouvel article' ");
        System.out.println("2 - Lister les articles");
        System.out.println("3 - Modifier un article ");
        System.out.println("4 - Supprimer un article ");
        System.out.println("0 - Quitter ");
        System.out.println("Votre Choix : ");
    }

    private void start2() {
        do {
            menuCreate();
            choice = scanner.nextLine();
            switch (choice) {
                case "4":
                    createElecArticle();
                    break;
                case "5":
                    createModeArticle();
                    break;
                case "6":
                    createFoodArticle();
                    break;



            }
        } while (!choice.equals("0"));
    }
        private void menuCreate() {
            System.out.print("Merci de saisir le type d'article : ");
            System.out.println("4 - Electronic ");
            System.out.println("5 - Vêtement ");
            System.out.println("6 - Nourriture ");
        }
        public void createElecArticle(){

            System.out.print("Merci de saisir le nom : ");
            String nm = scanner.nextLine();
            System.out.print("Merci de saisir une description : ");
            String dp = scanner.nextLine();
            System.out.print("Merci de saisir une référence : ");
            String rf = scanner.nextLine();
            System.out.print("Merci de saisir un prix : ");
            double px = scanner.nextInt();
            System.out.print("Merci de saisir une quantité : ");
            int qt = scanner.nextInt();
            System.out.print("Merci de saisir la durée de batterie : ");
            int bt = scanner.nextInt();
            Article elecArticle = Electronic.builder().name(nm).description(dp).reference(rf).price(px).quantity(qt).batteryLife(bt).build();
            articleDAO.save(elecArticle);

        }
         public void createModeArticle(){

        System.out.print("Merci de saisir le nom : ");
        String nm = scanner.nextLine();
        System.out.print("Merci de saisir une description : ");
        String dp = scanner.nextLine();
        System.out.print("Merci de saisir une référence : ");
        String rf = scanner.nextLine();
        System.out.print("Merci de saisir la catégorie : ");
        String ct = scanner.nextLine();
        System.out.print("Merci de saisir la taille : ");
        String tl = scanner.nextLine();
        System.out.print("Merci de saisir un prix : ");
        double px = scanner.nextInt();
        System.out.print("Merci de saisir une quantité : ");
        int qt = scanner.nextInt();

        Article ModeArticle = Mode.builder().name(nm).description(dp).reference(rf).category(ct).height(tl).price(px).quantity(qt).build();
        articleDAO.save(ModeArticle);
    }
        public void createFoodArticle() {

            System.out.print("Merci de saisir le nom : ");
            String nm = scanner.nextLine();
            System.out.print("Merci de saisir une description : ");
            String dp = scanner.nextLine();
            System.out.print("Merci de saisir une référence : ");
            String rf = scanner.nextLine();
            System.out.print("Merci de saisir la date de péremption : ");
            String dt = scanner.nextLine();
            System.out.print("Merci de saisir un prix : ");
            double px = scanner.nextInt();
            System.out.print("Merci de saisir une quantité : ");
            int qt = scanner.nextInt();

            Article foodArticle = Food.builder().name(nm).description(dp).reference(rf).expirationDate(dt).price(px).quantity(qt).build();
            articleDAO.save(foodArticle);
        }







}