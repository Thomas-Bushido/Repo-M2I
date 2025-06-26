package org.example.tp_environnement.dto.travellog;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_environnement.entity.Observation;
import org.example.tp_environnement.entity.TravelMode;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class TravResponseDto {
    private long idTrav;
    private double distanceKm;
    private TravelMode mode;
    private double estimatedCo2Kg;
    private Observation observation;
}
