import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> studentPredicate = (a) -> a.getGradeLevel() >= 3;

    public static void filterStudentByGradeLevel() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if (studentPredicate.test(student)) {
                System.out.println("Student with name ".concat(student.getName()).concat(" ").concat("has grade level ").concat("greater than or equal to 3"));
            }
        });
    }

    public static void main(String[] args) {
        System.out.println();
        filterStudentByGradeLevel();
    }
}
