import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline felineMock;
    @Test
    public void getKittensFelineMockReturn1() {
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        Lion lion = new Lion(felineMock);
        int actualResult = lion.getKittens();
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensFelineReturn1() {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        int actualResult = lion.getKittens();
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void getFoodListPredatorMockListIsMatch() throws Exception {
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(felineMock);
        List<String> actualResult = lion.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getFoodPredatorListIsMatch() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        List<String> actualResult = lion.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);
    }
}