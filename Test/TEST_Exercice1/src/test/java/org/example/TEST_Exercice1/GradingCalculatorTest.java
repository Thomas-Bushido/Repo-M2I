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

       @Test
    public void when_return_B(){
           //Arrange
           gradingCalculator = new GradingCalculator(81,61);

           //Act
           double result = gradingCalculator.getGrade();

           //Assert
           Assert.assertEquals("B", result);
       }

    @Test
    public void when_return_C(){
        //Arrange
        gradingCalculator = new GradingCalculator(61,61);

        //Act
        double result = gradingCalculator.getGrade();

        //Assert
        Assert.assertEquals("C", result);
    }

    @Test
    public void when_return_F(){
        //Arrange
        gradingCalculator = new GradingCalculator(59,59);

        //Act
        double result = gradingCalculator.getGrade();

        //Assert
        Assert.assertEquals("F", result);
    }

}
