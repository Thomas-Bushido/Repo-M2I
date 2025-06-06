package org.example.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@Entity
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Food extends Article {

    private String expirationDate;


}
