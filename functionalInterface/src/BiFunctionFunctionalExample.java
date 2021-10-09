import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionFunctionalExample {
    static BiFunction<List<Student>, Predicate<Student>, Map<String, String>> biFunctionMap = ((students, studentPredicate) -> {
        Map<String, String> studentNameGender = new HashMap<>();
        students.forEach(student -> {
            if (studentPredicate.test(student)) {
                studentNameGender.put(student.getName(), student.getGender());
            }
        });
        return studentNameGender;
    });

    public static void main(String[] args) {
        System.out.println(biFunctionMap.apply(StudentDataBase.getAllStudents(), FunctionStudentExample.filterOnlyFemales));
    }
}
