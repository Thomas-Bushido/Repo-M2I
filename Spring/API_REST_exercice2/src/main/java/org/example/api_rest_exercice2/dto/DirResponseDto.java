package org.example.api_rest_exercice2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class DirResponseDto {
    private Long idDir;
    private String firstName;
    private String lastName;
    private String birthDate;
}
