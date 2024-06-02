import java.io.*;
import java.util.*;

public class NumberProcessor {

    public static List<Integer> readNumbersFromFile(String fileName) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split("\\s+");
            for (String token : tokens) {
                numbers.add(Integer.parseInt(token));
            }
        }
        reader.close();
        return numbers;
    }

    public static int _min(List<Integer> numbers) {
        return Collections.min(numbers);
    }

    public static int _max(List<Integer> numbers) {
        return Collections.max(numbers);
    }

    public static int _sum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public static long _mult(List<Integer> numbers) {
        return numbers.stream().mapToLong(Integer::longValue).reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        try {
            List<Integer> numbers = readNumbersFromFile("numbers.txt");
            System.out.println("Минимальное: " + _min(numbers));
            System.out.println("Максимальное: " + _max(numbers));
            System.out.println("Сумма: " + _sum(numbers));
            System.out.println("Произведение: " + _mult(numbers));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}