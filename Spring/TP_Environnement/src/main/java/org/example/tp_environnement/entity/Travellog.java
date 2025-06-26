package org.example.tp_environnement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_environnement.dto.specy.SpecyResponseDto;
import org.example.tp_environnement.dto.travellog.TravResponseDto;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Travellog {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long idTrav;
     private double distanceKm;
     private TravelMode mode;
     private double estimatedCo2Kg;

    @OneToOne
    @JoinColumn(name = "observation")
    private Observation observation;

    public TravResponseDto entityToDto(){
        System.out.println("TravResponseDto"+ "\n" + "Travellog::entityToDto");
        return TravResponseDto.builder()
                .idTrav(getIdTrav())
                .distanceKm(getDistanceKm())
                .mode(getMode())

                
                .estimatedCo2Kg(getEstimatedCo2Kg())
                .build();
    }

}
