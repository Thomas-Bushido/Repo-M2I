package org.example.tp_environnement.dto.travellog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_environnement.entity.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TravReceiveDto {
    private double distanceKm;
    private TravelMode mode;
    private double estimatedCo2Kg;
    private Observation observation;

    public Travellog dtoToEntity() {
        System.out.println("TravReceiveDto::dtoToEntity");
        return Travellog.builder()
                .distanceKm(getDistanceKm())
                .mode(getMode())
                .estimatedCo2Kg(getEstimatedCo2Kg())
                .observation(getObservation())
                .build();
    }
}