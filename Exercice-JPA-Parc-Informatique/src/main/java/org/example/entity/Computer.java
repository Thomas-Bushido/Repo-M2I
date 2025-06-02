package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.lang.management.OperatingSystemMXBean;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String model;

    @Embedded
    private Identification identification;

    @ManyToOne
    @JoinColumn(name = "idProcessor")
    private Processor processor;

    @ManyToOne
    @JoinColumn(name= "idOs")
    private OperatingSysteme operatingSysteme;

}
