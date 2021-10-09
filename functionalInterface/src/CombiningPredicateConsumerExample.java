import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CombiningPredicateConsumerExample {
    static Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> studentPredicate1 = student -> student.getGpa() >= 3.9;
    static BiConsumer<String, List<String>> studentListBiConsumer = (name, activities) -> System.out.println(name + " " + activities);
    static Consumer<Student> studentConsumer = student -> {
        if (studentPredicate.and(studentPredicate1).test(student)) {
            studentListBiConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public static void printNameAndActivities() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(studentConsumer);

    }

    public static void main(String[] args) {
        printNameAndActivities();

    }
}
