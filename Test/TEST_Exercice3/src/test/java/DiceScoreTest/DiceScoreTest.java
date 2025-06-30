package DiceScoreTest;

import org.example.DiceScore;
import org.example.Ide;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DiceScoreTest {
    private DiceScore dicescore;
    private Ide de = Mockito.mock(Ide.class);

    @Test
    public void WhenScoreFirstEqualScoreSecond(){
        //Arrange
        dicescore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(20).thenReturn(30);

        //Act
        int result = dicescore.getScore();

        //Assert
        Assert.assertEquals(30, result, 0.001);
    }



}
