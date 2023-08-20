import com.example.Alex;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class AlexTest {

    @Test
    public void getFriendsReturn3Friends() throws Exception {
        Alex alex = new Alex();
        List<String> actualResult = alex.getFriends();
        List<String> expectedResult = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getPlaceOfLivingReturnNewYorkZoo() throws Exception {
        Alex alex = new Alex();
        String actualResult = alex.getPlaceOfLiving();
        String expectedResult = ("Нью-Йоркский зоопарк");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensReturnZero() throws Exception {
        Alex alex = new Alex();
        int actualResult = alex.getKittens();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }
}