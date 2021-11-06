import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {
    public static void main(String[] args) {
        //sort list of name sin alphabetical order
        List<String> stringList = Arrays.asList("Jyoti", "Adam","Singh","Ankit");

        //Prior Java8
        //Collections.sort(stringList);
       // System.out.println("Sorted using collection.Sort()"+stringList);

        //After Java 8
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted using List.Sort()"+stringList);

    }
}
