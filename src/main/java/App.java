import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws IOException {
        String filePath = "numbers.txt";
        List<Integer> numbers = readNumbersFromFile(filePath);

        System.out.println("Минимальное: " + _min(numbers));
        System.out.println("Максимальное: " + _max(numbers));
        System.out.println("Сумма: " + _sum(numbers));
        System.out.println("Произведение: " + _mult(numbers));
    }

    public static List<Integer> readNumbersFromFile(String filePath) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        return Arrays.stream(content.trim().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public static int _min(List<Integer> numbers) {
        return numbers.stream().min(Integer::compare).orElseThrow();
    }

    public static int _max(List<Integer> numbers) {
        return numbers.stream().max(Integer::compare).orElseThrow();
    }

    public static int _sum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public static long _mult(List<Integer> numbers) {
        return numbers.stream().mapToLong(Integer::longValue).reduce(1, (a, b) -> a * b);
    }
}