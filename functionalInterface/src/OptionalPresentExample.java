import java.util.Optional;

public class OptionalPresentExample {
    public static void main(String[] args) {
        //isPresent
        Optional<String> n1 = Optional.ofNullable("Jyoti");
        System.out.println(n1.isPresent());

        //ifPresent
        n1.ifPresent(s -> System.out.println(s));
    }
}
