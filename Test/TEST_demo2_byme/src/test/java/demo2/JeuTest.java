package demo2;

import org.junit.Assert;
import org.example.demo2.Ide;
import org.example.demo2.Jeu;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class JeuTest {

    private Jeu jeu;
    private Ide de = Mockito.mock(Ide.class);

    @Test
    public void whenDeLancerWithValue20_ThenJeuReturnTrue(){
        //Arrange
        jeu = new Jeu(de);
        Mockito.when(de.lancer()).thenReturn(20);

        //Act
        boolean result = jeu.jouer();

        //Assert
        Assert.assertTrue(result);
    }

    @Test
    public void whenDeLancerWithValue2_ThenJeuReturnTrue(){

    }
}
