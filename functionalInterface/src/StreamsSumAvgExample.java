import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.summingDouble;

public class StreamsSumAvgExample {
    public static void main(String[] args) {
        Double sum = StudentDataBase.getAllStudents().stream().collect(summingDouble(Student::getGpa));
        System.out.println("Sum og GPA is : " + sum);

        Double avg = StudentDataBase.getAllStudents().stream().collect(averagingDouble(Student::getGpa));
        System.out.println("Average of GPA is : " + avg);
    }
}
