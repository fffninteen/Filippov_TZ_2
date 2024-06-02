import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;

public class NumberProcessorTest {

    @Test
    public void testMin() throws IOException {
        List<Integer> numbers = NumberProcessor.readNumbersFromFile("src/test/resources/test_numbers.txt");
        assertEquals(1, NumberProcessor._min(numbers));
    }

    @Test
    public void testMax() throws IOException {
        List<Integer> numbers = NumberProcessor.readNumbersFromFile("src/test/resources/test_numbers.txt");
        assertEquals(4, NumberProcessor._max(numbers));
    }

    @Test
    public void testSum() throws IOException {
        List<Integer> numbers = NumberProcessor.readNumbersFromFile("src/test/resources/test_numbers.txt");
        assertEquals(10, NumberProcessor._sum(numbers));
    }

    @Test
    public void testMult() throws IOException {
        List<Integer> numbers = NumberProcessor.readNumbersFromFile("src/test/resources/test_numbers.txt");
        assertEquals(24, NumberProcessor._mult(numbers));
    }

    @Test
    public void testPerformance() throws IOException {
        List<Integer> numbers = NumberProcessor.readNumbersFromFile("src/test/resources/large_numbers.txt");

        long startTime = System.currentTimeMillis();
        NumberProcessor._min(numbers);
        long endTime = System.currentTimeMillis();
        System.out.println("Min function time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        NumberProcessor._max(numbers);
        endTime = System.currentTimeMillis();
        System.out.println("Max function time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        NumberProcessor._sum(numbers);
        endTime = System.currentTimeMillis();
        System.out.println("Sum function time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        NumberProcessor._mult(numbers);
        endTime = System.currentTimeMillis();
        System.out.println("Mult function time: " + (endTime - startTime) + " ms");
    }

    @Test
    public void testCustom() throws IOException {
        List<Integer> numbers = NumberProcessor.readNumbersFromFile("src/test/resources/custom_numbers.txt");
        assertTrue(numbers.size() > 0);
    }
}