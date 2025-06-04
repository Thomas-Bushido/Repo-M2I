package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String brand;
    private String reference;
    private Date purchaseDate;
    private double price;
    private int stock;

    public static Date sqlDate(String date){
        java.util.Date purchaseDate = new java.util.Date();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try{
            purchaseDate = df.parse(date);
        } catch (ParseException e){
            System.out.println("date format error");
            return null;
        }

        java.sql.Date sqlDate = new java.sql.Date(purchaseDate.getTime());
        return sqlDate;
    }

    @ManyToOne
    @JoinColumn(name = "idImage")
    private Image image;

    @OneToMany(mappedBy = "product",fetch = FetchType.EAGER)
    private List<Comment> comment;

}
