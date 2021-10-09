import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> name = (student) -> System.out.print(student.getName());
    static Consumer<Student> activities = (student) -> System.out.println(student.getActivities());

    public static void printName() {
        Consumer<Student> c2 = (student) -> System.out.println(student);
        List<Student> studentsList = StudentDataBase.getAllStudents();
        studentsList.forEach(c2);
    }

    public static void printNameAndActivities() {
        List<Student> studentsList = StudentDataBase.getAllStudents();
        studentsList.forEach(name.andThen(activities));//Consumer Chaining
    }

    public static void printNameAndActivitiesUsingCondition() {
        List<Student> studentsList = StudentDataBase.getAllStudents();
        studentsList.stream().filter(student -> student.getGradeLevel() > 3).filter(student -> student.getGpa()>=3.9).forEach(name.andThen(activities));
    }

    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> {
            System.out.println(s.toUpperCase());
        };

        c1.accept("Jyoti");
       // printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
