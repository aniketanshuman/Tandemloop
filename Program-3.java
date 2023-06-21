import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of 'a': ");
        int a = scanner.nextInt();

        List<Integer> series = new ArrayList<>();
        for (int i = 1; i <= a; i += 2) {
            series.add(i);
        }

        for (int i = 0; i < series.size(); i++) {
            System.out.print(series.get(i));
            if (i != series.size() - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
