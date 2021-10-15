import java.util.function.Function;

public class MethodReferenceRunner {
    static Function<String, String> toUpperCase = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCase.apply("JYOTI"));

    }
}
