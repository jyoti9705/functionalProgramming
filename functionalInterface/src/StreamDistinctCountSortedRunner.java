import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinctCountSortedRunner {
    public static void main(String[] args) {
        //returns unique elements in the map
       List<String> s1 =  StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println(s1);

        //count of elements in the list
        Long count = StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().count();
        System.out.println(count);

        //sort elements in the list
        List<String> s2 =  StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
        System.out.println(s2);
    }
}
