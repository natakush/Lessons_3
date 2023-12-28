package le9;
import java.util.stream.Stream;

public class Fibon {

    public static void main(String[] args) {
        int n = 3;
        long fibonacciNumber = calculateFibonacci(n);
        System.out.println("Number at position " + n + ": " + fibonacciNumber);
    }
    public static long calculateFibonacci(int n) {
        return Stream.iterate(new long[]{0, 1}, fibPair -> new long[]{fibPair[1], fibPair[0] + fibPair[1]})
                .limit(n+ 1)
                .reduce((first, second) -> second)
                .orElseThrow()[0];
    }
}