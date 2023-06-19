import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Cat cat;
    @Mock
    private Feline feline;
    @Before
    public void setUp(){
        cat = new Cat(feline);
    }

    @Test
    public void getSoundShouldReturnCatSound(){
        String expectedResult = "Мяу";


        String actualResult = cat.getSound();

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getFoodShouldUseEatMeatMethod() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        var expectedResult = List.of("Животные", "Птицы", "Рыба");

        List<String> actualResult = cat.getFood();

        assertEquals(expectedResult, actualResult);
    }
}
