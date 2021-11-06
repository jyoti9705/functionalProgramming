import java.util.Optional;

public class OptionalOrElseExample {
    public static void main(String[] args) {
//orElse
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional1 = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElse("Not Found");
        System.out.println(name);
        String name1 = studentOptional1.map(Student::getName).orElse("Not Found");
        System.out.println(name1);

        //orElseGet
        Optional<Student> studentOptional2 = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String name2 = studentOptional2.map(Student::getName).orElseGet(() -> "Not found");
        System.out.println(name2);

        //orELseThrow
        Optional<Student> studentOptional3 = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String name3 = studentOptional3.map(Student::getName).orElseThrow(() -> new RuntimeException("No Data Found"));
        System.out.println(name3);


    }
}
