import java.util.function.Function;

public class FunctionInterfaceExample {
    static Function<String, String> function = a -> a.toUpperCase();
    static Function<String, String> function1 = a -> a.toUpperCase().concat(" ").concat("Singh");

    public static void main(String[] args) {

        System.out.println(function.andThen(function1).apply("Jyoti")); //Function chaining
        //compose first executes the inner variable passes it to another function and then executes the outer expression
        System.out.println(function.compose(function1).apply("Jyoti"));

    }
}
