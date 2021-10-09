import java.util.stream.IntStream;

public class ImperativeAndDeclarativeRunner {
    public static void main(String[] args) {
        //Imperative style of Programming
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Sum using Imperative Approach is " + sum);
        //Declarative style of Programming
        int sum1 = IntStream.rangeClosed(0, 100)
                .sum();

        System.out.println("Sum using declarative approach is " + sum1);
    }
}
