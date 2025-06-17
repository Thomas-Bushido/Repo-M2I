package org.example.spring_exercice_product.service;

import org.example.spring_exercice_product.model.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class ProductService {

    private final Map<UUID, Product> products;

    public ProductService(){
        products = new HashMap<>();
        Product productA = Product.builder()
                .id(UUID.randomUUID())
                .name("Lessive")
                .category("produit ménager")
                .price(15.99).build();
        Product productB = Product.builder()
                .id(UUID.randomUUID())
                .name("Choux")
                .category("légumes")
                .price(4.99).build();
        this.products.put(productA.getId(), productA);
        this.products.put(productB.getId(), productB);
    }

    public List<Product> getProducts(){
        return this.products.values().stream().toList();
    }

    public Product getProductByID(UUID id) {
        return this.products.get(id);
    }
}
