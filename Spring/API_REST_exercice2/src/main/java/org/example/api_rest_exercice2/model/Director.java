package org.example.api_rest_exercice2.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.api_rest_exercice2.dto.DirResponseDto;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDir;
    private String firstName;
    private String lastName;
    private String birthDate;

    @OneToMany(mappedBy = "director")
    private List<Movie> movie;

    public DirResponseDto  modelToDto (){
        return DirResponseDto.builder()
                .idDir(getIdDir())
                .firstName(getFirstName())
                .lastName(getLastName())
                .birthDate(getBirthDate())
                .build();
    }
}
