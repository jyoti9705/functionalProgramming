import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionStudentExample {
    static Function<List<Student>, Map<String, String>> functionOfNameAndStudent = students -> {
        Map<String, String> map1 = new HashMap<>();
        students.stream().forEach(student -> {
            if (FunctionStudentExample.filterOnlyFemales.test(student)) {
                map1.put(student.getName(), student.getGender());
            }
        });
        return map1;
    };

    static Predicate<Student> filterOnlyFemales = student -> student.getGender().equals("female");

    public static void main(String[] args) {
        System.out.println(functionOfNameAndStudent.apply(StudentDataBase.getAllStudents()));
    }
}
