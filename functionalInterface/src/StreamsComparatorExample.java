import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {
    public static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGPA() {
        return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa)).collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGradeLevel() {
        return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGradeLevel)).collect(Collectors.toList());
    }
    public static List<Student> sortStudentsByGender() {
        return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGender)).collect(Collectors.toList());
    }



    public static void main(String[] args) {
        System.out.println(sortStudentsByName());
        System.out.println(sortStudentsByGPA());
        System.out.println(sortStudentsByGradeLevel());
        System.out.println(sortStudentsByGender());
    }
}
