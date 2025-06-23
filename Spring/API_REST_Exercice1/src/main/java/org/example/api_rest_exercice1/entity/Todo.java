package org.example.api_rest_exercice1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.api_rest_exercice1.dto.TodoResponseDto;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titre;
    private String description;
    private String date;
    private boolean isValidate;

    public TodoResponseDto entityToDto (){
        return TodoResponseDto.builder()
                .id(getId())
                .titre(getTitre())
                .date(getDate())
                .description(getDescription())
                .build();
    }
}
