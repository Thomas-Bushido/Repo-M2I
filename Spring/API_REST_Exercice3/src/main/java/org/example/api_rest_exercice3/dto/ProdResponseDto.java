package org.example.api_rest_exercice3.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ProdResponseDto {
    private long id;
    private String nom;
    private double prix;
}
