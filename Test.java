import java.time.ZoneId;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
interface Formula{
    double calculate(int a);

    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
public class Test{
    static int count = 0;

        static void increment() {
        count = count + 1;
    }

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, 10000).forEach(i -> executor.submit(() -> increment()));

        stop(executor);

        System.out.println(count);
    }

    private static void stop(ExecutorService executor) {
    }
}