import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class StreamsGroupingByCollectorExample {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        Map<String, List<Student>> values = studentList.stream().collect(groupingBy(Student::getGender));
        System.out.println(values);


        Map<String, List<Student>> groupingByExample = studentList.stream().collect(groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(groupingByExample);

        Map<Integer, Map<String, List<Student>>> groupingByExample1 = studentList.stream().collect(groupingBy(Student::getGradeLevel, groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println(groupingByExample1);

        LinkedHashMap<String, Set<Student>> groupingByWith3parameters = studentList.stream().collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        System.out.println(groupingByWith3parameters);

    }
}
