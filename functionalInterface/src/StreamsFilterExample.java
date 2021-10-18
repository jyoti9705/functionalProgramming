import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {
    public static void main(String[] args) {
        List<Student> femaleStudents = StudentDataBase.getAllStudents().stream().filter(student -> student.getGender().equals("female")).collect(Collectors.toList());
        System.out.println(femaleStudents);
    }
}
