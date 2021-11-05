import java.util.List;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class StreamsMappingExample {
    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
        List<String> name = studentList.stream().collect(mapping(Student::getName, toList()));
        System.out.println(name);

    }

}
