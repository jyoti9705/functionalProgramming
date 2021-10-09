import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void getNameAndActivities() {
        BiConsumer<String, List<String>> nameAndActivitiesConsumer = (a, b) -> System.out.println("Name is ".concat(a).concat(" ").concat("and Activities are ").concat(b.toString()));
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(s -> nameAndActivitiesConsumer.accept(s.getName(), s.getActivities()));
    }

    public static void main(String[] args) {
//        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a.concat(" ").concat(b));
//        biConsumer.accept("Jyoti", "Singh");
//        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiplication is ".concat(String.valueOf(a * b)));
//        // multiply.accept(10, 20);
//        BiConsumer<Integer, Integer> divison = (a, b) -> System.out.println("Divison is ".concat(String.valueOf(a / b)));
//        //divison.accept(20, 10);
//        multiply.andThen(divison).accept(20, 10);
        getNameAndActivities();

    }
}
