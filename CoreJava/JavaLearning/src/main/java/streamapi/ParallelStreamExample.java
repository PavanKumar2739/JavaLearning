package streamapi;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample {
    public static void main(String[] args) {
        long start;
        long end;

        // Creating a large dataset
        List<Integer> dataset = new ArrayList<>();
        for (int i = 1; i <= 5000; i++) {
            dataset.add(i);
        }

        // Sequential approach - Sum of factorials
        start = System.currentTimeMillis();
        BigInteger sumOfFactorialsSequential = dataset.stream()
                .map(ParallelStreamExample::factorial)
                .reduce(BigInteger.ZERO, BigInteger::add);
        end = System.currentTimeMillis();
        System.out.println("Sum of factorials (sequential): " + sumOfFactorialsSequential);
        System.out.println("Time took for execution (sequential): " + (end - start));

        // Parallel approach - Sum of factorials
        start = System.currentTimeMillis();
        BigInteger sumOfFactorialsParallel = dataset.parallelStream()
                .map(ParallelStreamExample::factorial)
                .reduce(BigInteger.ZERO, BigInteger::add);
        end = System.currentTimeMillis();
        System.out.println("Sum of factorials (parallel): " + sumOfFactorialsParallel);
        System.out.println("Time took for execution (parallel): " + (end - start));
        start = System.currentTimeMillis();
        
        BigInteger sumOfFactorialsSequential1 = BigInteger.ZERO;
        for (int i : dataset) {
            sumOfFactorialsSequential1 = sumOfFactorialsSequential1.add(factorial(i));
        }
        end = System.currentTimeMillis();
        System.out.println("Sum of factorials (sequential): " + sumOfFactorialsSequential1);
        System.out.println("Time took for execution (sequential): " + (end - start));
        
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

