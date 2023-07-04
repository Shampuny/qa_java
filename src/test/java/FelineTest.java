import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline;

    @Test
    public void eatMeatShouldReturnFood() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
    @Test
    public void getFamilyShouldReturnFamily(){
        String expectedResult = "Кошачьи";

        String actualResult = feline.getFamily();

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getKittensShouldUseAnotherGetKittens(){
        int expectedResult = 1;

        int actualResult = feline.getKittens();

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getKittensShouldReturnKittensCount(){
        int expectedResult = 1;

        int actualResult = feline.getKittens(1);

        assertEquals(expectedResult, actualResult);
    }
}
