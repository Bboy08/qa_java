import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void eatMeatReturnListOfPredator() throws Exception {
        Feline feline = new Feline();
        List<String> actualResult = feline.eatMeat();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);
    }

    @Spy
    Feline feline;
    @Test
    public void eatMeatMockReturnListOfPredator() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void getFamilyReturnCat() {
        Feline feline = new Feline();
        String actualResult = feline.getFamily();
        String expectedResult = "Кошачьи";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensSpyResult1() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittensResult1() {
        Feline feline = new Feline();
        int actualResult = feline.getKittens(1);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }
}