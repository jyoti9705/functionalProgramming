import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    static Supplier<Student> studentSupplier = () -> {
        return new Student("Jyoti", 1, 7.79, "female", Arrays.asList("Reading ", "Writing", "Coding"));
    };

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        Student newStudent = studentSupplier.get();
        //studentList.add(newStudent);
        System.out.println(newStudent);
    }
}
