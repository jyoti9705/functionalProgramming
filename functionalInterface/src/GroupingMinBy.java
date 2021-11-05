import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.minBy;

public class GroupingMinBy {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        Map<String, Optional<Student>> names = studentList.stream().collect(groupingBy(Student::getGender,minBy(Comparator.comparing(Student::getGpa))));
        System.out.println(names);
    }
}
