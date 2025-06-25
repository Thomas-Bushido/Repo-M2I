package org.example.api_rest_exercice3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.api_rest_exercice3.entity.Produit;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProdReceiveDto {
    private String nom;
    private double prix;

    public Produit dtoToEntity(){
        return Produit.builder()
                .nom(getNom())
                .prix(getPrix())
                .build();
    }
}