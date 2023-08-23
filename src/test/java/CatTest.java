import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Test
    public void getSoundCatMatch() {
        Cat cat = new Cat();
        String actualResult = cat.getSound();
        String expectedResult = "Мяу";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodReturnListOfPredator() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> actualResult = cat.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);
    }

    @Mock
    Feline felineMock;

    @Test
    public void getFoodMockReturnListOfPredator() throws Exception {
        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(felineMock);
        List<String> actualResult = cat.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);
    }
}