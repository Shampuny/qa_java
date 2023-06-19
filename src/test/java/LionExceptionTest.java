import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

    @Mock
    Feline feline;
    @Test
    public void lionConstructorThrowsException(){
        try {
            new Lion("Боевой протодракон", feline);
        }   catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
