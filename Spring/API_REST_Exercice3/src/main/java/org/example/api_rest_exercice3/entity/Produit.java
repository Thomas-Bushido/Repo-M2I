package org.example.api_rest_exercice3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.api_rest_exercice3.dto.ProdResponseDto;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private double prix;

    public ProdResponseDto entityToDto() {
        return ProdResponseDto.builder()
                .id(getId())
                .nom(getNom())
                .prix(getPrix())
                .build();
    }

}
