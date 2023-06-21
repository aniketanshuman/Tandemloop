import java.util.HashMap;
import java.util.Map;

public class NumberMultiples {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        Map<Integer, Integer> counts = new HashMap<>();
        int[] multiples = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int multiple : multiples) {
            counts.put(multiple, 0);
        }

        for (int number : numbers) {
            for (int multiple : multiples) {
                if (number % multiple == 0) {
                    int currentCount = counts.get(multiple);
                    counts.put(multiple, currentCount + 1);
                }
            }
        }

        System.out.println(counts);
    }
}
