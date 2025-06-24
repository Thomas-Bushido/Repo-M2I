package org.example.api_rest_exercice1.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.api_rest_exercice1.entity.Todo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class TodoReceiveDto {
    private String titre;
    private String description;
    private String date;
    private String isValidate;

    public Todo dtoToEntity (){

        return Todo.builder()
                .titre(getTitre())
                .date(getDate())
                .description(getDescription())
                .isValidate(Boolean.parseBoolean(getIsValidate()))
                .build();
    }
}
