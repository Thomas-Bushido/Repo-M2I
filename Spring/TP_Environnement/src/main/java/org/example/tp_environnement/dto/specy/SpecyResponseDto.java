package org.example.tp_environnement.dto.specy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_environnement.entity.Category;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class SpecyResponseDto {
    private Long idSpe;
    private String commonName;
    private String scientificName;
    private Category category;

}
