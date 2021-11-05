import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class MinByMaxByExample {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println(studentList.stream().collect(minBy(Comparator.comparing(Student::getName))));

        System.out.println(studentList.stream().collect(maxBy(Comparator.comparing(Student::getName))));
    }
}
