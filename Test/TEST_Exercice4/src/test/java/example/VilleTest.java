package example;

import org.example.Ville;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class VilleTest {

    private Ville ville;
/*
    @Test
    public void When_name_ismatching(){
        // Arrange
        String expected = "Paris";
        System.out.println("Début d'un test");
        Ville ville = new Ville();
        // Act
        String result = ville.search(expected);
        // Assert
        Assertions.assertEquals(expected, result);
    }
*/
    @Test
    public void When_name_isnot_matching(){
        // Arrange
        String expected = "Budapest";
        System.out.println("Début d'un test");
        Ville ville = new Ville();
        // Act
        String result = ville.search(expected);
        // Assert
        Assertions.assertEquals(expected, result);
    }

}
