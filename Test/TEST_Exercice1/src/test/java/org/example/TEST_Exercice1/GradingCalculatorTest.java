package org.example.TEST_Exercice1;

import org.example.calcul.GradingCalculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class GradingCalculatorTest {
       private GradingCalculator gradingCalculator;
/*
       @Test
    public void whenGrade_95_AndPresence_90_ThenResult_A(){
           //Arrange
           gradingCalculator = new GradingCalculator(91,75);

           //Act
           double result = gradingCalculator.getGrade();

           //Assert
           Assert.assertEquals("A", result);
       }

       @Test
    public void whenGrade_85_AndPresence_90_ThenResult_B(){
           //Arrange
           gradingCalculator = new GradingCalculator(81,61);

           //Act
           double result = gradingCalculator.getGrade();

           //Assert
           Assert.assertEquals("B", result);
       }

    @Test
    public void whenGrade_65_AndPresence_90_ThenResult_C(){
        //Arrange
        gradingCalculator = new GradingCalculator(61,61);

        //Act
        double result = gradingCalculator.getGrade();

        //Assert
        Assert.assertEquals("C", result);
    }

    @Test
    public void whenGrade_ElseReturn_F(){
        //Arrange
        gradingCalculator = new GradingCalculator(59,59);

        //Act
        double result = gradingCalculator.getGrade();

        //Assert
        Assert.assertEquals("F", result);
    }
    */

private static Stream<Arguments> providerParameters(){
    return Stream.of(
            Arguments.of(95,90,"A"),
            Arguments.of(85,90,"B"),
            Arguments.of(65,90,"C"),
            Arguments.of(95,65,"B"),
            Arguments.of(95,55,"F"),
            Arguments.of(65,55,"F"),
            Arguments.of(50,90,"F")
    );
}


    @ParameterizedTest
    @MethodSource("providerParameters")
    public void whenGradeAndPresenceThenResultAwaitGrade(int grade, int presence, char awaitedGrade){
         //Arrange
        gradingCalculator = new GradingCalculator(grade, presence);
        //Act
        char gradGet = gradingCalculator.getGrade();
        //Assert
        Assert.assertEquals(awaitedGrade,gradGet);

    }


}
