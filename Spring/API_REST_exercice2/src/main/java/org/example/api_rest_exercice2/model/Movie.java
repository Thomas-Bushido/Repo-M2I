package org.example.api_rest_exercice2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.api_rest_exercice2.dto.DirResponseDto;
import org.example.api_rest_exercice2.dto.MovResponseDto;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Movie {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long idMov;

    private String name;
    private String upcomingDate;
    private String description;
    private double duration;
    private String type;

    @ManyToOne
    @JoinColumn(name="idDir")
    private Director director;

 public MovResponseDto modelToDto (){
  return MovResponseDto.builder()
          .idMov(getIdMov())
          .upcomingDate(getUpcomingDate())
          .description(getDescription())
          .duration(getDuration())
          .type(getType())
          .build();
 }

}
