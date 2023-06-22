import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

    @Mock
    Feline feline;
    @Test
    public void lionConstructorThrowsException(){
        boolean thrown = false;
        try {
            new Lion("Боевой протодракон", feline);
        }   catch (Exception ex) {
            thrown = true;
            ex.printStackTrace();
        }
        assertTrue(thrown);
    }
}