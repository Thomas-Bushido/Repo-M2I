package org.example.api_rest_exercice2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.api_rest_exercice2.model.Director;

import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class MovResponseDto {
    private Long idMov;
    private String name;
    private String upcomingDate;
    private String description;
    private double duration;
    private String type;
    private Director director;
}
