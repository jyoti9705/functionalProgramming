import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceRunner {
    public static int performMultiplication(List<Integer> integers) {
        return integers.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationOptional(List<Integer> integers) {
        return integers.stream().reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGPAStudent(List<Student> studentList) {
        return studentList.stream().reduce((a, b) -> a.getGpa() > b.getGpa() ? a : b);
    }

   /* private static int noOfActivities(){
        StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().red
    }*/

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        System.out.println(performMultiplication(numbers));
        System.out.println(performMultiplicationOptional(numbers).isPresent());
        System.out.println(performMultiplicationOptional(numbers).get());
        Optional<Student> s = getHighestGPAStudent(StudentDataBase.getAllStudents());
        if (s.isPresent()) {
            System.out.println(s.get());
        }
    }
}
