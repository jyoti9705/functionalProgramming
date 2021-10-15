import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamsMapExample {
    public static void main(String[] args) {
        //collect student name to list
        List<String> studentNameList = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toList());
        System.out.println(studentNameList);

        Set<String> studentNameSet = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(studentNameSet);
    }
}
