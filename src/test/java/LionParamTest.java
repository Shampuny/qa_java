import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamTest {

    private final String lionSex;
    private final boolean hasMane;
    Feline feline = new Feline();

    public LionParamTest(String lionSex, boolean hasMane) {
        this.lionSex = lionSex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[] getLionParams() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void getLionParamsTest() throws Exception {
        Lion lion = new Lion(lionSex, feline);
        boolean actualResult = lion.doesHaveMane();

        assertEquals(hasMane, actualResult);
    }

}