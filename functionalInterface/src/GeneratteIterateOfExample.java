import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class GeneratteIterateOfExample {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Jyoti", "Singh", "Adam", "Julie");
        stringStream.forEach(System.out::println);

        Stream.iterate(1, x -> x * 2).limit(7).forEach(System.out::println);
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier).limit(4).forEach(System.out::println);


    }
}
