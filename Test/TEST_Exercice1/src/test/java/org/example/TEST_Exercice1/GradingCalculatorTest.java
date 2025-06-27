package org.example.TEST_Exercice1;

import org.example.calcul.GradingCalculator;
import org.junit.Assert;
import org.junit.Test;

public class GradingCalculatorTest {
       private GradingCalculator gradingCalculator;

       @Test
    public void when_return_A(){
           //Arrange
           gradingCalculator = new GradingCalculator(91,75);

           //Act
           double result = gradingCalculator.getGrade();

           //Assert
           Assert.assertEquals("A", result);
       }

       
}
