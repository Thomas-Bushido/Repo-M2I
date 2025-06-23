package org.example.api_rest_exercice1.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class TodoResponseDto {
    private long id;
    private String titre;
    private String date;
    private String description;
}
