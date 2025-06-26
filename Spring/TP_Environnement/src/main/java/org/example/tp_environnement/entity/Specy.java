package org.example.tp_environnement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_environnement.dto.specy.SpecyResponseDto;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Specy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSpe;
    private String commonName;
    private String scientificName;
    public Category category;

    public SpecyResponseDto entityToDto(){
        System.out.println("SpecyResponseDto"+ "\n" + "Specy::entityToDto");
        return SpecyResponseDto.builder()
                .idSpe(getIdSpe())
                .commonName(getCommonName())
                .scientificName(getScientificName())
                .category(getCategory())
                .build();
    }

}
