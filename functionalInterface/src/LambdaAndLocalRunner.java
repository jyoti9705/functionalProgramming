import java.util.function.Consumer;

public class LambdaAndLocalRunner {
    public static void main(String[] args) {
        //You are not allowed to use same local variable in lambda which is already defined
        int i = 0;
        //below operation not defined
        // Consumer<Integer> c1 = i -> System.out.println(i);

        //You cannot reassign value to already declared local variable in lambda
        //Below method is not allowed
//        Consumer<Integer> c2 = integer -> {
//            i++;
//        }
    }
}
