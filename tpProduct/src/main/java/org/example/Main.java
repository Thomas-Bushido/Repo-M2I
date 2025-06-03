package org.example;

import org.example.dao.ProductDAO;
import org.example.entity.Product_housing;

public class Main {
    public static void main(String[] args) {

        ProductDAO productDAO = new ProductDAO();
       // Product_Electronic prodElec1 = Product_Electronic.builder().nom("Elec1").price(12.99).batterie_duration("15 heures").build();
        // productDAO.save(prodElec1);
        Product_housing prodHousing = Product_housing.builder().nom("Tec").price(115).width(52.55).height(26.22).build();
        productDAO.save(prodHousing);

    }
}