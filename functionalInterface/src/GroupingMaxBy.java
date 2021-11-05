import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

public class GroupingMaxBy {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
       Map<Double, Optional<Student>> maxGpa =  studentList.stream().collect(groupingBy(Student::getGpa,maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(maxGpa);

    }
}
