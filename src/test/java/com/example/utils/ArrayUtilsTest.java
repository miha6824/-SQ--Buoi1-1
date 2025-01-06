import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.utils.ArrayUtils;  // Add if ArrayUtils is in a different package
public class ArrayUtilsTest {
    @Test
    void testSumWithPositiveNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = ArrayUtils.sum(numbers);
        assertEquals(15, result, "The sum of {1, 2, 3, 4, 5} should be 15");
    }

    @Test
    void testSumWithNegativeNumbers() {
        int[] numbers = {-1, -2, -3, -4, -5};
        int result = ArrayUtils.sum(numbers);
        assertEquals(-15, result, "The sum of {-1, -2, -3, -4, -5} should be -15");
    }

    @Test
    void testSumWithMixedNumbers() {
        int[] numbers = {-1, 2, -3, 4, -5};
        int result = ArrayUtils.sum(numbers);
        assertEquals(-3, result, "The sum of {-1, 2, -3, 4, -5} should be -3");
    }

    @Test
    void testSumWithEmptyArray() {
        int[] numbers = {};
        int result = ArrayUtils.sum(numbers);
        assertEquals(0, result, "The sum of an empty array should be 0");
    }

    @Test
    void testSumWithNullArray() {
        int result = ArrayUtils.sum(null);
        assertEquals(0, result, "The sum of a null array should be 0");
    }
}
