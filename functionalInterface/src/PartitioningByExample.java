import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;

public class PartitioningByExample {
    /*
     * Groups the elements in the list that will not match the predicate condition and one which will match the predicate condition
     * */
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        Predicate<Student> studentPredicate = student -> student.getGender().equals("female");
        Map<Boolean, List<Student>> values = studentList.stream().collect(partitioningBy(studentPredicate));
        System.out.println(values);

        // to get number of available processors in a machine
        //System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
