import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        System.out.println("Result is :"+ multiplier.multiply(integerList));
        System.out.println("default method size : "+ multiplier.sizeOfList(integerList));
        System.out.println("static method isEmpty : "+ Multiplier.isEmpty(integerList));
    }
}
