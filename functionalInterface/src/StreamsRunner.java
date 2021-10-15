import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsRunner {
    public static void main(String[] args) {
        //stream student name and activities in a map
        Map<String, List<String>> nameAndActivitiesMap = StudentDataBase
                .getAllStudents()
                .stream()
                .filter(student -> student.getGender().equals("female"))
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(nameAndActivitiesMap);


        //parallel strams

        Map<String, List<String>> nameAndActivitiesMap1 = StudentDataBase
                .getAllStudents()
                .parallelStream()
                .filter(student -> student.getGender().equals("female"))
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(nameAndActivitiesMap1);

    }
}
