package org.example.api_rest_exercice2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.api_rest_exercice2.exception.NotFoundException;
import org.example.api_rest_exercice2.model.Director;
import org.example.api_rest_exercice2.model.Movie;
import org.example.api_rest_exercice2.service.DirectorRepository;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovReceiveDto {
    private Long idMov;
    private String name;
    private String upcomingDate;
    private String description;
    private double duration;
    private String type;
    private Long idDir;

    public Movie movToModel (DirectorRepository directorRepository){
        return Movie.builder()
                .name(getName())
                .upcomingDate(getUpcomingDate())
                .description(getDescription())
                .duration(getDuration())
                .type(getType())
                .director(directorRepository.findById(getIdDir()).orElseThrow(NotFoundException::new))
                .build();
    }
}
