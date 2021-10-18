import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitSkipExample {
    public static Optional<Integer> limit(List<Integer> integerList) {
        return integerList.stream().limit(2).reduce(Integer::sum);
    }

    public static Optional<Integer> skip(List<Integer> integers) {
        return integers.stream().skip(2).reduce(Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(6, 7, 8, 9, 10);
        System.out.println("Limit Result is " + limit(number).get());
        System.out.println("Skip Results are " + skip(number).get());
    }
}
