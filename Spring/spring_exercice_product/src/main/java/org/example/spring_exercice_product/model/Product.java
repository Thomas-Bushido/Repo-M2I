package org.example.spring_exercice_product.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private UUID id;
    private String name;
    private String category;
    private double price;
}
