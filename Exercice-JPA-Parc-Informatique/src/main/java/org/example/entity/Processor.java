package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Processor {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  int processorId;
    private int nbrCoeur;
    private double frequence;
    private String generation;

    @OneToMany(mappedBy = "processor")
    private List<Computer> computers;

    @Override
    public String toString() {
            return "Processor{" +
                    "processorId=" + processorId +
                    ", nbrCoeur=" + nbrCoeur +
                    ", frequence=" + frequence +
                    ", generation='" + generation + '\'' +
                    '}';
        }
}
