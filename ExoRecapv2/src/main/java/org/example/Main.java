package org.example;

import org.example.dao.ArticleDAO;
import org.example.util.IHM_inventory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Exercice  : Inventaire");
        new IHM_inventory().start();

/*
        Article article1 = Electronic.builder().name("Telephone").reference("EC455312").description("I phone SE 2020").price(199.99).quantity(258).batteryLife(2).build();
        Article article2 = Electronic.builder().name("Ordinateur").reference("EC669312").description("HP").price(150.99).quantity(28).batteryLife(2).build();
        Article article3 = Electronic.builder().name("Micro").reference("EC475211").description("WARMER").price(19.99).quantity(98).batteryLife(8).build();
        Article article4 = Electronic.builder().name("Casque").reference("EC225369").description("NGINX").price(39.99).quantity(218).batteryLife(5).build();
        Article article5 = Electronic.builder().name("cable usb").reference("EC112558").description("3.0").price(10.99).quantity(153).batteryLife(2).build();
        Article article6 = Mode.builder().name("T-shirt").reference("JHD456312").description("été").price(59.99).quantity(55).category("Homme").height("M").build();
        Article article7 = Mode.builder().name("Pull").reference("MD456312").description("chaud").price(38).quantity(102).category("Femme").height("L").build();
        Article article8 = Mode.builder().name("Chemise").reference("MD546645").description("classique").price(75).quantity(25).category("Enfant").height("XS").build();
        Article article9 = Mode.builder().name("Chaussette").reference("MD225661").description("hiver").price(20).quantity(16).category("Homme").height("M").build();
        Article article10 = Mode.builder().name("Chaussures").reference("MD112544").description("sécurité").price(135).quantity(15).category("Femme").height("M").build();
        Article article11 = Mode.builder().name("Ceinture").reference("MD152852").description("noire").price(15).quantity(58).category("Homme").height("XL").build();
        Article article12 = Food.builder().name("Pizza").reference("FD887955").description("Pepperoni").price(4.50).quantity(36).build();
        Article article13 = Food.builder().name("Pâtes").reference("FD513955").description("Saumon").price(8.50).quantity(34).build();
        Article article14 = Food.builder().name("Frites").reference("FD89855").description("Paprika").price(5.90).quantity(52).build();
        Article article15 = Food.builder().name("Oeuf").reference("FD112558").description("Elevé en plein air").price(0.50).quantity(19).build();
        Article article16 = Food.builder().name("Hamburger").reference("FD547235").description("Bacon Cheddar").price(9.50).quantity(6).build();

        List<Article> articles = List.of(article1, article2, article3, article4, article5, article6, article7, article8, article9, article10, article11,article13,article12,article14,article15,article16);

        for(Article a : articles){
            articleDao.save(a);
        }
    */



    }
}