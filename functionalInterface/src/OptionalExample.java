import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.ofNullable("Hello Jyoti");
        System.out.println(stringOptional.get());

        Optional<String> stringOptional1 = Optional.ofNullable(null);
        System.out.println(stringOptional1);

        Optional<String> stringOptional2 = Optional.of("Using of");
        System.out.println(stringOptional2.get());

       // Optional<String> stringOptional3 = Optional.of(null);
       // System.out.println(stringOptional3);

        System.out.println(Optional.empty());
    }
}
