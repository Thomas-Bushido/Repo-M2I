package org.example.tp_environnement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_environnement.dto.observation.ObsResponseDto;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Observation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idObs;

    private String location;
    private double latitude;
    private double longitude;
    private String observationDate;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "idSpe")
    private Specy specy;

    public ObsResponseDto entityToDto(){
        return ObsResponseDto.builder()
                .idObs(getIdObs())
                .location(getLocation())
                .latitude(getLatitude())
                .longitude(getLongitude())
                .observationDate(getObservationDate())
                .comment(getComment())
                .specy(getSpecy())
                .build();
    }
}
