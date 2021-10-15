import java.util.List;
import java.util.stream.Collectors;

public class StudentFLatMapRunner {
    public static void main(String[] args) {
        List<String> studentAct = StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).collect(Collectors.toList());
        List<List<String>> studentAct1 = StudentDataBase.getAllStudents().stream().map(Student::getActivities).collect(Collectors.toList());
        System.out.println("Using FlatMap " + studentAct);
        System.out.println("Using Map "+studentAct1);
    }
}
