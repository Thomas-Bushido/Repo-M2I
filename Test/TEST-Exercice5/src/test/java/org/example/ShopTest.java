package org.example;

import org.example.model.Shop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class ShopTest {

    private Shop shop;

    @BeforeEach
    public void setup(){
        shop = new Shop();


    }

    @Test
    public void  whenItsDairyProduct(){
        // Arrange
        String product = "produit Laitier";
        HashMap<String, Integer> productMap = new HashMap<>();
        productMap.put("produit Conserve", 5);
        productMap.put("produit Laitier", 25);
        productMap.put("produit Légume", 30);
        // Act
        productMap.entrySet();
        shop.update();
        // Assert

    }
}
