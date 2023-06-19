import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

    @RunWith(MockitoJUnitRunner.class)
    public class LionTest{
    @Mock
    private Feline feline;
    private Lion lion;
    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самец", feline);
    }

    @Test
    public void testKittensCount(){
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedResult = 1;

        int actualResult = lion.getKittens();

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void doesHaveManeTest(){
        boolean expectedResult = true;
        boolean actualResult = lion.doesHaveMane();

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getFoodShouldUseGetFoodParentMethod() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        var expectedResult = List.of("Животные", "Птицы", "Рыба");

        List<String> actualResult = lion.getFood();

        assertEquals(expectedResult, actualResult);
    }

}
