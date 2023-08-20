import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalParametrizedTest {

    private final String animalKind;
    private final List<String> expectedResult;

    public AnimalParametrizedTest(String animalKind, List<String> expectedResult) {
        this.animalKind = animalKind;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getFoods() {
        return new Object[][] {
                { "Травоядное", List.of("Трава", "Различные растения")},
                { "Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getFoodReturnListOfPredatorOrHerbivorous() throws Exception {
        Animal animal = new Animal();
        List<String> actualResult = animal.getFood(animalKind);
        assertEquals(expectedResult, actualResult);

    }
}