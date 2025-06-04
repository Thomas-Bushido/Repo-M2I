package org.example;

import net.bytebuddy.asm.Advice;
import org.example.dao.BaseDAO;
import org.example.dao.CommentDAO;
import org.example.dao.ImageDAO;
import org.example.dao.ProductDAO;
import org.example.entity.Comment;
import org.example.entity.Image;
import org.example.entity.Product;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static org.example.entity.Product.sqlDate;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductDAO productDAO = new ProductDAO();
        ImageDAO imageDAO = new ImageDAO();
        CommentDAO commentDAO = new CommentDAO();

        Comment commentEdit = commentDAO.get(1);
        commentEdit.setProduct(productDAO.get(40));
        commentDAO.save(commentEdit);
        System.out.println(productDAO.get(40));

    }
}

/*
        Image image1 = Image.builder().url("www.123.fr").build();
        Image image2 = Image.builder().url("www.456.fr").build();
        Image image3 = Image.builder().url("www.789.fr").build();
        Image image4 = Image.builder().url("www.101112.fr").build();
        Image image5 = Image.builder().url("www.131415.fr").build();

        List<Image> images = List.of(image1,image2,image3,image4,image5);

        for(Image i: images){
            imageDAO.save(i);
        }
        Comment comment1 = Comment.builder().content("Comment 1").note("klcdnjlkjcnlkjcncd").commentDate(sqlDate("1950-10-21")).build();
        Comment comment2 = Comment.builder().content("Comment 2").note("kzexqvbrtt").commentDate(sqlDate("1983-01-28")).build();
        Comment comment3 = Comment.builder().content("Comment 3").note("cnlkjcncd").commentDate(sqlDate("2020-10-13")).build();
        Comment comment4 = Comment.builder().content("Comment 4").note("klcdnjhksvizlkc,zccd").commentDate(sqlDate("2010-10-25")).build();
        Comment comment5 = Comment.builder().content("Comment 5").note("k").commentDate(sqlDate("2005-05-02")).build();
        List<Comment> comments = List.of(comment1,comment2,comment3,comment4,comment5);

        for(Comment i: comments){
            commentDAO.save(i);
        }
*/

//1. Afficher la liste des produits commandés entre deux dates lus au clavier.
        /*
        System.out.println("Liste des produits commandés entre deux dates: ");
        System.out.println("Saisissez la date 1: ");
        Date date1 = sqlDate(scanner.nextLine());
        System.out.println("Saisissez la date 2: ");
        Date date2 = sqlDate(scanner.nextLine());
        System.out.println("liste des produits entre le " + date1 +" et le " + date2);
        System.out.println(productDAO.dateBetween(date1, date2));
        */

//2. retourner les numéros et reference des articles dont le stock est inférieur à une valeur lue au clavier.
        /*
        System.out.println("Liste des produits recherchés en fonction du stock: ");
        System.out.println("Saisissez la valeur maximum du stock: ");
        int st = scanner.nextInt();
        System.out.println("liste des produits concernés en fonction du stock: ");
        System.out.println(productDAO.stockUnderValue(st));
        */

// 1. Afficher la valeur du stock des produits d'une marque choisie
        /*
        System.out.println("Saisissez la marque du stock recherché: ");
        String mq = scanner.nextLine();
        System.out.println("Stock: ");
        List<Object[]> List = productDAO.stockBrand(mq);
        for (Object[] o : List) {
            System.out.println(o[0] + " " + o[1]);
        }
*/
// 2. Calculer le prix moyen des produits.
/*
        System.out.println("prix moyen: ");
        System.out.println(productDAO.avgPrice());
*/


/*

        Product product1 = Product.builder().brand("Brand1").reference("12za8e1aze").purchaseDate(sqlDate("2025-06-01")).price(12.5).stock(200).build();
        Product product2 = Product.builder().brand("Brand1").reference("aze121azex").purchaseDate(sqlDate("2025-06-06")).price(120.5).stock(20).build();
        Product product3 = Product.builder().brand("Brand3").reference("az87e74a1z").purchaseDate(sqlDate("2025-06-14")).price(2.5).stock(500).build();
        Product product4 = Product.builder().brand("Brand4").reference("aze5445aez").purchaseDate(sqlDate("2025-06-05")).price(18).stock(20).build();
        Product product5 = Product.builder().brand("Brand2").reference("hbfg1h741e").purchaseDate(sqlDate("2025-06-15")).price(3).stock(1000).build();

        List<Product> products = List.of(product1,product2,product3,product4,product5);

        for(Product p : products){
            productDAO.save(p);
        }
*/
        /*
        Product productShow = productDAO.get(2);
        System.out.println("Product id : 2");
        System.out.println(productShow);

        System.out.println("delete :");
        System.out.println(productDAO.delete(3));

        Product productEdit = productDAO.get(1);

        System.out.println("product Befor Edit :");
        System.out.println(productEdit);

        productEdit.setReference("4a6f1ds21sq32f1sq");
        productEdit.setPurchaseDate(LocalDate.now());

        productDAO.save(productEdit);

        System.out.println("product after Edit :");
        System.out.println(productEdit);
*/


/*
        System.out.println("liste des produits dont le prix est supérieur à " + 8 +" euros: ");
        System.out.println(productDAO.getUpTo(8) + "\n");
*/