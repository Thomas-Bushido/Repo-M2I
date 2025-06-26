package org.example.tp_environnement.dto.observation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.example.tp_environnement.entity.Observation;
import org.example.tp_environnement.entity.Specy;
import org.example.tp_environnement.repository.ObservationRepository;
import org.example.tp_environnement.repository.SpecyRepository;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ObsReceiveDto {
    private String location;
    private double latitude;
    private double longitude;
    private String observationDate;
    private String comment;
    private Long idSpe;

    public Observation dtoToEntity(SpecyRepository specyRepository){
        return Observation.builder()
                .location(getLocation())
                .latitude(getLatitude())
                .longitude(getLongitude())
                .observationDate(getObservationDate())
                .comment(getComment())
                .specy(specyRepository.findById(getIdSpe()).orElse(null))
                .build();
    }

}
