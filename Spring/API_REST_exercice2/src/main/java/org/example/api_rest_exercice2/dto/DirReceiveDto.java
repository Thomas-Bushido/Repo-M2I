package org.example.api_rest_exercice2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.api_rest_exercice2.model.Director;
import org.example.api_rest_exercice2.model.Movie;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DirReceiveDto {
    private Long idDir;
    private String firstName;
    private String lastName;
    private String birthDate;

    public Director dirToModel (){
        return Director.builder()
                .firstName(getFirstName())
                .lastName(getLastName())
                .birthDate(getBirthDate())
                .build();
    }
}
