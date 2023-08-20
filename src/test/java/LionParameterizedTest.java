import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final boolean expected;

    public LionParameterizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
        };
    }

    @Test
    public void doesHaveManeTrueOrFalse() throws Exception {
        Lion lion = new Lion(sex);
        boolean actualResult = lion.doesHaveMane();
        assertEquals(expected, actualResult);
        assertThrows(Exception.class, () -> new Lion("абракадабра"));
    }
}