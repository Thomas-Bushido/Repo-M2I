package org.example.mise_en_bdd.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank(message = "Ce champ doit etre rempli !")
    @Column(name = "first_name")
    private String firstname;

    @NotNull
    @Size(min = 3,max = 35,message = "3 char minimum svp !!!")
    private String lastname;

    @Min(18)
    @Max(77)
    private Integer age;
}
