import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

public class GroupingCollectingAndThen {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        Map<String,Student> collectingAndThenExample = studentList.stream().collect(groupingBy(Student::getGender,collectingAndThen(minBy(Comparator.comparing(Student::getGradeLevel)), Optional::get)));
        System.out.println(collectingAndThenExample);
    }
}
