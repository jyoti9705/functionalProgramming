import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodReference {
    static Consumer<Student> studentConsumer = System.out::println;

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);

    }
}
