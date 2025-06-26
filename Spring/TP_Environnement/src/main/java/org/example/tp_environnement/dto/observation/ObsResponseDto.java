package org.example.tp_environnement.dto.observation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_environnement.entity.Category;
import org.example.tp_environnement.entity.Observation;
import org.example.tp_environnement.entity.Specy;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ObsResponseDto {
    private Long idObs;
    private String location;
    private double latitude;
    private double longitude;
    public Specy specy;
    private String observationDate;
    private String comment;

}
