package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TimeTaken {
    public static void main(String[] args) {
        long start;
        long end;

        // Creating a large dataset
        List<Integer> dataset = new ArrayList<>();
        for (int i = 1; i <= 20000000; i++) {
            dataset.add(i);
        }

        // Sequential stream approach
        start = System.currentTimeMillis();
        long sumOfSquaresSequential = dataset.stream()
                .mapToLong(i -> i * i)
                .sum();
        end = System.currentTimeMillis();
        System.out.println("Sum of squares (sequential): " + sumOfSquaresSequential);
        System.out.println("Time took for execution (sequential): " + (end - start));

        // Parallel stream approach
        start = System.currentTimeMillis();
        long sumOfSquaresParallel = dataset.parallelStream()
                .mapToLong(i -> i * i)
                .sum();
        end = System.currentTimeMillis();
        System.out.println("Sum of squares (parallel): " + sumOfSquaresParallel);
        System.out.println("Time took for execution (parallel): " + (end - start));
    }
}
