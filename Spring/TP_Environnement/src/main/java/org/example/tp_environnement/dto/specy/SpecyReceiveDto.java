package org.example.tp_environnement.dto.specy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_environnement.entity.Category;
import org.example.tp_environnement.entity.Specy;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SpecyReceiveDto {
    private String commonName;
    private String scientificName;
    public Category category;

    public Specy dtoToEntity() {
        System.out.println("SpecyReceiveDto::dtoToEntity");
        return Specy.builder()
                .commonName(getCommonName())
                .scientificName(getScientificName())
                .category(getCategory())
                .build();
    }
}
