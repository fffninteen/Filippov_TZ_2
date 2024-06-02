import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testMin() {
        List<Integer> numbers1 = Arrays.asList(-5, -3, -8, -1);
        assertEquals(-8, App._min(numbers1));

        List<Integer> numbers2 = Arrays.asList(3, 5, 2, 4);
        assertEquals(2, App._min(numbers2));

        List<Integer> numbers3 = Arrays.asList(100, 200, 150, 180, 130, 220);
        assertEquals(100, App._min(numbers3));
    }

    @Test
    public void testMax() {
        List<Integer> numbers1 = Arrays.asList(1, 1, 1, 1, 1, 100);
        assertEquals(100, App._max(numbers1));

        List<Integer> numbers2 = Arrays.asList(-10, -5, 0, 5, 10);
        assertEquals(10, App._max(numbers2));

        List<Integer> numbers3 = Arrays.asList(1000000, 2000000, 3000000, 2500000);
        assertEquals(3000000, App._max(numbers3));
    }

    @Test
    public void testSum() {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(15, App._sum(numbers1));

        List<Integer> numbers2 = Arrays.asList(10, 20, -30, 40, -50);
        assertEquals(-10, App._sum(numbers2));

        List<Integer> numbers3 = Arrays.asList(100, 200, 300, 400, 500);
        assertEquals(1500, App._sum(numbers3));
    }

    @Test
    public void testMult() {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(120, App._mult(numbers1));

        List<Integer> numbers2 = Arrays.asList(-1, -2, 3, 4, 5);
        assertEquals(120, App._mult(numbers2));

        List<Integer> numbers3 = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(3628800, App._mult(numbers3));
    }

    @Test
    public void testPerformance() {
        List<Integer> largeList = Arrays.asList(new Integer[1000000]);
        for (int i = 0; i < 1000000; i++) {
            largeList.set(i, i + 1);
        }

        long startTime = System.currentTimeMillis();
        App._min(largeList);
        long endTime = System.currentTimeMillis();
        System.out.println("Min Time: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        App._max(largeList);
        endTime = System.currentTimeMillis();
        System.out.println("Max Time: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        App._sum(largeList);
        endTime = System.currentTimeMillis();
        System.out.println("Sum Time: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        App._mult(largeList);
        endTime = System.currentTimeMillis();
        System.out.println("Mult Time: " + (endTime - startTime) + "ms");
    }
}